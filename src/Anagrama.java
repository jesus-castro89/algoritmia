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