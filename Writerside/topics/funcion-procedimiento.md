# Funciones y Procedimientos

## Funciones

Una función es un bloque de código que realiza una tarea específica y puede devolver un valor. Las funciones son
fundamentales en la programación, ya que permiten organizar el código, hacerlo más legible y reutilizable.
Las funciones pueden recibir parámetros de entrada y devolver un valor de salida. La sintaxis para definir una función
varía según el lenguaje de programación, pero generalmente incluye un nombre, una lista de parámetros y un cuerpo
que contiene el código a ejecutar.

## Procedimientos

Un procedimiento es similar a una función, pero no devuelve un valor. En lugar de eso, realiza una serie de acciones
o cálculos. Los procedimientos son útiles para agrupar tareas relacionadas y evitar la duplicación de código.
Al igual que las funciones, los procedimientos pueden recibir parámetros de entrada, pero no tienen un valor de
retorno.

## Diferencias entre Funciones y Procedimientos en Java

En Java, la principal diferencia entre funciones y procedimientos radica en el hecho de que Java no tiene una
distinción formal entre ambos términos. En Java, todos los bloques de código que realizan tareas específicas se
definen como métodos. Un método puede ser considerado una función si devuelve un valor o un procedimiento si no
devuelve nada. La sintaxis para definir un método en Java es la siguiente:

```java
// Definición de un método que devuelve un valor
public int sumar(int a, int b) {
    return a + b;
}

// Definición de un procedimiento que no devuelve un valor
public void imprimirMensaje(String mensaje) {
    System.out.println(mensaje);
}
```

En el ejemplo anterior, el método `sumar` es una función que devuelve un valor entero, mientras que el método
`imprimirMensaje` es un procedimiento que no devuelve ningún valor. Ambos métodos pueden recibir parámetros de
entrada, pero solo el primero devuelve un valor al llamarlo.

## Ejemplo de Función y Procedimiento en Java

```java
public class EjemploFuncionesProcedimientos {
    // Función que suma dos números y devuelve el resultado
    public int sumar(int a, int b) {
        return a + b;
    }

    // Procedimiento que imprime un mensaje en la consola
    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        EjemploFuncionesProcedimientos ejemplo = new EjemploFuncionesProcedimientos();

        // Llamada a la función
        int resultado = ejemplo.sumar(5, 10);
        System.out.println("Resultado de la suma: " + resultado);

        // Llamada al procedimiento
        ejemplo.imprimirMensaje("Hola, mundo!");
    }
}
```

En este ejemplo, hemos definido una función `sumar` que toma dos enteros como parámetros y devuelve su suma. También
hemos definido un procedimiento `imprimirMensaje` que toma un mensaje como parámetro y lo imprime en la consola.
En el método `main`, llamamos a ambos métodos y mostramos los resultados en la consola.

## Conclusión

Las funciones y procedimientos son conceptos fundamentales en la programación que permiten organizar el código y
reutilizarlo. En Java, todos los bloques de código que realizan tareas específicas se definen como métodos, y la
diferencia entre funciones y procedimientos radica en si devuelven o no un valor. Al comprender cómo funcionan las
funciones y procedimientos, los desarrolladores pueden escribir código más limpio y eficiente.