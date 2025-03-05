# StringBuilder

La clase `StringBuilder` en Java es una alternativa eficiente para la concatenación de cadenas de texto. A diferencia de
la clase `String`, que es inmutable, `StringBuilder` permite modificar el contenido de la cadena sin crear un nuevo
objeto en cada operación.

## Creación de un `StringBuilder`

Para crear un objeto `StringBuilder`, se puede utilizar uno de los siguientes métodos:

* **Constructor sin argumentos**: Crea un objeto vacío con una capacidad inicial de 16 caracteres.
    * ```java
    
        StringBuilder sb = new StringBuilder();
      ```
* **Constructor con capacidad inicial**: Crea un objeto vacío con la capacidad inicial especificada.
    * ```java
    
        StringBuilder sb = new StringBuilder(32);
      ```
* **Constructor con cadena inicial**: Crea un objeto con la cadena especificada y una capacidad adicional de 16
  caracteres.
    * ```java
    
        StringBuilder sb = new StringBuilder("Hola");
      ```

## Métodos de `StringBuilder`

Algunos de los métodos más comunes de la clase `StringBuilder` son los siguientes:

| Método                        | Descripción                                                            |
|-------------------------------|------------------------------------------------------------------------|
| `append(valor)`               | Agrega el valor especificado al final de la cadena.                    |
| `insert(pos, valor)`          | Inserta el valor especificado en la posición indicada.                 |
| `delete(inicio, fin)`         | Elimina los caracteres en el rango especificado.                       |
| `replace(inicio, fin, nuevo)` | Reemplaza los caracteres en el rango especificado con la nueva cadena. |
| `reverse()`                   | Invierte el contenido de la cadena.                                    |
| `length()`                    | Devuelve la longitud de la cadena.                                     |
| `capacity()`                  | Devuelve la capacidad actual de la cadena.                             |
| `toString()`                  | Convierte el `StringBuilder` en una cadena de texto (`String`).        |

## Ejemplo de Uso

A continuación, se presenta un ejemplo de cómo utilizar la clase `StringBuilder` en Java:

```java
public class EjemploStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola, ");
        sb.append("mundo!");
        sb.insert(5, "Java ");
        sb.replace(0, 5, "¡Adiós,");
        sb.delete(5, 10);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
```

La salida de este programa sería:

```
,sóidA!
```

En este ejemplo, se crea un objeto `StringBuilder` con la cadena `"Hola, "` y se realizan varias operaciones de
modificación sobre ella. Al final, se imprime el contenido del `StringBuilder` convertido a una cadena de texto.

El uso de `StringBuilder` es más eficiente que la concatenación de cadenas con el operador `+`, especialmente cuando se
realizan múltiples operaciones de modificación sobre la cadena. Al utilizar `StringBuilder`, se evita la creación
repetida de objetos `String` y se mejora el rendimiento de la aplicación.