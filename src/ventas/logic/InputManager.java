package ventas.logic;

import javax.swing.*;

public class InputManager {

    public static String getString(String message) {
        String value = "";
        boolean valid = false;
        while (!valid) {
            value = JOptionPane.showInputDialog(message);
            if (value != null && !value.isEmpty()) {
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "El valor no puede estar vacío",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

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

    public static int getQuantity(String message) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = getInt(message);
                if (value < 0) {
                    throw new NumberFormatException();
                }
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser un número positivo",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

    public static double getPrice(String message) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                value = getDouble(message);
                if (value < 0) {
                    throw new NumberFormatException();
                }
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser un número positivo",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }
}
