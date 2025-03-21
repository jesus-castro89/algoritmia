# Practica 4: Creación de anagramas

## Objetivo

El objetivo de esta práctica es crear un programa que genere anagramas a partir de una palabra dada. Un anagrama es una
palabra o frase que resulta de la transposición de letras de otra palabra o frase. Por ejemplo, "roma" es un anagrama de
"amor".

## Descripción

El programa debe recibir una palabra y generar todos los anagramas posibles de la misma. Para ello, se debe implementar
una función recursiva que genere los anagramas. La función debe recibir la palabra original y una lista de letras que
representan las letras que faltan por colocar en el anagrama. La función debe generar todos los anagramas posibles y
mostrarlos en pantalla.

## Solución

```java
public class Anagrama {

    public static void main(String[] args) {

        anagramas("abc");
    }

    /**
     * Función que imprime los anagramas de una palabra
     *
     * @param palabra Palabra de la que se quieren obtener los anagramas
     */
    public static void anagramas(String palabra) {

        // Convertimos la palabra en un array de caracteres
        char[] letras = palabra.toCharArray();
        // Llamamos a la función recursiva que se encarga de obtener los anagramas
        anagramas("", letras);
    }

    /**
     * Función recursiva que se encarga de obtener los anagramas de una palabra
     *
     * @param anagrama Anagrama que se va formando
     * @param letras   Letras que quedan por formar el anagrama
     */
    public static void anagramas(String anagrama, char[] letras) {
        // Recorremos las letras que quedan por formar el anagrama
        for (int i = 0; i < letras.length; i++) {
            // Creamos un nuevo array de longitud una unidad menor que el array de letras
            char[] nuevasLetras = new char[letras.length - 1];
            // Copiamos las letras que no estamos utilizando al nuevo array
            System.arraycopy(letras, 0, nuevasLetras, 0, i);
            // Verificamos que no nos salgamos de los límites del array
            if (letras.length - (i + 1) >= 0)
                // Copiamos las letras que no estamos utilizando al nuevo array
                System.arraycopy(letras, i + 1, nuevasLetras, i, letras.length - (i + 1));
            // Llamamos recursivamente a la función para que siga formando el anagrama
            anagramas(anagrama + letras[i], nuevasLetras);
        }
        // Si no quedan letras por formar el anagrama, lo imprimimos
        if (letras.length == 0) {
            // Imprimimos el anagrama
            System.out.println(anagrama);
        }
    }
}
```

Analicemos el código:

1. En el método `main` se llama a la función `anagramas` con la palabra "abc" como argumento.
2. La función `anagramas` recibe la palabra y la convierte en un array de caracteres. Luego, llama a la función
   `anagramas` que recibe el anagrama que se va formando y las letras que quedan por formar el anagrama.
3. La función `anagramas` recibe el anagrama que se va formando y las letras que quedan por formar el anagrama. Luego,
   recorre las letras que quedan por formar el anagrama y, por cada letra, crea un nuevo array de letras que no
   contienen la letra que se está utilizando. Luego, llama recursivamente a la función `anagramas` con el anagrama
   formado y las letras que quedan por formar el anagrama.
4. Si no quedan letras por formar el anagrama, se imprime el anagrama.
5. Al ejecutar el programa, se obtiene la siguiente salida:

```
abc
acb
bac
bca
cab
cba
```

En la salida se muestran todos los anagramas posibles de la palabra "abc".

## Conclusiones

El uso de funciones recursivas es muy útil para resolver problemas en los que se requiere realizar una tarea de forma
repetitiva. En este caso, se utilizó una función recursiva para generar los anagramas de una palabra. La función se
encarga de formar el anagrama letra por letra y, cuando no quedan letras por formar el anagrama, lo imprime en pantalla.