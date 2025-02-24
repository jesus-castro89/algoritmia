# El Operador Ternario en Java

El operador ternario en Java es una forma abreviada de escribir una estructura `if-else` en una sola línea. Este
operador se utiliza para evaluar una expresión y devolver un valor dependiendo de si la expresión es verdadera o falsa.
La sintaxis del operador ternario es la siguiente:

```java
variable = (condición) ? valor_si_verdadero : valor_si_falso;
```

Donde:

* `condición` es la expresión que se evalúa.
* `valor_si_verdadero` es el valor que se asigna a la variable si la condición es verdadera.
* `valor_si_falso` es el valor que se asigna a la variable si la condición es falsa.
* `variable` es la variable a la que se asigna el valor.
* Los dos puntos `:` separan el valor si verdadero del valor si falso.
* Los paréntesis `( )` son opcionales, pero se utilizan para mejorar la legibilidad del código.
* El operador ternario devuelve un valor, por lo que se puede utilizar en cualquier lugar donde se espere un valor.

A continuación, se presenta un ejemplo del operador ternario en Java:

```java
public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 10;
        String mensaje = (numero > 0) ? "El número es positivo" : "El número es negativo";

        System.out.println(mensaje);
    }
}
```

En este ejemplo, se verifica si el número es mayor que cero y se asigna un mensaje dependiendo de si la condición es
verdadera o falsa. El mensaje se imprime en la consola al final.

El operador ternario es una forma concisa de escribir estructuras `if-else` simples y puede mejorar la legibilidad del
código en ciertos casos. Sin embargo, se debe tener cuidado al utilizarlo para no complicar demasiado la lógica del
programa.

## Conclusión

El operador ternario en Java es una forma abreviada de escribir estructuras `if-else` en una sola línea. Permite evaluar
una expresión y devolver un valor dependiendo de si la expresión es verdadera o falsa. El operador ternario puede
mejorar la legibilidad del código en ciertos casos, pero se debe utilizar con moderación para no complicar demasiado la
lógica del programa.