# Los operadores en Java

Los operadores son símbolos que se utilizan para realizar operaciones sobre variables y valores en un programa. En Java,
los operadores se dividen en varias categorías, como aritméticos, de asignación, de comparación, lógicos, de incremento
y decremento, entre otros. En este artículo, veremos los operadores más comunes en Java y cómo se utilizan en la
programación.

## Operadores aritméticos

Los operadores aritméticos se utilizan para realizar operaciones matemáticas básicas, como la suma, resta,
multiplicación y división. A continuación, se muestran los operadores aritméticos en Java:

| Operador | Descripción    | Ejemplo |
|----------|----------------|---------|
| `+`      | Suma           | `a + b` |
| `-`      | Resta          | `a - b` |
| `*`      | Multiplicación | `a * b` |
| `/`      | División       | `a / b` |
| `%`      | Módulo         | `a % b` |

```java
int a = 10;
int b = 5;

int suma = a + b; // 15
int resta = a - b; // 5
int multiplicacion = a * b; // 50
int division = a / b; // 2
int modulo = a % b; // 0
``` 

## Operadores de asignación

Los operadores de asignación se utilizan para asignar un valor a una variable. En Java, el operador de asignación más
común es `=`. A continuación, se muestran algunos ejemplos de operadores de asignación en Java:

| Operador | Descripción                 | Ejemplo  |
|----------|-----------------------------|----------|
| `=`      | Asignación                  | `a = 10` |
| `+=`     | Suma y asignación           | `a += 5` |
| `-=`     | Resta y asignación          | `a -= 5` |
| `*=`     | Multiplicación y asignación | `a *= 5` |
| `/=`     | División y asignación       | `a /= 5` |
| `%=`     | Módulo y asignación         | `a %= 5` |

```java
int a = 10;

a += 5; // a = a + 5 = 15
a -= 5; // a = a - 5 = 10
a *= 5; // a = a * 5 = 50
a /= 5; // a = a / 5 = 2
a %= 5; // a = a % 5 = 0
```

## Operadores de comparación

Los operadores de comparación se utilizan para comparar dos valores y devolver un resultado booleano (`true` o `false`).
A continuación, se muestran los operadores de comparación en Java:

| Operador | Descripción          | Ejemplo |
|----------|----------------------|---------|
| `==`     | Igual a              | `a == b` |
| `!=`     | Diferente de         | `a != b` |
| `>`      | Mayor que            | `a > b`  |
| `<`      | Menor que            | `a < b`  |
| `>=`     | Mayor o igual que    | `a >= b` |
| `<=`     | Menor o igual que    | `a <= b` |

```java
int a = 10;

boolean igual = a == 10; // true
boolean diferente = a != 5; // true
boolean mayor = a > 5; // true
boolean menor = a < 5; // false
boolean mayorIgual = a >= 10; // true
boolean menorIgual = a <= 10; // true
```

## Operadores lógicos

Los operadores lógicos se utilizan para combinar expresiones booleanas y devolver un resultado booleano. En Java, los
operadores lógicos más comunes son `&&` (AND), `||` (OR) y `!` (NOT). A continuación, se muestran los operadores
lógicos en Java:

| Operador | Descripción | Ejemplo |
|----------|-------------|---------|
| `&&`     | AND         | `a && b` |
| `||`     | OR          | `a || b` |
| `!`      | NOT         | `!a`    |

```java
boolean a = true;
boolean b = false;

boolean and = a && b; // false
boolean or = a || b; // true
boolean not = !a; // false
```

## Operadores de incremento y decremento

Los operadores de incremento y decremento se utilizan para aumentar o disminuir el valor de una variable en una unidad.

| Operador | Descripción | Ejemplo |
|----------|-------------|---------|
| `++`     | Incremento  | `a++`   |
| `--`     | Decremento  | `a--`   |

```java
int a = 10;

a++; // a = a + 1 = 11
a--; // a = a - 1 = 10
```

> **Nota**: Los operadores de incremento y decremento pueden utilizarse tanto en la forma de prefijo (`++a`, `--a`) como
> en la forma de sufijo (`a++`, `a--`). La diferencia radica en el momento en que se incrementa o decrementa el valor de
> la variable. En el caso del prefijo, el incremento o decremento se realiza antes de evaluar la expresión, mientras que
> en el caso del sufijo, el incremento o decremento se realiza después de evaluar la expresión.

## Operadores de concatenación

El operador de concatenación `+` se utiliza para unir cadenas de texto en Java. A continuación, se muestra un ejemplo de
cómo utilizar el operador de concatenación en Java:

```java
String nombre = "Juan";
String apellido = "Pérez";

String nombreCompleto = nombre + " " + apellido; // "Juan Pérez"
```