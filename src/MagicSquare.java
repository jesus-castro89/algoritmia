import java.util.Arrays;

public class MagicSquare {

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        int n = 3; // Size of the magic square
        int[][] square = magicSquare.generateMagicSquare(n);

        // Print the magic square
        for(int[] row : square) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] generateMagicSquare(int n) {
        if (n < 3) {
            throw new IllegalArgumentException("Size must be at least 3");
        }
        int[][] magicSquare = new int[n][n];
        int num = 1;
        int i = 0, j = n / 2;

        while (num <= n * n) {
            magicSquare[i][j] = num++;
            i--;
            j++;

            if (i < 0 && j >= n) {
                i += 2;
                j--;
            } else if (i < 0) {
                i = n - 1;
            } else if (j >= n) {
                j = 0;
            } else if (magicSquare[i][j] != 0) {
                i += 2;
                j--;
            }
        }
        return magicSquare;
    }
}
