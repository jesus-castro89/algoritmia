package arrays;

import javax.swing.*;
import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();
    String nombre;

    void sellProduct() {

        if (products.isEmpty()) {

            System.out.println("No hay productos en el inventario.");
        } else {
            Product product = (Product) JOptionPane.showInputDialog(null,
                    "Selecciona un producto",
                    "Seleccionar Producto",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    products.toArray(),
                    products.get(0));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos quieres vender?"));
            product.sellItems(quantity);
        }
    }

    void addProduct(Product product) {

        boolean exists = false;
        if (product == null) {
            System.out.println("No se puede agregar un producto nulo.");
        } else {
            for (Product p : products) {
                if (p.getNombre().equals(product.getNombre())) {
                    System.out.println("El producto ya existe en el inventario.");
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                System.out.println("Producto agregado al inventario.");
                products.add(product);
            }
        }
    }

    void removeProduct(Product product) {

        products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
