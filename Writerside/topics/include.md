# La palabra `include` en C++

La palabra `include` en C++ es una palabra reservada que se utiliza para incluir archivos de cabecera en un programa.
Los archivos de cabecera contienen declaraciones de funciones y variables que se utilizan en un programa. Al incluir un
archivo de cabecera en un programa, se pueden utilizar las funciones y variables declaradas en ese archivo en el
programa principal.

La sintaxis para incluir un archivo de cabecera en un programa C++ es la siguiente:

```c++
#include <nombre_del_archivo.h>
```

Donde `nombre_del_archivo.h` es el nombre del archivo de cabecera que se desea incluir en el programa. Por ejemplo, si
se desea incluir el archivo de cabecera `iostream` en un programa, se puede hacer de la siguiente manera:

```c++
#include <iostream>
```

Al incluir el archivo de cabecera `iostream`, se pueden utilizar las funciones y variables declaradas en ese archivo en
el programa principal. Por ejemplo, se puede utilizar la función `std::cout` para imprimir texto en la consola:

```c++
#include <iostream>

int main() {
    std::cout << "Hola, mundo!" << std::endl;
    return 0;
}
```

En este ejemplo, se incluye el archivo de cabecera `iostream` y se utiliza la función `std::cout` para imprimir el texto
`"Hola, mundo!"` en la consola.

## Librerías estándar de C++

La librería estándar de C++ es una colección de clases y funciones que proporcionan funcionalidades comunes para
programar en C++. La librería estándar de C++ se divide en varias partes, entre las que se encuentran:

| Parte de la librería estándar | Descripción                                                                   |
|-------------------------------|-------------------------------------------------------------------------------|
| `iostream`                    | Proporciona funcionalidades para entrada y salida de datos.                   |
| `fstream`                     | Proporciona funcionalidades para entrada y salida de archivos.                |
| `string`                      | Proporciona funcionalidades para trabajar con cadenas de texto.               |
| `vector`                      | Proporciona funcionalidades para trabajar con vectores.                       |
| `algorithm`                   | Proporciona algoritmos comunes, como ordenamiento y búsqueda.                 |
| `cmath`                       | Proporciona funciones matemáticas comunes, como seno, coseno y raíz cuadrada. |
| `ctime`                       | Proporciona funcionalidades para trabajar con fechas y horas.                 |
| `cstdlib`                     | Proporciona funcionalidades para trabajar con memoria dinámica.               |
| `cctype`                      | Proporciona funciones para trabajar con caracteres.                           |