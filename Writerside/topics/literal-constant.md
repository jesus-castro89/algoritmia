# Literales, Constantes y Variables

## Literales

Los **literales** son valores constantes que se utilizan en un programa. Por ejemplo, los números `1`, `2`, `3`, etc.,
son literales numéricos, mientras que las cadenas de texto `Hola, mundo` son literales de cadena.

En Java, los literales se pueden clasificar en los siguientes tipos:

- **Literales numéricos**: representan valores numéricos enteros o de punto flotante.
- **Literales de cadena**: representan valores de texto.
- **Literales booleanos**: representan valores booleanos `true` o `false`.
- **Literales de caracteres**: representan valores de un solo carácter.
- **Literales nulos**: representan la ausencia de un valor.
- **Literales de arreglos**: representan arreglos de valores.
- **Literales de punto flotante**: representan valores de punto flotante.
- **Literales de punto flotante en notación científica**: representan valores de punto flotante en notación científica.
- **Literales numéricos con formato hexadecimal**: representan valores numéricos en formato hexadecimal.
- **Literales numéricos con formato binario**: representan valores numéricos en formato binario.

A continuación, se muestran algunos ejemplos de literales en Java:

- **Literales numéricos**:
    - `123`: literal entero.
    - `3.14`: literal de punto flotante.
    - `0b1010`: literal binario.
    - `0xFF`: literal hexadecimal.
    - `1.23e-4`: literal de punto flotante en notación científica.
    - `123L`: literal entero largo.
    - `3.14f`: literal de punto flotante simple.

- **Literales de cadena**:
    - `"Hola, mundo"`: literal de cadena.
    - `"Java es un lenguaje de programación"`: literal de cadena.
    - `"123"`: literal de cadena que representa un número.

- **Literales booleanos**:
    - `true`: literal booleano verdadero.
    - `false`: literal booleano falso.

- **Literales de caracteres**:
    - `'a'`: literal de carácter.
    - `'b'`: literal de carácter.
    - `'1'`: literal de carácter numérico.

- **Literales nulos**:
    - `null`: literal nulo.

- **Literales de arreglos**:
    - `{1, 2, 3}`: literal de arreglo de enteros.
    - `{"Hola", "Mundo"}`: literal de arreglo de cadenas.

## Constantes

Las **constantes** son variables cuyo valor no cambia durante la ejecución de un programa. En Java, se pueden declarar
constantes utilizando la palabra clave `final`. Por convención, los nombres de las constantes se escriben en mayúsculas
y separados por guiones bajos (`_`).

Por ejemplo, para declarar una constante que represente el valor de PI, se puede hacer lo siguiente:

```java
public class Constantes {
    public static final double PI = 3.14159;
}
```

En este caso, la constante `PI` se declara como `public static final double PI = 3.14159;`. Esto significa que `PI` es
una constante pública (`public`), estática (`static`), final (`final`) y de tipo `double`. Una vez que se asigna un
valor a la constante `PI`, este no puede cambiar durante la ejecución del programa.

> **Nota**: Las constantes en Java se pueden declarar en cualquier parte del código, pero es común declararlas como
> variables de clase (`static`) para que estén disponibles en todo el programa. También es común declararlas como
> `public` para que puedan ser accedidas desde otras clases.

> **Nota**: La palabra reservada final se utiliza para declarar constantes en Java. Una vez que se asigna un valor a una
> constante o variable final, no se puede cambiar su valor. Las constantes se suelen declarar con letras mayúsculas y
> guiones bajos para separar las palabras, por ejemplo: `PI`, `MAX_VALUE`, `DEFAULT_COLOR`, etc.

Las constantes son útiles para representar valores fijos que se utilizan en múltiples partes de un programa y que no
deben cambiar. Al declarar una constante, se garantiza que su valor permanecerá constante y que no se podrá modificar
accidentalmente.

Las constantes se utilizan comúnmente para representar valores como:

