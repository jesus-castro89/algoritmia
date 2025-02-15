# Variables

Las variables son elementos fundamentales en la programación, ya que permiten almacenar y manipular datos en la memoria
de un programa. En C++, una variable es un espacio de memoria con un nombre asociado que se utiliza para almacenar un
valor de un determinado tipo de dato.

## Declaración de variables

Para declarar una variable en C++, se utiliza la siguiente sintaxis:

```c++
tipoDato nombre;
```

Donde:

- `tipoDato` es el tipo de dato de la variable.
- `nombre` es el nombre de la variable.
- `;` es el punto y coma que indica el final de la declaración.

Por ejemplo, para declarar una variable de tipo entero con el nombre `numero`, se puede hacer lo siguiente:

```c++
int numero;
```

En este caso, `numero` es una variable de tipo entero.

## Inicialización de variables

Para inicializar una variable en C++, se puede hacer en la misma línea de declaración de la variable o en una línea
posterior. La inicialización de una variable consiste en asignarle un valor en el momento de su creación.

Por ejemplo, para declarar e inicializar una variable de tipo entero con el valor `10`, se puede hacer lo siguiente:

```c++
int numero = 10;
```

En este caso, `numero` es una variable de tipo entero con el valor `10`.

## Asignación de valores a variables

Para asignar un valor a una variable en C++, se utiliza el operador de asignación `=`. Por ejemplo, para asignar el
valor
`20` a la variable `numero`, se puede hacer lo siguiente:

```c++
numero = 20;
```

En este caso, la variable `numero` tendrá el valor `20`.

## Convenciones de Nomenclatura

En C++, existen varias convenciones de nomenclatura que se utilizan comúnmente en la programación. Algunas de las más
comunes son:

- **Camel Case**: En este estilo, las palabras se escriben en minúsculas y la primera letra de cada palabra, excepto la
  primera, se escribe en mayúscula. Por ejemplo, `nombreDeVariable`.
- **Snake Case**: En este estilo, las palabras se escriben en minúsculas y se separan con guiones bajos `_`. Por
  ejemplo,
  `nombre_de_variable`. Nosotros usaremos `snake_case` en este curso.
- **Pascal Case**: En este estilo, las palabras se escriben en mayúsculas y la primera letra de cada palabra se escribe
  en
  mayúscula. Por ejemplo, `NombreDeVariable`.
- **Kebab Case**: En este estilo, las palabras se escriben en minúsculas y se separan con guiones `-`. Por ejemplo,
  `nombre-de-variable`.

## Reglas Generales

Al nombrar variables, funciones y otros elementos en C++, se deben seguir las siguientes reglas generales:

- El nombre debe comenzar con una letra o un guion bajo `_`.
- El nombre puede contener letras, dígitos y guiones bajos.
- El nombre no puede contener espacios en blanco ni caracteres especiales.
- El nombre distingue entre mayúsculas y minúsculas. Por ejemplo, `numero` y `Numero` son nombres diferentes.
- El nombre no puede ser una palabra reservada del lenguaje C++.
- El nombre debe ser descriptivo y representar el propósito del elemento. Por ejemplo, `numero` es un nombre descriptivo
  para una variable que almacena un número.
- El nombre debe ser corto y conciso, pero lo suficientemente descriptivo como para entender su propósito. Por ejemplo,
  `num` es un nombre corto, pero poco descriptivo, mientras que `numero_de_alumnos` es un nombre más descriptivo.
- El nombre debe seguir una convención de nomenclatura consistente. En nuestro caso, usaremos `snake_case`.
- El nombre debe ser significativo y representar el contenido del elemento. Por ejemplo, si una variable almacena la
  edad de una persona, se puede nombrar `edad`.
- El nombre debe ser único dentro del ámbito en el que se declara. Es decir, no se pueden declarar dos elementos con el
  mismo nombre en el mismo ámbito. Si se necesita utilizar el mismo nombre en diferentes ámbitos, se debe utilizar un
  nombre diferente para cada elemento.

## Ventajas de Seguir las Reglas de Nomenclatura

Seguir las reglas de nomenclatura en C++ tiene varias ventajas, entre las que se encuentran:

- **Legibilidad**: Al seguir una convención de nomenclatura consistente, se facilita la lectura y comprensión del
  código.
- **Consistencia**: Al mantener un estilo de nomenclatura uniforme en todo el código, se mejora la consistencia y la
  claridad del mismo.
- **Colaboración**: Al seguir las mismas reglas de nomenclatura, se facilita la colaboración entre diferentes
  programadores en un proyecto.
- **Mantenimiento**: Al utilizar nombres descriptivos y significativos, se facilita el mantenimiento y la modificación
  del código en el futuro.
- **Documentación implícita**: Al seguir una convención de nomenclatura, se documenta de forma implícita el propósito y
  el contenido de los elementos del código.
- **Facilidad de búsqueda**: Al utilizar nombres descriptivos y consistentes, se facilita la búsqueda de elementos en el
  código.
- **Facilidad de lectura y escritura**: Al seguir reglas de nomenclatura claras, se mejora la legibilidad y la
  comprensión del código, tanto para el programador que lo escribe como para otros que lo leen.
- **Facilidad de mantenimiento**: Al seguir una convención de nomenclatura consistente, se facilita el mantenimiento y
  la actualización del código a lo largo del tiempo.
- **Claridad y calidad del código**: Al seguir reglas de nomenclatura, se mejora la claridad y la calidad del código,
  lo que contribuye a un desarrollo más eficiente y efectivo.
- **Compatibilidad con estándares y herramientas**: Al seguir una convención de nomenclatura común, se garantiza la
  compatibilidad con estándares de codificación y herramientas de desarrollo, lo que facilita el trabajo en equipo y la
  integración de diferentes componentes de software.
- **Facilidad de aprendizaje**: Al seguir reglas de nomenclatura claras y consistentes, se facilita el aprendizaje y la
  comprensión del código para programadores principiantes y experimentados.

En resumen, seguir las reglas de nomenclatura en C++ es fundamental para mantener un código limpio, legible y
consistente, lo que facilita su comprensión, mantenimiento y colaboración en proyectos de desarrollo de software.