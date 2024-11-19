# Instrucciones de los algoritmos

Para los algoritmos tenemos las siguientes instrucciones:

1. **Inicio/Fin**: Marca el inicio y el fin del algoritmo.
2. **Leer**: Permite leer algún dato y almacenarlo dentro de una variable para su posterior uso.
3. **Escribir**: Permite mostrar en pantalla algún dato.
4. **Hacer**: Permite asignar un valor a una variable, ya sea simple o mediante algún cálculo.

## Ejemplo

```text
Nombre del algoritmo: SumaDeNumeros
Definición de variables:
    Entero: num1, num2, suma
Algoritmo:
    1. Inicio
    2. Leer num1
    3. Leer num2
    4. Hacer suma = num1 + num2
    5. Escribir suma
    6. Fin
```

Otro ejemplo sería el siguiente:

```text
Nombre del algoritmo: AreaDeUnCírculo
Definición de constantes:
    Real: PI = 3.1416
Definición de variables:
    Real: radio, area
Algoritmo:
    1. Inicio
    2. Leer radio
    3. Hacer area = PI * radio * radio
    4. Escribir area
    5. Fin
```

## Leer y Escribir

La instrucción `Leer` se utiliza para obtener un valor del usuario y almacenarlo en una variable, mientras que la
instrucción `Escribir` se utiliza para mostrar un valor en pantalla. Estas instrucciones son fundamentales para la
interacción con el usuario y para la visualización de resultados.

Ambas instrucciones pueden usarse para leer o escribir más de una variable o texto, separándolos por comas. Por ejemplo:

```text
Leer a, b, c
Escribir "El resultado es:", resultado
```

En este caso, se leen tres valores y se almacenan en las variables `a`, `b` y `c`, y luego se muestra en pantalla el
mensaje "El resultado es:" seguido del valor de la variable `resultado`.

> **Nota:** Es importante tener en cuenta que las instrucciones `Leer` y `Escribir` son específicas de pseudocódigo y
> pueden variar en otros lenguajes de programación.

> **Nota:** Ambas instrucciones dependen de la definición de variables antes de poder usarlas, en otras palabras, las
> variables deben ser declaradas antes de poder ser utilizadas en las instrucciones `Leer` y `Escribir`.

## Hacer

La instrucción `Hacer` se utiliza para asignar un valor a una variable, ya sea un valor simple o el resultado de una
operación matemática. Por ejemplo:

```text
Hacer suma = num1 + num2
```

En este caso, se asigna a la variable `suma` la suma de los valores almacenados en las variables `num1` y `num2`.

La instrucción `Hacer` es fundamental para realizar cálculos y operaciones en un algoritmo, ya que permite manipular
los valores almacenados en las variables y realizar operaciones matemáticas con ellos.

> **Nota:** La instrucción `Hacer` puede utilizarse para asignar valores a variables de diferentes tipos de datos, como
> enteros, reales, caracteres, etc.

> **Nota:** La instrucción `Hacer` también puede utilizarse para asignar valores arbitrarios a variables, como por
> ejemplo `Hacer x = 10`, donde se asigna el valor 10 a la variable `x`.

## Ejemplo

A continuación, se muestra un ejemplo de un algoritmo que calcula el área de un triángulo a partir de su base y altura:

```text
Nombre del algoritmo: CalcularAreaTriangulo
Definición de variables:
    Real: base, altura, area
Algoritmo:
    1. Inicio
    2. Leer base
    3. Leer altura
    4. Hacer area = (base * altura) / 2
    5. Escribir "El área del triángulo es:", area
    6. Fin
```