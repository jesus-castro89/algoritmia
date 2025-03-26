import javax.swing.*;
import java.util.Random;

public class HangedMan {

    private static int INTENTOS = 5;

    private static String[] palabras = {
            "ornitorrinco",
            "puerta",
            "argumento",
            "apuntador",
            "arreglo",
            "funcional",
            "computadora",
    };

    private static char[] getRandomWord() {

        Random rand = new Random();
        int index = rand.nextInt(palabras.length);
        return palabras[index].toCharArray();
    }

    public static char readChar() {

        String letra = JOptionPane.showInputDialog("Ingrese una letra");
        if (letra == null) {

            JOptionPane.showMessageDialog(null,
                    "Ingrese al menos una letra");
            return readChar();
        } else if (letra.length() != 1) {

            JOptionPane.showMessageDialog(null,
                    "Ingrese solo una letra");
            return readChar();
        } else {
            return letra.charAt(0);
        }
    }
}
