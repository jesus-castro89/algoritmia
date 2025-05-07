package com.tec.input;

import javax.swing.*;

public class InputManager {

    public static <T> T validate(Class<T> type, String inputMessage, String errorMessage, String windowTitle) {
        String input;
        boolean valid = false;
        T result = null;
        while (!valid) {
            try {
                input = JOptionPane.showInputDialog(null, inputMessage, windowTitle,
                        JOptionPane.QUESTION_MESSAGE);
                if (input == null || input.isEmpty())
                    throw new IllegalArgumentException();
                result = switch (type.getSimpleName()) {
                    case "String" -> (T) input;
                    case "Integer" -> (T) Integer.valueOf(input);
                    case "Double" -> (T) Double.valueOf(input);
                    case "Float" -> (T) Float.valueOf(input);
                    case "Long" -> (T) Long.valueOf(input);
                    case "Short" -> (T) Short.valueOf(input);
                    case "Byte" -> (T) Byte.valueOf(input);
                    case "Boolean" -> (T) Boolean.valueOf(input);
                    case "Character" -> (T) Character.valueOf(input.charAt(0));
                    default -> throw new IllegalArgumentException();
                };
                valid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, errorMessage, windowTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }

    public static <T> T getOption(String message, String title, T[] options) {
        T value = null;
        boolean valid = false;
        while (!valid) {
            value = (T) JOptionPane.showInputDialog(null,
                    message,
                    title,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (value != null) {
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "El valor no puede estar vacío",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

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
