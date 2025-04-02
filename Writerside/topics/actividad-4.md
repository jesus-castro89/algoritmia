# Actividad 4: Los cuadros mágicos

## Objetivo

El objetivo de esta actividad es que los estudiantes aprendan a crear un cuadro mágico de orden 3, utilizando el método
de la suma de las filas, columnas y diagonales mediante la programación en Java. Los estudiantes también aprenderán a
utilizar la recursión para resolver el problema de manera más eficiente.

## Introducción

Un cuadro mágico es una disposición de números enteros en una cuadrícula, donde la suma de los números en cada fila,
columna y diagonal es la misma. En este caso, se utilizará un cuadro mágico de orden 3, que es una cuadrícula de 3x3.
El objetivo es llenar la cuadrícula con los números del 1 al 9, de tal manera que la suma de cada fila, columna y
diagonal sea igual a 15. Este es un ejemplo clásico de programación recursiva, donde se utiliza la recursión para
resolver el problema de manera más eficiente. La recursión es una técnica de programación donde una función se llama a
sí misma para resolver un problema.

## Actividad

1. Crea la clase `CuadroMagico` en Java.
2. Define un método `crearCuadroMagico` que genere un cuadro mágico de orden 3 (matriz 3x3) utilizando la
   recursión.
3. Implementa un método `imprimirCuadroMagico` que imprima el cuadro mágico en la consola.
4. Implementa un método `verificarCuadroMagico` que verifique si la suma de cada fila, columna y diagonal es igual a un
   número cualquiera (en este caso, 15).
5. Implementa un método `main` que llame a los métodos anteriores y muestre el resultado en la consola.

### El algoritmo

Para crear un cuadro mágico de orden 3, se puede utilizar el siguiente algoritmo:

1. Inicializar una matriz de 3x3 con ceros.
2. Colocar el 1 en la posición media de la fila superior (0, 1).
3. Mover en diagonal arriba-derecha (fila - 1, columna + 1) para colocar el siguiente número.
4. Si la posición está ocupada, mover hacia abajo (fila + 1) para colocar el número.
5. Si se sale del cuadro, continuar por el lado opuesto (fila % 3, columna % 3).
6. Repetir hasta completar los 9 números.
7. Verificar si la suma de cada fila, columna y diagonal es igual a 15.

Para que este algoritmo funciones para una suma diferente a 15, se puede modificar el algoritmo para que se pueda
ingresar un número y que el algoritmo lo utilice para verificar si la suma de cada fila, columna y
diagonal es igual al número ingresado, de la siguiente manera:

```
ALGORITMO CrearCuadroMagico3x3
ENTRADA: Entero n (suma mágica deseada)
SALIDA: Matriz 3x3 (cuadro mágico) o Mensaje de error

// Verificar la condición para la suma mágica
SI n MOD 3 != 0 ENTONCES
    MOSTRAR "La suma mágica debe ser divisible por 3 para un cuadro mágico de 3x3."
    RETORNAR Error
FIN_SI

// Inicializar la matriz 3x3
MATRIZ cuadro[3][3]

// Calcular el número central del cuadro mágico
entero central = n / 3

// Asignar el número central a la celda del medio
cuadro[1][1] = central

// Calcular los otros números basándose en el número central y la suma mágica
// Esta es una de las posibles soluciones para un cuadro mágico de 3x3

cuadro[0][0] = central + 1
cuadro[0][1] = central - 2
cuadro[0][2] = central + 3
cuadro[1][0] = central + 2
cuadro[1][2] = central - 2
cuadro[2][0] = central - 3
cuadro[2][1] = central + 2
cuadro[2][2] = central - 1

// Verificar si la matriz generada es realmente un cuadro mágico
SI NO EsCuadroMagico(cuadro, n) ENTONCES
    MOSTRAR "No se pudo generar un cuadro mágico con la suma dada."
    RETORNAR Error
FIN_SI

// Devolver el cuadro mágico
RETORNAR cuadro

FUNCION EsCuadroMagico(matriz[3][3], suma_magica)
    // Verificar la suma de cada fila
    SI matriz[0][0] + matriz[0][1] + matriz[0][2] != suma_magica ENTONCES RETORNAR Falso
    SI matriz[1][0] + matriz[1][1] + matriz[1][2] != suma_magica ENTONCES RETORNAR Falso
    SI matriz[2][0] + matriz[2][1] + matriz[2][2] != suma_magica ENTONCES RETORNAR Falso

    // Verificar la suma de cada columna
    SI matriz[0][0] + matriz[1][0] + matriz[2][0] != suma_magica ENTONCES RETORNAR Falso
    SI matriz[0][1] + matriz[1][1] + matriz[2][1] != suma_magica ENTONCES RETORNAR Falso
    SI matriz[0][2] + matriz[1][2] + matriz[2][2] != suma_magica ENTONCES RETORNAR Falso

    // Verificar la suma de las diagonales
    SI matriz[0][0] + matriz[1][1] + matriz[2][2] != suma_magica ENTONCES RETORNAR Falso
    SI matriz[0][2] + matriz[1][1] + matriz[2][0] != suma_magica ENTONCES RETORNAR Falso

    RETORNAR Verdadero
FIN_FUNCION
```