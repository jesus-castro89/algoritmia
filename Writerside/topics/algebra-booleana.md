# Algebra Booleana

La **álgebra booleana** es una rama de la matemática y la lógica que trata de las operaciones lógicas y aritméticas en
los valores binarios 0 y 1. Fue inventada por George Boole en el siglo XIX como un sistema de lógica para modelar el
razonamiento humano. La álgebra booleana es fundamental para la informática y la electrónica digital, ya que se utiliza
para diseñar circuitos digitales y programación de computadoras.

## Operaciones básicas

Las operaciones básicas de la álgebra booleana son las siguientes:

| Operación      | Descripción                                                      | Símbolo |
|----------------|------------------------------------------------------------------|---------|
| **Negación**   | Invierte el valor de una variable                                | `!`     |
| **Conjunción** | Devuelve verdadero si ambas variables son verdaderas             | `&&`    |
| **Disyunción** | Devuelve verdadero si al menos una de las variables es verdadera | `       ||`     |

## Leyes de la álgebra booleana

Las leyes del álgebra booleana son reglas que se utilizan para simplificar y manipular expresiones booleanas. Las
principales leyes del álgebra booleana son las siguientes:

1. **Ley de la identidad**: `A + 0 = A` y `A * 1 = A`
2. **Ley de la dominancia**: `A + 1 = 1` y `A * 0 = 0`
3. **Ley de la idempotencia**: `A + A = A` y `A * A = A`
4. **Ley de la complementación**: `A + !A = 1` y `A * !A = 0`
5. **Ley de la absorción**: `A + A * B = A` y `A * (A + B) = A`
6. **Ley de la distribución**: `A * (B + C) = A * B + A * C` y `A + B * C = (A + B) * (A + C)`
7. **Ley de De Morgan**: `!(A * B) = !A + !B` y `!(A + B) = !A * !B`

## Tablas de verdad

Una **tabla de verdad** es una representación visual de todas las posibles combinaciones de valores de las variables en
una expresión booleana y el resultado de la operación.

La tabla de verdad general es la siguiente:

| A | B | A && B | `A || B` | !A |
|---|---|--------|----------|----|
| 0 | 0 | 0 | 0 | 1 |
| 0 | 1 | 0 | 1 | 1 |
| 1 | 0 | 0 | 1 | 0 |
| 1 | 1 | 1 | 1 | 0 |

## Aplicación en algoritmos

La álgebra booleana se utiliza en algoritmos para realizar operaciones lógicas y de comparación. Por ejemplo, en un
algoritmo de búsqueda se puede utilizar la operación de conjunción para verificar si dos condiciones son verdaderas

```text
1. Inicio
2. Leer x, y
3. Si x > 0 && y > 0
4.     Escribir "Ambos números son positivos"
5. Sino
6.     Escribir "Al menos uno de los números es negativo"
7. Fin
```  

En este ejemplo, la operación `x > 0 && y > 0` verifica si tanto `x` como `y` son mayores que cero, y en caso afirmativo
muestra un mensaje en pantalla. Si al menos uno de los números es negativo, se muestra otro mensaje.

El algebra booleana es una herramienta poderosa para la programación y la lógica, ya que permite realizar operaciones
lógicas y de comparación de manera eficiente y precisa.