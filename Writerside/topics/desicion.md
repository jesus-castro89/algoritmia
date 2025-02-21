# La estructura de decisión en Java

La estructura de decisión en Java permite ejecutar un bloque de código si se cumple una condición determinada. En caso
de que la condición no se cumpla, se puede ejecutar otro bloque de código. Existen tres tipos de estructuras de decisión
en Java: `if`, `if-else` y `switch`.

## Estructura `if`

La estructura `if` permite ejecutar un bloque de código si se cumple una condición determinada. La sintaxis de la
estructura `if` es la siguiente:

```java
if (condicion) {
    // Bloque de código a ejecutar si la condición es verdadera
}
```

A continuación, se presenta un ejemplo de la estructura `if` en Java:

```java
public class EstructuraIf {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo");
        }
    }
}
```

En este ejemplo, se verifica si el número es mayor que cero y se imprime un mensaje en la consola si la condición es
verdadera.

## Estructura `if-else`

La estructura `if-else` permite ejecutar un bloque de código si se cumple una condición determinada y otro bloque de
código si la condición no se cumple. La sintaxis de la estructura `if-else` es la siguiente:

```java
if (condicion) {
    // Bloque de código a ejecutar si la condición es verdadera
} else {
    // Bloque de código a ejecutar si la condición es falsa
}
```

A continuación, se presenta un ejemplo de la estructura `if-else` en Java:

```java
public class EstructuraIfElse {
    public static void main(String[] args) {
        int numero = -5;

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
```

En este ejemplo, se verifica si el número es mayor que cero y se imprime un mensaje en la consola dependiendo de si la
condición es verdadera o falsa.

## Estructura `if-else if`

La estructura `if-else if` permite evaluar múltiples condiciones en secuencia y ejecutar un bloque de código si alguna
de las condiciones se cumple. La sintaxis de la estructura `if-else if` es la siguiente:

```java
if (condicion1) {
    // Bloque de código a ejecutar si la condición 1 es verdadera
} else if (condicion2) {
    // Bloque de código a ejecutar si la condición 2 es verdadera
} else {
    // Bloque de código a ejecutar si ninguna de las condiciones anteriores es verdadera
}
```

A continuación, se presenta un ejemplo de la estructura `if-else if` en Java:

```java
public class EstructuraIfElseIf {
    public static void main(String[] args) {
        int numero = 0;

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
```

En este ejemplo, se verifica si el número es mayor que cero, menor que cero o igual a cero y se imprime un mensaje en la
consola dependiendo de la condición que se cumpla.

Toma en cuenta que la estructura `if-else if` puede tener tantas condiciones intermedias como sea necesario.

Por ejemplo, si se desea evaluar si un número es positivo, negativo o cero, se pueden agregar más condiciones
intermedias:

```java
if (numero > 0) {
    System.out.println("El número es positivo");
} else if (numero < 0) {
    System.out.println("El número es negativo");
} else if (numero == 0) {
    System.out.println("El número es cero");
} else {
    System.out.println("El número no es un entero");
}
```

## Estructura `switch`

La estructura `switch` permite evaluar una expresión y ejecutar un bloque de código dependiendo del valor de la
expresión. La sintaxis de la estructura `switch` es la siguiente:

```java
switch (expresion) {
    case valor1:
        // Bloque de código a ejecutar si la expresión es igual a valor1
        break;
    case valor2:
        // Bloque de código a ejecutar si la expresión es igual a valor2
        break;
    default:
        // Bloque de código a ejecutar si la expresión no coincide con ningún caso anterior
}
```

> **Nota:** La palabra clave `break` se utiliza para salir del bloque `switch` una vez se ha ejecutado el código
> correspondiente a un caso.

A continuación, se presenta un ejemplo de la estructura `switch` en Java:

```java
public class EstructuraSwitch {
    public static void main(String[] args) {
        int diaSemana = 1;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
```

En este ejemplo, se evalúa el valor de la variable `diaSemana` y se imprime el nombre del día correspondiente en la
consola.

Sin embargo, en las nuevas versiones de Java, la estructura `switch` ha sido mejorada para permitir el uso de
expresiones más complejas y la eliminación de la palabra clave `break`. A partir de Java 12, se puede utilizar la
estructura `switch` de la siguiente manera:

```java
public class EstructuraSwitchJava12 {
    public static void main(String[] args) {
        int diaSemana = 1;

        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día no válido");
        }
    }
}
```

En este ejemplo, se utiliza la nueva sintaxis de la estructura `switch` introducida en Java 12, que permite simplificar
la escritura del código y eliminar la necesidad de la palabra clave `break`.

## Conclusión

Las estructuras de decisión en Java son fundamentales para controlar el flujo de ejecución de un programa y permiten
realizar acciones condicionales en función de los valores de las variables. Es importante comprender cómo funcionan las
estructuras `if`, `if-else`, `if-else if` y `switch` para poder diseñar programas más complejos y eficientes.

Es recomendable practicar con ejemplos y casos de uso reales para familiarizarse con el uso de las estructuras de
decisión en Java y mejorar las habilidades de programación.

Para más información sobre las estructuras de decisión en Java, se recomienda consultar la documentación oficial de Java
en el siguiente enlace: [Java Documentation](https://docs.oracle.com/en/java/).