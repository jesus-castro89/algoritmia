import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Arreglos {

    private static int INTENTOS = 3;

    /**
     * Función que permite generar un número aleatorio dado un rango determinado.
     *
     * @param min El valor mínino del rango
     * @param max El valor máximo del rango
     * @return Valor entero aleatorio
     */
    public static Integer getRandomInteger(int min, int max) {

        Random random = new Random();
        return (Integer) (random.nextInt(max - min + 1) + min);
    }

    public static int compare(Integer a, Integer b) {

        if (a % 2 == 0 && b % 2 != 0) {
            return -1;
        } else if (a % 2 != 0 && b % 2 == 0) {
            return 1;
        } else {
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) {

        String palabras = "ornitorrinco";
        char[] arreglo = new char[palabras.length()];
        Arrays.fill(arreglo, '_');
        System.out.println(Arrays.toString(arreglo));
        char[] letras = palabras.toCharArray();
        // Preguntemos si existe una cierta letra en la palabra
        existLetra(letras, arreglo, 'c');
        System.out.println(Arrays.toString(arreglo));
    }

    private static void pedirLetra(char[] letras, char[] arreglo) {

        if (INTENTOS > 0) {
            String letra = JOptionPane.showInputDialog("Ingrese una letra");
            if (existLetra(letras, arreglo, letra.charAt(0))) {
                String mensaje = "La letra %s existe en la palabra.".formatted(letra);
                JOptionPane.showMessageDialog(null, mensaje);
                JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
            }
        }
    }

    private static boolean existLetra(char[] letras, char[] arreglo, char letra) {

        char[] letrasOrdenadas = Arrays.copyOf(letras, letras.length);
        Arrays.sort(letrasOrdenadas);
        int index = Arrays.binarySearch(letrasOrdenadas, letra);
        if (index >= 0) {
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == letra) {
                    arreglo[i] = letra;
                    return true;
                }
            }
        }
        return false;
    }
}
