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

    public void menu() {
        String[] options = {"Agregar producto a la tienda",
                "Agregar producto al carrito",
                "Eliminar producto",
                "Modificar producto",
                "Mostrar carrito",
                "Salir"};
        String option = JOptionPane.showInputDialog(null,
                "Seleccione una opción",
                "Carrito de compras",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]).toString();
        switch (option) {
            case "Agregar producto a la tienda" -> {
                Product product = new Product();
                products.add(product);
                JOptionPane.showMessageDialog(null,
                        "Producto agregado a la tienda",
                        "Agregar producto a la tienda",
                        JOptionPane.INFORMATION_MESSAGE);
                menu();
            }
            case "Agregar producto al carrito" -> {
                boolean validated = false;
                int quantity=0;
                Product product=null;
                if (products.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "No hay productos en la tienda",
                            "Agregar producto al carrito",
                            JOptionPane.ERROR_MESSAGE);
                    menu();
                }
                while (!validated) {
                    product = (Product) JOptionPane.showInputDialog(null,
                            "Seleccione un producto",
                            "Agregar producto al carrito",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            products.toArray(),
                            products.getFirst());
                    if (product == null) {
                        JOptionPane.showMessageDialog(null,
                                "No se seleccionó ningún producto",
                                "Agregar producto al carrito",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        validated = true;
                    }
                }
                validated = false;
                while (!validated) {
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
                }
                addProduct(product, quantity);
                JOptionPane.showMessageDialog(null,
                        "Producto agregado al carrito",
                        "Agregar producto al carrito",
                        JOptionPane.INFORMATION_MESSAGE);
                menu();
            }
        }
    }

    public void addProduct(Product product, int quantity) {

        if (shoppingCart.containsKey(product)) {
            ProductCounter productCounter = shoppingCart.get(product);
            productCounter.quantity = quantity;
        } else {
            shoppingCart.put(product, new ProductCounter(product, quantity));
        }
    }
}
