package ventas.entidades;

import ventas.logic.InputManager;

import javax.swing.*;

public class Product {

    public String name;
    public String description;
    public double price;
    public int quantity;

    public Product() {

        this.name = InputManager.getString("Ingrese el nombre del producto");
        this.description = InputManager.getString("Ingrese la descripción del producto");
        this.price = InputManager.getPrice("Ingrese el precio del producto");
        this.quantity = InputManager.getQuantity("Ingrese la cantidad del producto en stock");
    }

    @Override
    public String toString() {

        return "%s - Precio: %.2f - Cantidad: %d".formatted(name, price, quantity);
    }

    public void decrementQuantity(int quantity) {

        if (this.quantity >= quantity) {

            this.quantity -= quantity;
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay suficiente stock",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
