# Entrada y Salida de Información en C++

La entrada y salida de información es una parte fundamental de cualquier programa, ya que permite interactuar con el
usuario y mostrar resultados. En C++, la entrada y salida de información se realiza a través de la consola, utilizando
las funciones `cin` y `cout` de la biblioteca estándar.

## Entrada de Información

La entrada de información en C++ se realiza a través del objeto `cin`, que permite leer datos desde la consola y
almacenarlos en variables. Para leer un valor desde la consola, se utiliza el operador de extracción `>>`, seguido del
nombre de la variable en la que se desea almacenar el valor.

```c++
#include <iostream>

int main() {
    int numero;

    std::cout << "Ingrese un número: ";
    std::cin >> numero;

    std::cout << "El número ingresado es: " << numero << std::endl;

    return 0;
}
```

En este ejemplo, se lee un número entero desde la consola y se almacena en la variable `numero`. Luego, se muestra el
número ingresado en la consola.

> **Nota**: Es importante tener en cuenta que la entrada de información en C++ es sensible a mayúsculas y minúsculas,
> por lo que es necesario asegurarse de que los datos ingresados coincidan con el tipo de dato esperado.

> **Nota**: La función `std::endl` se utiliza para insertar un salto de línea en la consola, lo que permite mostrar
> mensajes de forma ordenada.

## Salida de Información

La salida de información en C++ se realiza a través del objeto `cout`, que permite mostrar datos en la consola. Para
mostrar un valor en la consola, se utiliza el operador de inserción `<<`, seguido del valor que se desea mostrar.

```c++
#include <iostream>

int main() {
    int numero = 42;

    std::cout << "El número es: " << numero << std::endl;

    return 0;
}
```

En este ejemplo, se muestra el valor de la variable `numero` en la consola. El mensaje se compone de una cadena de
texto y el valor de la variable, que se inserta en la cadena utilizando el operador de inserción `<<`.

> **Nota**: Es importante tener en cuenta que la salida de información en C++ es sensible a mayúsculas y minúsculas, por
> lo que es necesario asegurarse de que los datos mostrados coincidan con el tipo de dato esperado.

## Usando namespace `std`

En los ejemplos anteriores, se utilizó el prefijo `std::` para acceder a las funciones `cout` y `cin` de la biblioteca
estándar. Sin embargo, es posible evitar el uso de este prefijo utilizando la directiva `using namespace std`, que
permite acceder a las funciones de la biblioteca estándar sin necesidad de utilizar el prefijo `std::`.

```c++
#include <iostream>

using namespace std;

int main() {
    int numero;

    cout << "Ingrese un número: ";
    cin >> numero;

    cout << "El número ingresado es: " << numero << endl;

    return 0;
}
```

En este ejemplo, se utiliza la directiva `using namespace std` para acceder a las funciones `cout` y `cin` de la
biblioteca estándar sin necesidad de utilizar el prefijo `std::`. Esto simplifica el código y hace que sea más fácil de
leer y entender.

## Conclusión

La entrada y salida de información en C++ es una parte fundamental del lenguaje, que permite interactuar con el usuario
y mostrar resultados en la consola. En C++, la entrada de información se realiza a través del objeto `cin`, que permite
leer datos desde la consola, mientras que la salida de información se realiza a través del objeto `cout`, que permite
mostrar datos en la consola. Utilizando las funciones `cin` y `cout`, es posible crear programas interactivos y
dinámicos en C++.