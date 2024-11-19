# Pseudocódigo

El pseudocódigo es una forma de representar algoritmos de manera que sean fáciles de entender y de traducir a un
lenguaje de programación. Aunque no es un lenguaje de programación en sí mismo, el pseudocódigo es una herramienta muy
útil para planificar y diseñar programas antes de escribir el código en un lenguaje de programación específico.

## Estructura del pseudocódigo

El pseudocódigo se compone de una serie de instrucciones que describen paso a paso lo que debe hacer un programa. Estas
instrucciones se organizan en bloques de código que representan las diferentes partes del algoritmo. Cada bloque de
código se inicia con una palabra clave que indica el tipo de instrucción que se va a realizar, seguida de una
descripción detallada de la operación que se va a llevar a cabo.

La estructura que usaremos y que debe de seguir el pseudocódigo es la siguiente:

```text
Nombre del algoritmo: <<Nombre del algoritmo>>
Definición de constantes:
    Tipo de Dato: <<Nombre de la constante>> = <<Valor de la constante>>
Definición de variables:
    Tipo de Dato: <<Nombre de la variable>>
1. Inicio
2. <<Instrucciones>>
.
.
n. Fin
```

## Tipos de datos

Los tipos de datos que podemos utilizar en el pseudocódigo son los mismos que en la mayoría de los lenguajes de
programación, y nos permiten almacenar diferentes tipos de información, como números, texto, fechas, etc. Algunos de los
tipos de datos más comunes son:

| Tipo de Dato | Descripción                            |
|--------------|----------------------------------------|
| Entero       | Números enteros, positivos o negativos |
| Real         | Números con decimales                  |
| Carácter     | Letras, números o símbolos             |
| Cadena       | Conjunto de caracteres                 |
| Lógico       | Valores verdadero o falso              |

## Ejemplo de pseudocódigo

A continuación, se muestra un ejemplo de pseudocódigo que calcula el área de un círculo a partir de su radio:

```text
Nombre del algoritmo: Calcular área de un círculo
Definición de constantes:
    Real: PI = 3.1416
Definición de variables:
    Real: radio, area
1. Inicio
2. Escribir "Ingrese el radio del círculo:"
3. Leer radio
4. Hcer area = PI * radio * radio
5. Escribir "El área del círculo es:", area
6. Fin
```

> **Nota:** En este ejemplo, `PI` es una constante que representa el valor de pi, `radio` es la variable que almacena
> el radio del círculo y `area` es la variable que almacena el área calculada. Las instrucciones `Escribir` y `Leer`
> se utilizan para mostrar mensajes en pantalla y leer valores del usuario, respectivamente.

> **Nota:** Para efectos de las constantes, estas siempre se escribirán en mayúsculas y se les asignará un valor que no
> cambiará durante la ejecución del algoritmo. Por su parte, las variables se escribirán en minúsculas y se les asignará
> un valor que puede cambiar durante la ejecución del algoritmo.