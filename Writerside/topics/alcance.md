# Alcance de las variables en Java

En Java, el alcance de una variable se refiere a la región del código en la que la variable es visible y puede ser
utilizada. El alcance de una variable está determinado por el bloque de código en el que se declara y puede variar según
el tipo de variable y su contexto.

## Alcance de las variables locales

Las variables locales son aquellas que se declaran dentro de un método, constructor o bloque de código y solo son
visibles dentro de ese ámbito. El alcance de una variable local se extiende desde el punto de declaración hasta el final
del bloque en el que se encuentra.

Por ejemplo, en el siguiente código, la variable `numero` es local al método `sumar` y solo es visible dentro de ese
método:

```java
public class Calculadora {
    public int sumar(int a, int b) {
        int numero = a + b;
        return numero;
    }
}
```

En este caso, la variable `numero` solo es accesible dentro del método `sumar` y no puede ser utilizada en otros métodos
de la clase `Calculadora` o fuera de ella.

## Alcance de las variables de instancia

Las variables de instancia son aquellas que se declaran a nivel de clase y son visibles en todos los métodos de la
clase. El alcance de una variable de instancia se extiende a lo largo de toda la clase y su valor es persistente
mientras la instancia de la clase exista.

Por ejemplo, en el siguiente código, la variable `resultado` es una variable de instancia de la clase `Calculadora` y
puede ser utilizada en cualquier método de la clase:

```java
public class Calculadora {
    private int resultado;

    public void sumar(int a, int b) {
        resultado = a + b;
    }

    public void restar(int a, int b) {
        resultado = a - b;
    }
}
```

En este caso, la variable `resultado` es accesible en los métodos `sumar` y `restar` y su valor se mantiene a lo largo
de la vida de la instancia de la clase `Calculadora`.

## Alcance de las variables de clase

Las variables de clase son aquellas que se declaran con el modificador `static` y son compartidas por todas las
instancias de la clase. El alcance de una variable de clase se extiende a lo largo de toda la clase y su valor es
compartido por todas las instancias de la clase.

Por ejemplo, en el siguiente código, la variable `contador` es una variable de clase de la clase `Calculadora` y puede
ser utilizada por todas las instancias de la clase:

```java
public class Calculadora {
    private static int contador;

    public Calculadora() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
```

En este caso, la variable `contador` es compartida por todas las instancias de la clase `Calculadora` y su valor se
incrementa cada vez que se crea una nueva instancia de la clase.

## Alcance de las variables de parámetro

Las variables de parámetro son aquellas que se utilizan para pasar valores a un método y son locales al método en el
que se declaran. El alcance de una variable de parámetro se extiende desde el punto de declaración hasta el final del
método en el que se encuentra.

Por ejemplo, en el siguiente código, las variables `a` y `b` son parámetros del método `sumar` y solo son visibles
dentro de ese método:

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

En este caso, las variables `a` y `b` solo son accesibles dentro del método `sumar` y no pueden ser utilizadas en otros
métodos de la clase `Calculadora` o fuera de ella.

## Variables de bloque

Las variables de bloque son aquellas que se declaran dentro de un bloque de código y solo son visibles dentro de ese
bloque. El alcance de una variable de bloque se extiende desde el punto de declaración hasta el final del bloque en el
que se encuentra.

Por ejemplo, en el siguiente código, la variable `i` es una variable de bloque que solo es visible dentro del bucle
`for`:

```java
public class Ejemplo {
    public void imprimirNumeros() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
```

En este caso, la variable `i` solo es accesible dentro del bucle `for` y no puede ser utilizada fuera de él.

## Conclusión

El alcance de las variables en Java determina la visibilidad y accesibilidad de las variables en diferentes partes de un
programa. Comprender el alcance de las variables es fundamental para escribir código claro y evitar errores de
referencia o visibilidad. Al seguir las reglas de alcance de las variables, puedes garantizar que tus programas sean
coherentes y fáciles de mantener.