# La clase predefinia `Arrays`

La clase predefinida `Arrays` en Java es una clase que contiene métodos estáticos para trabajar con arreglos.

## Métodos de la clase `Arrays`

### `sort`

El método `sort` de la clase `Arrays` se utiliza para ordenar un arreglo de elementos. Este método recibe como argumento
el arreglo a ordenar y lo ordena en orden ascendente.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

Podemos de igual ordenar de manera inversa un arreglo utilizando el método `sort` de la clase `Arrays` y el método
`reverse` de la clase `Collections`.

```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
```