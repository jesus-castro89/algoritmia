# Tipos de Datos en Java

Los tipos de datos en Java son una parte fundamental del lenguaje de programación, ya que permiten almacenar y manipular
información de diferentes tipos. Java es un lenguaje de programación fuertemente tipado, lo que significa que cada
variable debe tener un tipo de dato específico y no puede cambiar de tipo una vez que ha sido declarada.

En Java, los tipos de datos se dividen en dos categorías principales: tipos primitivos y tipos de referencia. Los tipos
primitivos son los tipos de datos básicos que están integrados en el lenguaje, mientras que los tipos de referencia son
objetos que se definen mediante clases y se almacenan en el *heap*. A continuación, veremos los tipos de datos más
comunes en Java y cómo se utilizan en la programación.

## Tipos de Datos Primitivos

Los tipos de datos primitivos en Java son los siguientes:

| Tipo de Dato | Descripción                         | Tamaño  | Rango                                                  |
|--------------|-------------------------------------|---------|--------------------------------------------------------|
| `byte`       | Entero de 8 bits con signo          | 8 bits  | -128 a 127                                             |
| `short`      | Entero de 16 bits con signo         | 16 bits | -32,768 a 32,767                                       |
| `int`        | Entero de 32 bits con signo         | 32 bits | -2,147,483,648 a 2,147,483,647                         |
| `long`       | Entero de 64 bits con signo         | 64 bits | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 |
| `float`      | Número de punto flotante de 32 bits | 32 bits | 1.4e-45 a 3.4e+38                                      |
| `double`     | Número de punto flotante de 64 bits | 64 bits | 4.9e-324 a 1.8e+308                                    |
| `boolean`    | Valor booleano (`true` o `false`)   | 1 bit   | `true` o `false`                                       |
| `char`       | Carácter Unicode de 16 bits         | 16 bits | '\u0000' a '\uffff'                                    |

Los tipos de datos primitivos en Java se utilizan para almacenar valores simples como números enteros, números de punto
flotante, caracteres y valores booleanos. Cada tipo de dato primitivo tiene un tamaño específico en memoria y un rango
de valores que puede almacenar.

## Tipos de Datos de Referencia

Los tipos de datos de referencia en Java son objetos que se definen mediante clases y se almacenan en el *heap*. Algunos
de los tipos de datos de referencia más comunes en Java son:

- `String`: Cadena de caracteres.
- `Array`: Arreglo de elementos.
- `Clase`: Objeto de una clase definida por el programador.
- `Interfaz`: Interfaz que define un conjunto de métodos.
- `Enum`: Enumeración de constantes.

Los tipos de datos de referencia en Java se utilizan para almacenar información más compleja que los tipos primitivos,
como cadenas de caracteres, arreglos de elementos y objetos definidos por el programador. Estos tipos de datos se
almacenan en el *heap* y se acceden mediante referencias.

## Conversión de Tipos de Datos `Casting`

En Java, la conversión de tipos de datos se realiza mediante un proceso llamado *casting*. El *casting* permite
convertir un valor de un tipo de dato a otro tipo compatible. Existen dos tipos de *casting* en Java: *casting
implícito* y *casting explícito*.

- *Casting implícito*: Se realiza de forma automática cuando se asigna un valor de un tipo de dato a otro tipo
  compatible.
  Por ejemplo, asignar un entero a un número de punto flotante.
- *Casting explícito*: Se realiza de forma manual mediante la especificación del tipo de dato entre paréntesis. Por
  ejemplo,
  convertir un número de punto flotante a un entero.

```java
int entero = 10;
double flotante = entero; // Casting implícito de int a double

double flotante = 10.5;
int entero = (int) flotante; // Casting
```

Es importante tener en cuenta que el *casting* puede provocar la pérdida de precisión o la truncación de valores, por lo
que es necesario realizarlo con precaución para evitar errores en el programa.

## Conclusiones

Los tipos de datos en Java son una parte esencial del lenguaje de programación y permiten almacenar y manipular
información de diferentes tipos de forma eficiente. Tanto los tipos de datos primitivos como los tipos de datos de
referencia son fundamentales para el desarrollo de aplicaciones en Java y deben utilizarse de forma adecuada para
garantizar el correcto funcionamiento del programa.