package com.tec.games.sudoku;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class SudokuGenerator {

    private final int[][] sudoku;

    public SudokuGenerator() {

        this.sudoku = new int[9][9];
        System.out.println(isValidRow(0, 1));
        printSudoku();
    }

    public int[][] generateSudoku() {
        //fillBoard(0, 0);
        return sudoku;
    }

    private boolean isValidRow(int row, int number) {
        return IntStream.range(0, 9).noneMatch(i -> sudoku[row][i] == number);
    }

    private boolean isValidColumn(int column, int number) {
        return IntStream.range(0, 9).noneMatch(i -> sudoku[i][column] == number);
    }

    private boolean isValidBox(int row, int column, int number) {
        int startRow = row - row % 3;
        int startCol = column - column % 3;
        return IntStream.range(0, 3).noneMatch(i ->
                IntStream.range(0, 3).anyMatch(
                        j -> sudoku[startRow + i][startCol + j] == number));
    }

//    private boolean fillBoard(int row, int column) {
//        int nextRow;
//        int nextColumn;
//        ArrayList<Integer> numbers = new ArrayList<>();
//        if (row != 9) {
//            nextRow = (column == 8) ? row + 1 : row;
//            nextColumn = (column + 1) % 9;
//            for (int i = 1; i <= 9; i++)
//                numbers.add(i);
//            Collections.shuffle(numbers);
//            for (int number : numbers) {
//                if (isValid(row, column, number)) {
//                    sudoku[row][column] = number;
//                    if (fillBoard(nextRow, nextColumn))
//                        return true;
//                    else
//                        sudoku[row][column] = 0; // Backtrack
//                }
//            }
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    private boolean isValid(int row, int column, int number) {
//        return isValidRow(row, number) &&
//                isValidColumn(column, number) &&
//                isValidBox(row, column, number);
//    }
//
//    private boolean isValidRow(int row, int number) {
//        boolean isValid = true;
//        for (int i = 0; i < 9; i++) {
//            if (sudoku[row][i] == number) {
//                isValid = false;
//                break;
//            }
//        }
//        return isValid;
//    }
//
//    private boolean isValidColumn(int column, int number) {
//        boolean isValid = true;
//        for (int i = 0; i < 9; i++) {
//            if (sudoku[i][column] == number) {
//                isValid = false;
//                break;
//            }
//        }
//        return isValid;
//    }
//
//    private boolean isValidBox(int row, int column, int number) {
//        boolean isValid = true;
//        int startRow = row - row % 3;
//        int startCol = column - column % 3;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (sudoku[startRow + i][startCol + j] == number) {
//                    isValid = false;
//                    break;
//                }
//            }
//        }
//        return isValid;
//    }

    public void printSudoku() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(sudoku[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
