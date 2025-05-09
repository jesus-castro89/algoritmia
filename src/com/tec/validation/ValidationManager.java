package com.tec.validation;

import javax.swing.*;
import java.util.function.Predicate;

public class ValidationManager {

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

    public static <T> T validate(T[] options, String inputMessage, String errorMessage, String windowTitle) {

        T result = null;
        boolean valid = false;
        while (!valid) {
            try {
                result = (T) JOptionPane.showInputDialog(null, inputMessage, windowTitle,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (result == null)
                    throw new IllegalArgumentException();
                valid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, errorMessage, windowTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }

    /**
     * Función que valida la entrada de un tipo de dato específico,
     * y que además cumpla con una condición específica. Un ejemplo de uso
     * es el siguiente:
     * <br>
     * {@code Validator.validate((i) -> i > 0, Integer.class, "Ingrese un número entero positivo",
     * "Número inválido", "Validación de número entero");}
     *
     * @param type Tipo de dato a validar
     * @param condition Condición que debe cumplir el dato
     * @param inputMessage Mensaje de entrada
     * @param errorMessage Mensaje de error
     * @param windowTitle Título de la ventana
     * @return Dato validado
     */
    public static <T> T validate(Class<T> type, Predicate<T> condition, String inputMessage, String errorMessage, String windowTitle) {
        boolean valid = false;
        T result = null;
        while (!valid) {
            try {
                result = validate(type, inputMessage, errorMessage, windowTitle);
                if (!condition.test(result))
                    throw new IllegalArgumentException();
                valid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, errorMessage, windowTitle, JOptionPane.ERROR_MESSAGE);
            }
        }
        return result;
    }
}