- Valores matemáticos (PI, Euler, etc.).
- Valores de configuración (tamaños de ventana, colores predeterminados, etc.).
- Valores de códigos de error o mensajes de error.
- Valores de configuración de aplicaciones (URLs, rutas de archivos, etc.).
- Valores de configuración de bases de datos (nombres de tablas, nombres de columnas, etc.).
- Valores de configuración de API (claves de acceso, URLs de endpoints, etc.).
- Valores de configuración de seguridad (claves de cifrado, tokens de autenticación, etc.).
- Valores de configuración de servicios externos (URLs de servicios, claves de acceso, etc.).

Al utilizar constantes en un programa, se mejora la legibilidad del código y se facilita la modificación de los valores
fijos en un solo lugar, en caso de que sea necesario realizar cambios en el futuro.

## Variables

Las **variables** son espacios de memoria que se utilizan para almacenar valores en un programa. En Java, las variables
se declaran especificando su tipo y nombre, y opcionalmente se les asigna un valor inicial.

Por ejemplo, para declarar una variable entera llamada `edad` con un valor inicial de `25`, se puede hacer lo siguiente:

```java
int edad = 25;
```

En este caso, la variable `edad` se declara como `int edad = 25;`. Esto significa que `edad` es una variable de tipo
entero (`int`) y se inicializa con el valor `25`. Una vez que se asigna un valor a la variable `edad`, este puede
cambiar durante la ejecución del programa.

> **Nota**: Las variables en Java se pueden declarar en cualquier parte del código y su alcance depende del contexto en
> el que se declaren. Es importante tener en cuenta que las variables locales solo son visibles dentro del bloque de
> código en el que se declaran, mientras que las variables de instancia y de clase son visibles en todo el programa.
> Además, las variables locales deben inicializarse antes de ser utilizadas, de lo contrario, se producirá un error de
> compilación.

> **Nota**: Las variables en Java se pueden declarar con diferentes tipos de datos, como enteros (`int`), flotantes
> (`float`), dobles (`double`), caracteres (`char`), booleanos (`boolean`), cadenas (`String`), etc. Cada tipo de dato
> tiene un tamaño y un rango de valores específico, por lo que es importante elegir el tipo de dato adecuado para cada
> variable.

Las variables se utilizan para almacenar valores temporales en un programa y se pueden utilizar para realizar cálculos,
almacenar resultados intermedios, interactuar con el usuario, etc. Al utilizar variables en un programa, se pueden
realizar operaciones dinámicas y manipular datos de forma eficiente.

### Variables de Instancia o Atributos de Clase

Los **atributos de clase** son variables que se declaran dentro de una clase y representan las propiedades o
características de dicha clase. Los atributos de clase se utilizan para almacenar información sobre los objetos
instanciados a partir de esa clase.

Por ejemplo, en una clase `Persona`, se pueden declarar atributos de clase como `nombre`, `edad` y `genero` para
representar las propiedades de una persona:

```java
public class Persona {
    String nombre;
    int edad;
    char genero;
}
```

En este caso, los atributos de clase `nombre`, `edad` y `genero` se declaran dentro de la clase `Persona`. Estos
atributos se utilizan para almacenar información sobre una persona y son visibles en todos los métodos de la clase.

> **Nota**: Los atributos de clase se declaran dentro de una clase y representan las propiedades o características de
> dicha clase. Estos atributos se utilizan para almacenar información sobre los objetos instanciados a partir de esa
> clase y son visibles en todos los métodos de la clase.

### Variables Locales

Las **variables locales** son variables que se declaran dentro de un método o bloque de código y que solo son visibles
dentro de ese ámbito. Las variables locales se utilizan para almacenar valores temporales y realizar cálculos
específicos en un método.

Por ejemplo, en un método `calcularPromedio`, se pueden declarar variables locales como `suma`, `contador` y `promedio`
para calcular el promedio de una lista de números:

