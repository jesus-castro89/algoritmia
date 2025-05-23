package com.tec.games.sudoku;

import java.util.stream.IntStream;

public class SudokuValidator {

    private static int[][] sudoku;

    public static boolean isValid(int[][] board, int row, int column, int number) {
        sudoku = board;
        return isValidRow(row, number) &&
                isValidColumn(column, number) &&
                isValidBox(row, column, number);
    }

    private static boolean isValidRow(int row, int number) {
        return IntStream.range(0, 9).noneMatch(i -> sudoku[row][i] == number);
    }

    private static boolean isValidColumn(int column, int number) {
        return IntStream.range(0, 9).noneMatch(i -> sudoku[i][column] == number);
    }

    private static boolean isValidBox(int row, int column, int number) {
        int startRow = row - row % 3;
        int startCol = column - column % 3;
        return IntStream.range(0, 3).noneMatch(i ->
                IntStream.range(0, 3).anyMatch(
                        j -> sudoku[startRow + i][startCol + j] == number));
    }
}
