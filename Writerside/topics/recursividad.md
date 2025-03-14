# La Recursividad en la programación

La recursividad es un concepto fundamental en la programación que se refiere a la capacidad de una función de llamarse a
sí misma. En este artículo, exploraremos qué es la recursividad, cómo funciona y cómo se implementa en Java.

## ¿Qué es la Recursividad?

La recursividad es un concepto en programación en el que una función se llama a sí misma para resolver un problema. En
otras palabras, una función recursiva es aquella que se define en términos de sí misma. La recursividad se basa en la
idea de dividir un problema en subproblemas más pequeños y resolverlos de forma recursiva.

## Características de la Recursividad

La recursividad tiene las siguientes características:

* **Llamada a sí misma**: Una función recursiva se llama a sí misma dentro de su definición.
* **Caso Base**: Una función recursiva debe tener un caso base que detenga la recursión.
* **División del Problema**: La recursividad se basa en la idea de dividir un problema en subproblemas más pequeños y
  resolverlos de forma recursiva.
* **Pila de Llamadas**: Cada llamada recursiva se agrega a la pila de llamadas, lo que puede llevar a un desbordamiento
  de pila si no se maneja correctamente.
* **Eficiencia**: La recursividad puede ser menos eficiente que las soluciones iterativas en algunos casos, ya que
  implica múltiples llamadas a la función.
* **Legibilidad**: La recursividad puede hacer que el código sea más legible y conciso en comparación con las soluciones
  iterativas.
* **Problemas Recursivos**: Algunos problemas son naturalmente recursivos y se pueden resolver de forma más sencilla con
  la recursividad.
* **Problemas Iterativos**: No todos los problemas son adecuados para la recursividad, y en algunos casos, las
  soluciones iterativas pueden ser más apropiadas.
* **Memoria**: La recursividad puede consumir más memoria que las soluciones iterativas, ya que cada llamada recursiva
  agrega una nueva entrada en la pila de llamadas.
* **Profundidad de Recursión**: La profundidad de recursión es el número máximo de llamadas recursivas que se pueden
  realizar antes de que se produzca un desbordamiento de pila.

## ¿Cómo saber si un problema es recursivo?, o, ¿Cuándo usar la recursividad?

La recursividad es una técnica poderosa que se puede utilizar para resolver una amplia variedad de problemas. Algunas
señales de que un problema puede ser resuelto de forma recursiva son:

* El problema se puede dividir en subproblemas más pequeños que son similares al problema original.
* El problema se puede resolver de forma más sencilla si se resuelve un caso base y luego se aplica la recursión a los
  subproblemas restantes.
* El problema debe de tener un caso limitante que detenga la recursión ya que de lo contrario se producirá un
  desbordamiento de pila.

En general, la recursividad es útil cuando un problema se puede dividir en subproblemas más pequeños y similares al
problema original. Sin embargo, no todos los problemas son adecuados para la recursividad, y en algunos casos, las
soluciones iterativas pueden ser más apropiadas.

## Ejemplo de Recursividad en Java

A continuación, se muestra un ejemplo de una función recursiva en Java que calcula la potencia de un número:

```java
public class Recursividad {

    public static void main(String[] args) {
    
        int base = 2;
        int exponente = 3;
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    public static int potencia(int base, int exponente) {
    
        if (exponente == 0) {
        
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
```

Analicemos el código anterior:

* La función `potencia` es una función recursiva que calcula la potencia de un número `base` elevado a un número
  `exponente`.
* La función tiene un caso base que detiene la recursión cuando el exponente es igual a cero.
* Si el exponente es mayor que cero, la función se llama a sí misma con un exponente menor y multiplica el resultado
  por la base. Y este proceso se repite hasta que el exponente llega a cero.
* Finalmente, el resultado se devuelve como el resultado de la potencia.
* En el método `main`, se llama a la función `potencia` con una base de 2 y un exponente de 3, y se imprime el resultado
  en la consola.
* La salida del programa será `2 elevado a la 3 es igual a 8`.

Este es un ejemplo sencillo de cómo se puede utilizar la recursividad para resolver un problema en Java. La recursividad
es una técnica poderosa que se puede utilizar para resolver una amplia variedad de problemas de forma elegante y
concisa.

## Conclusión

La recursividad es un concepto fundamental en la programación que se basa en la idea de que una función puede llamarse a
sí misma para resolver un problema. La recursividad se utiliza para dividir un problema en subproblemas más pequeños y
resolverlos de forma recursiva. Si se utiliza correctamente, la recursividad puede hacer que el código sea más legible y
conciso, y puede ser una herramienta poderosa para resolver una amplia variedad de problemas.