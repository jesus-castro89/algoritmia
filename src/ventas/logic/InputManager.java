package ventas.logic;

import javax.swing.*;

public class InputManager {

    public static double getDouble(String message) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = Double.parseDouble(JOptionPane.showInputDialog(message));
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser un número",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

    public static int getInt(String message) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = Integer.parseInt(JOptionPane.showInputDialog(message));
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser un número",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }
}
