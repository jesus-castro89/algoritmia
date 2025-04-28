package ventas.logic;


import tables.Fruit;
import ventas.entidades.Product;
import ventas.entidades.ProductCounter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    public ArrayList<Product> products;
    public HashMap<Product, ProductCounter> shoppingCart;

    public Shop() {
        this.shoppingCart = new HashMap<>();
        this.products = new ArrayList<>();
    }

    public void addProduct() {

        Product product;
        boolean validated = false;
        do {
            product = new Product();
            for (Product p : products) {

                if (p.name.equals(product.name)) {

                    JOptionPane.showMessageDialog(null,
                            "El producto ya existe",
                            "Agregar producto a la tienda",
                            JOptionPane.ERROR_MESSAGE);
                    validated = false;
                    break;
                } else {
                    validated = true;
                }
            }
            if (!validated) {
                JOptionPane.showMessageDialog(null,
                        "El producto ya existe",
                        "Agregar producto a la tienda",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                products.add(product);
                JOptionPane.showMessageDialog(null,
                        "Producto agregado a la tienda",
                        "Agregar producto a la tienda",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (!validated);
    }

    public void addProductoToShoppingCart() {

        Product product;
        int quantity = 0;
        boolean validated = false;
        do {
            product = selectProductFromArray(products.toArray(new Product[0]));
            if (shoppingCart.containsKey(product)) {
                JOptionPane.showMessageDialog(null,
                        "El producto ya está en el carrito",
                        "Agregar producto al carrito",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }
            quantity = InputManager.getInt("Ingrese la cantidad a comprar");
            if (quantity > product.quantity) {
                JOptionPane.showMessageDialog(null,
                        "No hay suficiente cantidad de este producto",
                        "Agregar producto al carrito",
                        JOptionPane.ERROR_MESSAGE);
            } else if (quantity <= 0) {
                JOptionPane.showMessageDialog(null,
                        "La cantidad debe ser mayor a 0",
                        "Agregar producto al carrito",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                validated = true;
            }
        } while (!validated);
        shoppingCart.put(product, new ProductCounter(product, quantity));
        JOptionPane.showMessageDialog(null,
                "Producto agregado al carrito",
                "Agregar producto al carrito",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void removeProduct() {

        Product product;
        boolean validated = false;
        if (products.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "No hay productos en la tienda",
                    "Eliminar producto de la tienda",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            do {
                product = selectProductFromArray(products.toArray(new Product[0]));
                if (product == null) {

                    JOptionPane.showMessageDialog(null,
                            "No se seleccionó ningún producto",
                            "Eliminar producto de la tienda",
                            JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                if (shoppingCart.containsKey(product)) {

                    JOptionPane.showMessageDialog(null,
                            "El producto está en el carrito",
                            "Eliminar producto de la tienda",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    validated = true;
                }
            } while (!validated);
            products.remove(product);
            JOptionPane.showMessageDialog(null,
                    "Producto eliminado de la tienda",
                    "Eliminar producto de la tienda",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void removeProductFromShoppingCart() {

        Product product;
        boolean validated = false;
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay productos en el carrito",
                    "Eliminar producto del carrito",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            do {
                product = selectProductFromArray(shoppingCart.keySet().toArray(new Product[0]));
                if (product == null) {
                    JOptionPane.showMessageDialog(null,
                            "No se seleccionó ningún producto",
                            "Eliminar producto del carrito",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    validated = true;
                }
            } while (!validated);
            shoppingCart.remove(product);
            JOptionPane.showMessageDialog(null,
                    "Producto eliminado del carrito",
                    "Eliminar producto del carrito",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updateBuyQuantity() {

        ProductCounter product;
        int newQuantity;
        if (shoppingCart.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay productos en el carrito",
                    "Actualizar cantidad de compra",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            do{
                product = (ProductCounter) JOptionPane.showInputDialog(null,
                        "Seleccione un producto",
                        "Actualizar cantidad de compra",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        shoppingCart.values().toArray(),
                        shoppingCart.values().toArray()[0]);
                if (product == null) {
                    JOptionPane.showMessageDialog(null,
                            "No se seleccionó ningún producto",
                            "Actualizar cantidad de compra",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (product == null);
            do {
                newQuantity = InputManager.getInt("Ingrese la nueva cantidad a comprar");
                if (newQuantity > product.product.quantity) {
                    JOptionPane.showMessageDialog(null,
                            "No hay suficiente cantidad de este producto",
                            "Actualizar cantidad de compra",
                            JOptionPane.ERROR_MESSAGE);
                } else if (newQuantity <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "La cantidad debe ser mayor a 0",
                            "Actualizar cantidad de compra",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (newQuantity > product.quantity || newQuantity <= 0);
            product.quantity = newQuantity;
            JOptionPane.showMessageDialog(null,
                    "Cantidad actualizada",
                    "Actualizar cantidad de compra",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updateStock() {

        Product product;
        int newStock;
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay productos en la tienda",
                    "Actualizar stock",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            product = selectProductFromArray(products.toArray(new Product[0]));
            do {
                newStock = InputManager.getInt("Ingrese la nueva cantidad de stock");
                if (newStock < 0 || newStock < product.quantity) {
                    JOptionPane.showMessageDialog(null,
                            "La cantidad de stock no puede ser negativa, ni menor a la cantidad actual",
                            "Actualizar stock",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (newStock < product.quantity);
            product.quantity = newStock;
            JOptionPane.showMessageDialog(null,
                    "Stock actualizado",
                    "Actualizar stock",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updatePrice() {

        Product product;
        double newPrice;
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay productos en la tienda",
                    "Actualizar precio",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            product = selectProductFromArray(products.toArray(new Product[0]));
            do {
                newPrice = InputManager.getDouble("Ingrese el nuevo precio");
                if (newPrice < 0) {
                    JOptionPane.showMessageDialog(null,
                            "El precio no puede ser negativo",
                            "Actualizar precio",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (newPrice < 0);
            product.price = newPrice;
            JOptionPane.showMessageDialog(null,
                    "Precio actualizado",
                    "Actualizar precio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void sellProduct() {

        if (shoppingCart.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No hay productos en el carrito",
                    "Vender producto",
                    JOptionPane.ERROR_MESSAGE);
        }else {
            shoppingCart.values().forEach(ProductCounter::sellProduct);
            shoppingCart.clear();
        }
    }

    public Product selectProductFromArray(Product[] products) {

        Product product;
        boolean validated = false;
        do {
            product = (Product) JOptionPane.showInputDialog(null,
                    "Seleccione un producto",
                    "Agregar producto al carrito",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    products,
                    products[0]);
            if (product == null)
                JOptionPane.showMessageDialog(null,
                        "No se seleccionó ningún producto",
                        "Agregar producto al carrito",
                        JOptionPane.ERROR_MESSAGE);
            else
                validated = true;
        } while (!validated);
        return product;
    }
}
