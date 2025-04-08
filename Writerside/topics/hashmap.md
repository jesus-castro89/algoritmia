# Las tablas hash

En programación, una tabla hash es una estructura de datos que implementa un mapa asociativo, una estructura que puede
asociar claves con valores. Una tabla hash utiliza una función hash para calcular un índice en una matriz de
almacenamiento, desde el cual se pueden encontrar los valores deseados. Las tablas hash son muy eficientes para buscar,
insertar y eliminar elementos.

Dentro de Java, la clase `HashMap` es una implementación de la interfaz `Map` que utiliza una tabla hash para almacenar
los elementos. La clase `HashMap` permite almacenar pares, clave-valor, donde cada clave es única y se utiliza para
acceder al valor asociado. La clase `HashMap` es parte del paquete `java.util` y se utiliza comúnmente en aplicaciones
Java para almacenar y manipular datos de manera eficiente.

## Ventajas de usar HashMap

1. **Rendimiento**: Las operaciones de búsqueda, inserción y eliminación son muy rápidas, con un tiempo promedio de O(
   1).
2. **Flexibilidad**: Permite almacenar cualquier tipo de objeto como clave o valor, siempre y cuando la clave implemente
   correctamente los métodos `hashCode()` y `equals()`.
3. **Manejo de colisiones**: La clase `HashMap` maneja automáticamente las colisiones utilizando una técnica llamada
   encadenamiento, donde cada índice de la tabla hash puede contener múltiples elementos en una lista enlazada.
4. **No ordenado**: No mantiene el orden de los elementos, lo que puede ser una ventaja si no se necesita un orden
   específico.
5. **Capacidad dinámica**: La tabla hash se redimensiona automáticamente cuando se alcanza un cierto umbral de carga,
   lo que permite un uso eficiente de la memoria.
6. **Iteración**: Permite iterar sobre los elementos almacenados utilizando un iterador, lo que facilita el acceso a los
   elementos.

## Desventajas de usar HashMap

1. **No ordenado**: No garantiza el orden de los elementos, lo que puede ser una desventaja si se necesita un orden
   específico.
2. **Uso de memoria**: Puede consumir más memoria que otras estructuras de datos, como listas o arreglos, debido a la
   sobrecarga de la tabla hash y el manejo de colisiones.
3. **Complejidad**: La implementación de la función hash y el manejo de colisiones pueden ser complicados y
   propensos a errores si no se manejan correctamente.
4. **Rendimiento en el peor caso**: En el peor de los casos, las operaciones pueden tener un tiempo de O(n) si hay
   muchas colisiones y todos los elementos se almacenan en la misma lista enlazada.

## Ejemplo de uso de HashMap

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar nombres y edades
        HashMap<String, Integer> map = new HashMap<>();

        // Agregar elementos al HashMap
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Imprimir el HashMap
        System.out.println("HashMap: " + map);

        // Obtener un valor utilizando una clave
        int age = map.get("Alice");
        System.out.println("Edad de Alice: " + age);

        // Verificar si una clave existe
        if (map.containsKey("Bob")) {
            System.out.println("Bob está en el HashMap.");
        }

        // Eliminar un elemento del HashMap
        map.remove("Charlie");
        System.out.println("HashMap después de eliminar a Charlie: " + map);
    }
}
```

## Funciones importantes de HashMap

| Función                            | Descripción                                                                                                                    |
|------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| `put(key, value)`                  | Agrega un par clave-valor al HashMap. Si la clave ya existe, actualiza el valor.                                               |
| `get(key)`                         | Devuelve el valor asociado a la clave especificada. Si la clave no existe, devuelve `null`.                                    |
| `remove(key)`                      | Elimina el par clave-valor asociado a la clave especificada.                                                                   |
| `containsKey(key)`                 | Verifica si la clave especificada existe en el HashMap.                                                                        |
| `size()`                           | Devuelve el número de pares clave-valor en el HashMap.                                                                         |
| `clear()`                          | Elimina todos los pares clave-valor del HashMap.                                                                               |
| `putIfAbsent(key, value)`          | Agrega el par clave-valor solo si la clave no existe en el HashMap.                                                            |
| `replace(key, value)`              | Reemplaza el valor asociado a la clave especificada. Si la clave no existe, no hace nada.                                      |
| `replace(key, oldValue, newValue)` | Reemplaza el valor asociado a la clave especificada solo si el valor proporcionado (oldValue) es el mismo que el especificado. |

## Conclusión

Las tablas hash son una herramienta poderosa en programación que permite almacenar y manipular datos de manera
eficiente. La clase `HashMap` de Java es una implementación comúnmente utilizada que ofrece un rendimiento rápido y
flexible. Sin embargo, es importante tener en cuenta sus desventajas y limitaciones al elegir la estructura de datos
adecuada para una tarea específica. Al comprender cómo funcionan las tablas hash y cómo utilizarlas correctamente,
los programadores pueden aprovechar al máximo su potencial en sus aplicaciones.