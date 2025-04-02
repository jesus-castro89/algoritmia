public class CuadroMagico {

    public static int[][] crearCuadroMagico(int n) {
        // Verificar la condición para la suma mágica
        if (n % 3 != 0) {
            System.out.println("La suma mágica debe ser divisible por 3 para un cuadro mágico de 3x3.");
            return null;
        }

        int[][] cuadro = new int[3][3];
        int central = n / 3;

        // Asignar los valores al cuadro mágico (una de las posibles soluciones)
        cuadro[0][0] = central + 1;
        cuadro[0][1] = central - 2;
        cuadro[0][2] = central + 3;
        cuadro[1][0] = central + 2;
        cuadro[1][1] = central;
        cuadro[1][2] = central - 2;
        cuadro[2][0] = central - 3;
        cuadro[2][1] = central + 2;
        cuadro[2][2] = central - 1;

        // Verificar si la matriz generada es realmente un cuadro mágico
        if (!esCuadroMagico(cuadro, n)) {
            System.out.println("No se pudo generar un cuadro mágico con la suma dada.");
            return null;
        }

        return cuadro;
    }

    public static boolean esCuadroMagico(int[][] matriz, int sumaMagica) {
        // Verificar la suma de cada fila
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] != sumaMagica) return false;
        if (matriz[1][0] + matriz[1][1] + matriz[1][2] != sumaMagica) return false;
        if (matriz[2][0] + matriz[2][1] + matriz[2][2] != sumaMagica) return false;

        // Verificar la suma de cada columna
        if (matriz[0][0] + matriz[1][0] + matriz[2][0] != sumaMagica) return false;
        if (matriz[0][1] + matriz[1][1] + matriz[2][1] != sumaMagica) return false;
        if (matriz[0][2] + matriz[1][2] + matriz[2][2] != sumaMagica) return false;

        // Verificar la suma de las diagonales
        if (matriz[0][0] + matriz[1][1] + matriz[2][2] != sumaMagica) return false;
        if (matriz[0][2] + matriz[1][1] + matriz[2][0] != sumaMagica) return false;

        return true;
    }

    public static void main(String[] args) {
        int sumaMagica = 15; // Ejemplo de suma mágica
        int[][] cuadro = crearCuadroMagico(sumaMagica);

        if (cuadro != null) {
            System.out.println("Cuadro Mágico de 3x3 con suma mágica " + sumaMagica + ":");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(cuadro[i][j] + "\t");
                }
                System.out.println();
            }
        }

        int otraSuma = 30;
        int[][] otroCuadro = crearCuadroMagico(otraSuma);

        if (otroCuadro != null) {
            System.out.println("\nCuadro Mágico de 3x3 con suma mágica " + otraSuma + ":");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(otroCuadro[i][j] + "\t");
                }
                System.out.println();
            }
        }

        int sumaInvalida = 10;
        crearCuadroMagico(sumaInvalida);
    }
}
