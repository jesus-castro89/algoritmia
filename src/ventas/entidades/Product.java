package ventas.entidades;

import ventas.logic.InputManager;

import javax.swing.*;

public class Product {

    public String name;
    public String description;
    public double price;
    public int quantity;

    public Product() {

        this.name = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        this.description = JOptionPane.showInputDialog("Ingrese la descripción del producto");
        this.price = InputManager.getDouble("Ingrese el precio del producto");
        this.quantity = InputManager.getInt("Ingrese la cantidad del producto");
    }

    @Override
    public String toString() {
        return "%s - Precio: %.2f - Cantidad: %d".formatted(name, price, quantity);
    }
}
