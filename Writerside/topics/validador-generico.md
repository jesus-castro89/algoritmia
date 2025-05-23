# Creando un validador genérico en Java

Hemos visto que cuando solicitamos datos mediante `JOptionPane`, estos se devuelven como cadenas de texto, lo que puede
ser un problema si necesitamos trabajar con tipos de datos específicos, como enteros o números de punto flotante. Para
solucionar este problema, podemos crear un validador genérico que convierta las cadenas de texto en el tipo de dato
deseado.

## ¿Qué es un validador genérico?

Un validador genérico es una clase que permite validar y convertir valores de un tipo de dato a otro de forma genérica.
En el caso de Java, podemos crear un validador genérico que convierta cadenas de texto en valores enteros, números de
punto flotante, etc. Y en caso de que la conversión no sea posible, se puede lanzar una excepción o devolver un valor
predeterminado.

## Creando un validador genérico

Para nuestros proyectos, deberemos que crear la clase `ValidationManager` en el paquete `com.tec.validation` y crear
la siguiente clase:

```java
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
```