package arrays;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static {
        UIManager.put("OptionPane.messageFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("OptionPane.buttonFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("TextField.font",
                new Font("Arial", Font.PLAIN, 24));
        UIManager.put("ComboBox.font",
                new Font("Arial", Font.BOLD, 24));
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setNombre("Pan Blanco");
        p1.setPrecio(3.5);
        p1.setExistencia(10);

        Product p2 = new Product();
        p2.setNombre("Pan Integral");
        p2.setPrecio(4.5);
        p2.setExistencia(5);

        Inventory inventory = new Inventory();
        inventory.setNombre("Panadería La Esperanza");
        inventory.addProduct(p1);
        inventory.sellProduct();

        Inventory inventory2 = new Inventory();
        inventory2.setNombre("Panadería La Esperanza 2");
        inventory2.addProduct(p2);
        inventory2.sellProduct();
    }
}