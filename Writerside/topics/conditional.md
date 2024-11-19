# La condicional

Dentro de algoritmia podemos utilizar la condicional para tomar decisiones en nuestro código. La condicional es una
estructura de control que nos permite evaluar una expresión y ejecutar un bloque de código si la expresión es verdadera.

Para hacer esto usamos la instrucción `Si`, que se escribe de la siguiente manera:

```text
n. Si <expresión> Entonces
     Inicio
        <bloque de código>
     Fin
n+1. <<Otras instrucciones>>
```

> Nota: Las instrucciones `Inicio` y `Fin` son solo para indicar el inicio y fin del bloque de código que se ejecuta si
> la expresión es verdadera. No son instrucciones que se escriban en el código, y sirven para delimitar las
> instrucciones que se ejecutan si la expresión es verdadera.

Donde `<expresión>` es una expresión lógica que se evalúa a verdadero o falso, y `<bloque de código>` es un conjunto de
instrucciones que se ejecutan si la expresión es verdadera.

Por ejemplo, si queremos imprimir un mensaje si un número es mayor que 5, podemos hacerlo de la siguiente manera:

```text
1. Inicio
2. Leer n
3. Si n > 5 Entonces
    Escribir "El número es mayor que 5"  
4. Fin
```

En este caso, si el número ingresado es mayor que 5, se imprimirá el mensaje "El número es mayor que 5".

## Condicional doble

Además de la condicional simple, también podemos utilizar la condicional doble, que nos permite ejecutar un bloque de
código si la expresión es verdadera, y otro bloque de código si la expresión es falsa.

La condicional doble se escribe de la siguiente manera:

```text
n. Si <expresión> Entonces
        Inicio
            <bloque de código 1>
        Fin
    Otro caso
        Inicio
            <bloque de código 2>
        Fin
n+1. <<Otras instrucciones>>
```

Donde `<expresión>` es una expresión lógica que se evalúa a verdadero o falso, `<bloque de código 1>` es un conjunto de
instrucciones que se ejecutan si la expresión es verdadera, y `<bloque de código 2>` es un conjunto de instrucciones que
se ejecutan si la expresión es falsa.

Por ejemplo, si queremos imprimir un mensaje si un número es mayor que 5 y otro mensaje si no lo es, podemos hacerlo de
la siguiente manera:

```text
1. Inicio
2. Leer n
3. Si n > 5 Entonces
        Escribir "El número es mayor que 5"  
   Otro caso
        Escribir "El número no es mayor que 5"
4. Fin
```

En este caso, si el número ingresado es mayor que 5, se imprimirá el mensaje "El número es mayor que 5", y si no lo es,
se imprimirá el mensaje "El número no es mayor que 5".

## Condicional múltiple

Además de la condicional simple y doble, también podemos utilizar la condicional múltiple, que nos permite evaluar
varias expresiones y ejecutar un bloque de código dependiendo de cuál de ellas sea verdadera.

La condicional múltiple se escribe de la siguiente manera:

```text
n. Si <expresión 1> Entonces
        Inicio
            <bloque de código 1>
        Fin
    Otro caso 
        Si <expresión 2> Entonces
            Inicio
                <bloque de código 2>
            Fin
        Otro caso 
            Si <expresión 3> Entonces
                Inicio
                    <bloque de código 3>
                Fin
                ...
                Otro caso
                    Inicio
                        <bloque de código n>
                    Fin
n+1. <<Otras instrucciones>>
```

Donde `<expresión 1>`, `<expresión 2>`, `<expresión 3>`, ..., `<expresión n>` son expresiones lógicas que se evalúan a
verdadero o falso, `<bloque de código 1>`, `<bloque de código 2>`, `<bloque de código 3>`, ..., `<bloque de código n>`
son conjuntos de instrucciones que se ejecutan si la expresión correspondiente es verdadera.

Por ejemplo, si queremos imprimir un mensaje dependiendo de si un número es mayor que 5, igual a 5 o menor que 5,
podemos hacerlo de la siguiente manera:

```text
1. Inicio
2. Leer n
3. Si n > 5 Entonces
        Escribir "El número es mayor que 5"  
    Otro caso 
        Si n = 5 Entonces
            Escribir "El número es igual a 5"
        Otro caso
            Escribir "El número es menor que 5"
4. Fin
```

En este caso, si el número ingresado es mayor que 5, se imprimirá el mensaje "El número es mayor que 5", si es igual a
5, se imprimirá el mensaje "El número es igual a 5", y si es menor que 5, se imprimirá el mensaje "El número es menor
que 5".

## Condicional anidada

Además de la condicional simple, doble y múltiple, también podemos utilizar la condicional anidada, que nos permite
anidar condicionales dentro de otros condicionales.

La condicional anidada se escribe de la siguiente manera:

```text
n. Si <expresión 1> Entonces
        Inicio
            Si <expresión 2> Entonces
                Inicio
                    <bloque de código 1>
                Fin
            Otro caso
                Inicio
                    <bloque de código 2>
                Fin
        Fin
    Otro caso
        Inicio
            <bloque de código 3>
        Fin
n+1. <<Otras instrucciones>>
```

Donde `<expresión 1>` y `<expresión 2>` son expresiones lógicas que se evalúan a verdadero o falso, `<bloque de código
1>`, `<bloque de código 2>`, `<bloque de código 3>`, ..., `<bloque de código n>` son conjuntos de instrucciones que se
ejecutan si la expresión correspondiente es verdadera.

Por ejemplo, si queremos imprimir un mensaje dependiendo de si un número es mayor que 5 y par, mayor que 5 e impar, o
menor que 5, podemos hacerlo de la siguiente manera:

```text
1. Inicio
2. Leer n
3. Si n > 5 Entonces
        Si n % 2 = 0 Entonces
            Escribir "El número es mayor que 5 y par"  
        Otro caso
            Escribir "El número es mayor que 5 e impar"
    Otro caso
        Escribir "El número es menor que 5"
4. Fin
```

En este caso, si el número ingresado es mayor que 5 y par, se imprimirá el mensaje "El número es mayor que 5 y par", si
es mayor que 5 e impar, se imprimirá el mensaje "El número es mayor que 5 e impar", y si es menor que 5, se imprimirá el
mensaje "El número es menor que 5".

## Conclusiones

En resumen, la condicional es una estructura de control que nos permite tomar decisiones en nuestro código. Podemos
utilizar la condicional simple, doble, múltiple y anidada para evaluar expresiones lógicas y ejecutar bloques de código
dependiendo de si la expresión es verdadera o falsa. Esto nos permite crear programas más complejos y con un mayor
grado de control sobre su ejecución.