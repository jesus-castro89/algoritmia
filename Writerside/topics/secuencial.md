# Estructuras Secuenciales

Dentro de Java, las estructuras secuenciales son aquellas que se ejecutan de manera secuencial, es decir, una tras otra.
En este tipo de estructuras, el flujo de ejecución de un programa sigue un orden específico, en el que cada instrucción
se ejecuta una vez que la anterior ha finalizado.

En general este tipo de estructuras se utilizan para realizar operaciones sencillas, como la lectura de datos, la
realización de cálculos matemáticos, la impresión de resultados, entre otros.

Podemos agrupar las estructuras secuenciales en tres tipos:

1. **Entrada de datos**: En esta estructura se realiza la lectura de datos desde el teclado o desde un archivo.
2. **Procesamiento de datos**: En esta estructura se realizan operaciones matemáticas o lógicas con los datos leídos.
3. **Salida de datos**: En esta estructura se imprime el resultado de las operaciones realizadas.

A continuación, se presentan algunos ejemplos de estructuras secuenciales en Java.

## Ejemplo 1: Entrada de datos

En este ejemplo se muestra cómo leer un número entero desde el teclado y almacenarlo en una variable.

```java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        System.out.println("El número ingresado es: " + numero);
    }
}
```

## Ejemplo 2: Procesamiento de datos

En este ejemplo se muestra cómo realizar una operación matemática con dos números enteros.

```java
public class ProcesamientoDatos {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;
        int suma, resta, multiplicacion, division;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
```

## Ejemplo 3: Salida de datos

En este ejemplo se muestra cómo imprimir un mensaje en la consola.

```java
public class SalidaDatos {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

Estos son solo algunos ejemplos de estructuras secuenciales en Java. Es importante tener en cuenta que en la
programación se pueden combinar diferentes estructuras para lograr un resultado más complejo.

Para más información sobre las estructuras secuenciales en Java, se recomienda consultar la documentación oficial de
Java en el siguiente enlace: [Java Documentation](https://docs.oracle.com/en/java/).

# Conclusiones

Las estructuras secuenciales son fundamentales en la programación, ya que permiten realizar operaciones de manera
ordenada y secuencial. En Java, estas estructuras se utilizan para leer datos, procesarlos y mostrar los resultados.

Es importante tener en cuenta que las estructuras secuenciales son solo una parte de la programación, y que existen
otras estructuras más complejas que permiten realizar tareas más avanzadas.

En resumen, las estructuras secuenciales son la base de la programación y son fundamentales para comprender y dominar
cualquier lenguaje de programación.