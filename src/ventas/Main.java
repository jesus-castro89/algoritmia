package ventas;

import ventas.entidades.Product;
import ventas.logic.Shop;

import javax.swing.*;
import java.awt.*;

public class Main {

    static{
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

        Shop shop = new Shop();
        shop.menu();
    }
}