```java
public double calcularPromedio(int[] numeros) {
    int suma = 0;
    int contador = 0;

    for (int numero : numeros) {
        suma += numero;
        contador++;
    }

    double promedio = (double) suma / contador;
    return promedio;
}
```

En este caso, las variables `suma`, `contador` y `promedio` se declaran como variables locales dentro del método
`calcularPromedio`. Estas variables se utilizan para realizar el cálculo del promedio de los números en la lista
`numeros` y solo son visibles dentro de este método.

> **Nota**: Las variables locales se declaran dentro de un método o bloque de código y su alcance está limitado al
> contexto en el que se declaran. Estas variables deben inicializarse antes de ser utilizadas y se destruyen al salir
> del ámbito en el que se declaran.

> **Nota**: Las variables locales se utilizan para almacenar valores temporales y realizar cálculos específicos en un
> método. Estas variables son efímeras y solo existen mientras el método está en ejecución, por lo que no se pueden
> acceder desde otros métodos o clases.

Las variables locales son útiles para almacenar valores temporales y realizar cálculos específicos en un método. Al
utilizar variables locales en un método, se pueden realizar operaciones dinámicas y manipular datos de forma eficiente
sin afectar el estado de otros métodos o clases.

### Variables de Clase o Variables Estáticas

Las **variables de clase** son variables que se declaran con la palabra clave `static` dentro de una clase y que son
compartidas por todos los objetos instanciados a partir de esa clase. Las variables de clase se utilizan para almacenar
información común a todos los objetos de la clase.

Por ejemplo, una variable de clase `contador` se puede utilizar para llevar la cuenta de la cantidad de objetos
instanciados a partir de una clase `Persona`:

```java
public class Persona {
    private static int contador = 0;

    public Persona() {
        contador++;
    }
}
```

En este caso, la variable de clase `contador` se declara como `static int contador = 0;` dentro de la clase `Persona`.

> **Nota**: Las variables de clase se declaran con la palabra clave `static` y se inicializan con un valor
> predeterminado cuando se carga la clase en memoria. Estas variables son compartidas por todos los objetos de la clase
> y se pueden acceder utilizando el nombre de la clase.

> **Nota**: Las variables de clase se utilizan para almacenar información común a todos los objetos de la clase y se
> pueden utilizar para realizar operaciones globales en la clase. Estas variables son útiles para mantener el estado de
> la clase y compartir información entre los objetos de la clase.

Las variables de clase son útiles para almacenar información común a todos los objetos de la clase y para realizar
operaciones globales en la clase. Al utilizar variables de clase en una clase, se pueden mantener el estado de la clase
y compartir información entre los objetos de la clase de forma eficiente.

## Resumen

En este tema, se ha cubierto el concepto de literales, constantes y variables en Java. A continuación, se resumen los
puntos clave:

- Los **literales** son valores constantes que se utilizan en un programa para representar valores numéricos, de cadena,
  booleanos, de caracteres, nulos, de arreglos, de punto flotante, de punto flotante en notación científica, numéricos
  con formato hexadecimal y numéricos con formato binario.
- Las **constantes** son variables cuyo valor no cambia durante la ejecución de un programa. Se declaran con la palabra
  clave `final` y se utilizan para representar valores fijos que no deben cambiar.
- Las **variables** son espacios de memoria que se utilizan para almacenar valores en un programa. Se declaran con un
  tipo y un nombre, y se pueden inicializar con un valor opcional.
- Los **atributos de clases** son variables que se declaran dentro de una clase y representan las propiedades o
  características de dicha clase. Se utilizan para almacenar información sobre los objetos instanciados a partir de esa
  clase.
- Las **variables locales** son variables que se declaran dentro de un método o bloque de código y solo son visibles
  dentro de ese ámbito. Se utilizan para almacenar valores temporales y realizar cálculos específicos en un método.

En resumen, los literales, constantes y variables son elementos fundamentales en la programación en Java y se utilizan
para representar valores constantes y variables en un programa. Al comprender estos conceptos, se puede escribir código
más claro, eficiente y mantenible en Java.