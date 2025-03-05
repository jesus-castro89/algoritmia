# Cadenas con Formato en Java y Bloque de texto

Las cadenas con formato en Java son una forma de crear cadenas de texto con valores dinámicos. Esto permite combinar
texto fijo con valores variables, como números, fechas o cualquier otro tipo de dato. Las cadenas con formato son útiles
para generar mensajes personalizados, formatear la salida de datos o construir textos dinámicos.

## La Clase función `String.format()`

En Java, la clase `String` proporciona un método estático llamado `format()` que permite crear cadenas con formato. La
sintaxis de este método es la siguiente:

```java
String resultado = String.format(formato, argumentos);
```

Donde:

* `formato` es una cadena que define el formato de la salida.
* `argumentos` son los valores que se insertarán en el formato.
    * Los argumentos pueden ser de cualquier tipo de dato y se insertan en el orden en que aparecen en la cadena de
      formato.
    * El formato de los argumentos se controla mediante especificadores de formato, que se indican con `%` seguido de
      un carácter que define el tipo de dato y el formato de presentación.
    * Los parámetros deben coincidir con los especificadores de formato en cantidad y tipo. De lo contrario, se
      producirá una excepción en tiempo de ejecución.
* `resultado` es la cadena con formato resultante.

## Especificadores de Formato

Los especificadores de formato se utilizan para controlar la presentación de los valores en la cadena de salida. Algunos
de los especificadores de formato más comunes son los siguientes:

| Especificador | Tipo de Dato | Descripción     |
|---------------|--------------|-----------------|
| `%s`          | String       | Cadena de texto |
| `%d`          | int          | Número entero   |
| `%f`          | float        | Número decimal  |
| `%b`          | boolean      | Valor booleano  |
| `%c`          | char         | Carácter        |
| `%t`          | Date         | Fecha y hora    |
| `%n`          | -            | Salto de línea  |
| `%%`          | -            | Carácter `%`    |

## Modificadores de Formato

Además de los especificadores de formato, se pueden utilizar modificadores para controlar la presentación de los
valores. Algunos de los modificadores más comunes son los siguientes:

| Modificador | Descripción               |
|-------------|---------------------------|
| `%.nf`      | Número de decimales       |
| `%[n]s`     | Longitud mínima           |
| `%-[n]s`    | Alineación a la izquierda |
| `%[0]nd`    | Enteros con ceros         |
| `%,[.nf]f`  | Separador de miles        |

## Ejemplos de Cadenas con Formato

A continuación, se presentan algunos ejemplos de cadenas con formato en Java:

```java
public class CadenasFormato {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 30;
        float altura = 1.75f;

        String mensaje = String.format("Hola, %s. Tienes %d años y mides %.2f metros de altura.", nombre, edad, altura);
        System.out.println(mensaje);

        int numero = 12345;
        String numeroFormateado = String.format("El número es: %,d", numero);
        System.out.println(numeroFormateado);

        float precio = 1234.56f;
        String precioFormateado = String.format("El precio es: $%,.2f", precio);
        System.out.println(precioFormateado);
    }
}
```

En este ejemplo, se utilizan diferentes especificadores y modificadores de formato para crear cadenas con valores
dinámicos. El resultado de este programa sería:

```java
Hola, Juan. Tienes 30 años y mides 1.75 metros de altura.
El número es: 12,345
El precio es: $1,234.56
```

Las cadenas con formato en Java son una herramienta poderosa para crear mensajes personalizados y formatear la salida de
datos de manera clara y legible. Al utilizar especificadores y modificadores de formato, es posible controlar la
presentación de los valores de forma precisa y detallada.

### Los bloques de texto en Java

Los bloques de texto en Java son una característica introducida en Java 13 que permite definir cadenas de texto
multilínea de forma más legible y concisa. Los bloques de texto se delimitan con tres comillas dobles (`"""`) y pueden
contener saltos de línea y comillas simples y dobles sin necesidad de escaparlas.

A continuación, se presenta un ejemplo de un bloque de texto en Java:

```java
public class BloqueTexto {
    public static void main(String[] args) {
        String texto = """
                      Este es un bloque de texto
                      que contiene múltiples líneas
                      y comillas simples ' y dobles ".
                      """;
        System.out.println(texto);
    }
}
```

En este ejemplo, se define un bloque de texto con tres líneas y se imprime en la consola. Los bloques de texto son
útiles para escribir cadenas de texto largas y legibles, sin la necesidad de concatenar múltiples líneas o escapar
caracteres especiales.

Los bloques de texto en Java son una característica conveniente que facilita la escritura y lectura de cadenas de texto
multilínea. Al utilizar bloques de texto, es posible definir cadenas largas y complejas de forma más clara y concisa,
mejorando la legibilidad y mantenibilidad del código.

### Bloques de texto y cadenas con formato

Los bloques de texto en Java también se pueden combinar con cadenas con formato para crear mensajes personalizados y
legibles. Al utilizar bloques de texto para definir la estructura del mensaje y cadenas con formato para insertar
valores dinámicos, es posible generar mensajes complejos de forma clara y concisa.

A continuación, se presenta un ejemplo de un mensaje personalizado utilizando un bloque de texto y una cadena con
formato en Java:

```java
public class MensajePersonalizado {
    public static void main(String[] args) {
        String nombre = "María";
        int edad = 25;
        float altura = 1.65f;

        String mensaje = """
                        Hola, %s.
                        Te damos la bienvenida a nuestro sitio.
                        Esperamos que disfrutes tu estancia.
                        
                        Detalles del perfil:
                        - Edad: %d años
                        - Altura: %.2f metros
                        """;

        String mensajePersonalizado = String.format(mensaje, nombre, edad, altura);
        System.out.println(mensajePersonalizado);
    }
}
```

En este ejemplo, se define un bloque de texto con la estructura del mensaje y se utiliza una cadena con formato para
insertar los valores dinámicos. Al combinar bloques de texto y cadenas con formato, es posible crear mensajes
personalizados de forma clara y legible, mejorando la experiencia del usuario y la mantenibilidad del código.

> Los bloques de texto y las cadenas con formato son herramientas poderosas para generar mensajes personalizados y
> formatear la salida de datos en Java. Al utilizar estas características de forma combinada, es posible crear mensajes
> complejos y detallados de manera clara y concisa, mejorando la legibilidad y mantenibilidad del código.

> Los bloques de texto con formato en Java empezaron a ser soportados a partir de la versión 13 de Java. Si estás
> utilizando una versión anterior, es posible que esta característica no esté disponible. Asegúrate de utilizar una
> versión compatible de Java para aprovechar al máximo las funcionalidades más recientes.

## Conclusión

Las cadenas con formato en Java son una forma poderosa de crear mensajes personalizados y formatear la salida de datos
de manera clara y legible. Al utilizar especificadores y modificadores de formato, es posible controlar la presentación
de los valores de forma precisa y detallada, mejorando la experiencia del usuario y la mantenibilidad del código.