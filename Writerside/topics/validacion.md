# Validación de entradas de datos

## Introducción

La validación de datos es un proceso que se realiza para asegurar que los datos introducidos en un sistema son correctos
y útiles. La validación de datos es importante para garantizar la integridad y la calidad de los datos, así como para
prevenir errores y problemas en el sistema.

En Java, la validación de datos se puede realizar de varias maneras. En este artículo, veremos cómo validar datos en
Java utilizando las clases Wrapper y la clase JOptionPane.

## Validación de datos con clases Wrapper

Las clases Wrapper en Java son clases que envuelven tipos de datos primitivos y proporcionan métodos para trabajar con
ellos. Las clases Wrapper también proporcionan métodos para validar datos.

Por ejemplo, para validar un número entero en Java, podemos utilizar la clase `Integer` y su método `parseInt()`. El
método `parseInt()` convierte una cadena en un número entero y lanza una excepción si la cadena no es un número válido.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("El número introducido es: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número entero válido.");
        }
    }
}
```

Analicemos el código anterior:

* Se crea un objeto `Scanner` para leer la entrada del usuario.
* Se solicita al usuario que introduzca un número entero.
* Se lee la entrada del usuario como una cadena.
* Se intenta convertir la cadena en un número entero utilizando el método `parseInt()`.
* Si la conversión tiene éxito, se imprime el número introducido.
* Si la conversión falla (por ejemplo, si el usuario introduce una cadena que no es un número válido), se captura la
  excepción `NumberFormatException` y se imprime un mensaje de error.
* La validación de datos se realiza mediante el uso de excepciones para manejar los casos en los que los datos no son
  válidos.
* Este enfoque es útil para validar datos simples como números enteros, pero puede ser complicado para validar datos
  más complejos.
* En tales casos, se pueden utilizar otras técnicas de validación, como la validación de datos con la clase
  `JOptionPane`.
* La clase `JOptionPane` proporciona métodos para mostrar cuadros de diálogo que permiten al usuario introducir datos y
  validarlos.
* A continuación, veremos cómo validar datos con la clase `JOptionPane`.

## Validación de datos con la clase JOptionPane

La clase `JOptionPane` en Java es una clase que proporciona métodos para mostrar cuadros de diálogo y obtener entrada
del usuario. La clase `JOptionPane` también proporciona métodos para validar datos introducidos por el usuario.

Por ejemplo, para validar un número entero en Java utilizando la clase `JOptionPane`, podemos utilizar el método
`showInputDialog()` para mostrar un cuadro de diálogo que solicite al usuario que introduzca un número entero. Luego,
podemos utilizar el método `parseInt()` de la clase `Integer` para convertir la entrada del usuario en un número entero
y validarla.

```java
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un número entero:");

        try {
            int number = Integer.valueOf(input);
            JOptionPane.showMessageDialog(null, "El número introducido es: " + number);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Introduce un número entero válido.");
        }
    }
}
```

Analicemos el código anterior:

* Se utiliza el método `showInputDialog()` de la clase `JOptionPane` para mostrar un cuadro de diálogo que solicita al
  usuario que introduzca un número entero.
* Se lee la entrada del usuario como una cadena.
* Se intenta convertir la cadena en un número entero utilizando el método `valueOf()` de la clase `Integer`.
* Si la conversión tiene éxito, se muestra un cuadro de diálogo con el número introducido.
* Si la conversión falla (por ejemplo, si el usuario introduce una cadena que no es un número válido), se captura la
  excepción `NumberFormatException` y se muestra un cuadro de diálogo con un mensaje de error.
* La validación de datos se realiza utilizando excepciones para manejar los casos en los que los datos no son válidos.