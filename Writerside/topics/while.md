# El Ciclo `while` en Java

El ciclo `while` en Java es una estructura de control que se utiliza para repetir un bloque de código mientras una
condición sea verdadera. La sintaxis del ciclo `while` es la siguiente:

```java
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

Donde:

* `condición` es una expresión booleana que se evalúa antes de cada iteración del ciclo.
* El bloque de código entre llaves `{ }` se ejecuta mientras la condición sea verdadera.
* Si la condición es falsa desde el principio, el bloque de código no se ejecuta.

A continuación, se presenta un ejemplo del ciclo `while` en Java:

```java
public class CicloWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

En este ejemplo, se inicializa un contador en cero y se imprime su valor mientras sea menor que 5. Después de cada
iteración, se incrementa el contador en uno. El resultado de este programa sería:

```
Contador: 0
Contador: 1
Contador: 2
Contador: 3
Contador: 4
```

El ciclo `while` es útil cuando se necesita repetir un bloque de código un número indeterminado de veces, siempre y
cuando se cumpla una condición. Es importante tener cuidado con la condición del ciclo para evitar caer en un bucle
infinito, donde el código se ejecuta continuamente sin terminar.

## Las Palabras Clave `break` y `continue`

Dentro de un ciclo `while`, se pueden utilizar las palabras clave `break` y `continue` para controlar el flujo de la
ejecución. Estas palabras clave tienen los siguientes efectos:

* `break`: Termina inmediatamente la ejecución del ciclo y continúa con la siguiente instrucción después del ciclo.
* `continue`: Salta a la siguiente iteración del ciclo, omitiendo el resto del bloque de código actual.

A continuación, se presenta un ejemplo del uso de `break` y `continue` en un ciclo `while`:

```java
public class BreakContinue {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5) {
            contador++;

            if (contador == 2) {
                continue;
            }

            if (contador == 4) {
                break;
            }

            System.out.println("Contador: " + contador);
        }
    }
}
```

En este ejemplo, se utiliza `continue` para saltar la iteración cuando el contador es igual a 2, y `break` para salir
del ciclo cuando el contador es igual a 4. El resultado de este programa sería:

```
Contador: 1
Contador: 3
```

El uso de `break` y `continue` puede ayudar a controlar el flujo de un ciclo `while` y a evitar bucles infinitos o
repetición innecesaria de código.

## Conclusión

El ciclo `while` en Java es una estructura de control que se utiliza para repetir un bloque de código mientras una
condición sea verdadera. Se compone de una condición que se evalúa antes de cada iteración y un bloque de código que se
ejecuta mientras la condición sea verdadera. Es importante tener cuidado con la condición para evitar bucles infinitos.
Además, se pueden utilizar las palabras clave `break` y `continue` para controlar el flujo de la ejecución dentro del
ciclo. El ciclo `while` es una herramienta poderosa para implementar la repetición en un programa Java de forma
controlada y eficiente.