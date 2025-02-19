# La función `main`

En Java, la función `main` es el punto de entrada de un programa. Es el método que se ejecuta cuando se inicia la
aplicación y es el lugar donde comienza la ejecución del código. La función `main` tiene la siguiente firma:

```java
public static void main(String[] args) {
    // Código a ejecutar
}
```

> **Nota**: La función `main` es un método estático (`static`) de la clase principal del programa. En este caso, la
> clase principal puede tener cualquier nombre, pero por convención se suele llamar `Main`. Además, el parámetro `args`
> es un array de cadenas que se utiliza para pasar argumentos a la aplicación desde la línea de comandos. Toma en cuenta
> que pueden existir otros métodos `main` en diferentes clases, pero solo uno de ellos será el punto de entrada del
> programa.

A continuación, se muestra un ejemplo de la función `main` en Java:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
    }
}
```

En este ejemplo, se define una clase `Main` con un método `main` que imprime el mensaje `"Hola, mundo!"` por consola.