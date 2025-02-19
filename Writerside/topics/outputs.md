# Salidas y Entradas de datos en Java

## Salidas de texto en Java

En Java, puedes mostrar salidas de texto en la consola utilizando el método `System.out.println()`. Este método imprime
una cadena de texto seguida de un salto de línea. A continuación, se muestra un ejemplo de cómo utilizar el método
`println()` en Java:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

En este ejemplo, se imprime el mensaje `"Hola, mundo!"` por consola. Puedes utilizar el método `println()` para mostrar
mensajes, resultados de operaciones y cualquier otro tipo de información en la consola.

Además del método `println()`, Java también proporciona el método `System.out.print()`, que imprime una cadena de texto
sin salto de línea. A continuación, se muestra un ejemplo de cómo utilizar el método `print()` en Java:

```java
public class Main {
    public static void main(String[] args) {
        System.out.print("Hola, ");
        System.out.print("mundo!");
    }
}
```

En este ejemplo, se imprime el mensaje `"Hola, mundo!"` sin salto de línea. Puedes utilizar el método `print()` cuando
quieras imprimir varias cadenas de texto en la misma línea.

En resumen, los métodos `println()` y `print()` te permiten mostrar salidas de texto en la consola en Java. Utiliza
estos métodos para comunicar información a los usuarios y depurar tus programas de manera efectiva.

Existen otras variantes de estos métodos, como `printf()` que permite formatear la salida de texto con especificadores
de formato. Puedes explorar estas variantes para adaptar la presentación de tus salidas de texto a tus necesidades.

Además de ellos existen clases visuales que permiten mostrar salidas de texto en ventanas, como `JOptionPane` que
veremos más adelante en el curso.

## Entradas de texto en Java

En Java, puedes leer entradas de texto desde la consola utilizando la clase `Scanner` del paquete `java.util`. La clase
`Scanner` proporciona métodos para leer diferentes tipos de datos, incluidos enteros, decimales y cadenas de texto.

A continuación, se muestra un ejemplo de cómo utilizar la clase `Scanner` para leer una cadena de texto desde la
consola:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);
        // Mostrar un mensaje para solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        // Leer una cadena de texto ingresada por el usuario
        String nombre = scanner.nextLine();
        // Mostrar un saludo personalizado
        System.out.println("Hola, " + nombre + "!");
        // Cerrar el Scanner al finalizar y libera recursos
        scanner.close();
    }
}
```

En este ejemplo, se crea un objeto `Scanner` para leer datos desde la consola. Luego, se utiliza el método `nextLine()`
para leer una cadena de texto ingresada por el usuario. Finalmente, se muestra un saludo personalizado con el nombre
ingresado.

Además del método `nextLine()`, la clase `Scanner` proporciona otros métodos para leer diferentes tipos de datos:

| Método          | Descripción     | Ejemplo                                   |
|-----------------|-----------------|-------------------------------------------|
| `nextInt()`     | Lee un entero   | `int edad = scanner.nextInt();`           |
| `nextDouble()`  | Lee un decimal  | `double precio = scanner.nextDouble();`   |
| `nextBoolean()` | Lee un booleano | `boolean activo = scanner.nextBoolean();` |

Puedes utilizar estos métodos para leer diferentes tipos de datos desde la consola y procesar la información ingresada
por el usuario en tus programas.

En resumen, la clase `Scanner` te permite leer entradas de texto desde la consola en Java. Utiliza esta clase para
interactuar con los usuarios y crear programas interactivos que respondan a la entrada del usuario.

