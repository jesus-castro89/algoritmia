package com.tec.games.sudoku;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Test {

    static {
        UIManager.put("OptionPane.messageFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("OptionPane.buttonFont",
                new Font("Arial", Font.BOLD, 24));
        UIManager.put("TextField.font",
                new Font("Arial", Font.PLAIN, 24));
        UIManager.put("ComboBox.font",
                new Font("Arial", Font.BOLD, 24));
    }

    public static void main(String[] args) {
        SudokuGenerator sudokuGenerator = new SudokuGenerator();
//        int[][] sudoku = new int[9][9];
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                sudoku[i][j] = (int) (Math.random() * 9) + 1;
//            }
//        }
//        int columnS = (int) (Math.random() * 9);
//        int rowS = (int) (Math.random() * 9);
//        int startRow = rowS - rowS % 3;
//        final int[] sudokuRow = new int[9];
//        boolean exists = false;
//        Arrays.stream(sudoku).forEach(
//                row ->
//                        sudokuRow[Arrays.asList(sudoku).indexOf(row)] = row[columnS]
//        );
//        if(Arrays.toString(sudokuRow).contains("2")){
//            System.out.println("Col " + Arrays.toString(sudokuRow) + " contains 2");
//        } else {
//            System.out.println("Col " + Arrays.toString(sudokuRow) + " does not contain 2");
//        }
//        final int[][] sudokuBox = new int[3][3];
//        Arrays.stream(sudoku).forEach(
//                row -> {
//                    if(Arrays.asList(sudoku).indexOf(row) >= startRow &&
//                            Arrays.asList(sudoku).indexOf(row) < startRow + 3) {
//                        int startColumn = columnS - columnS % 3;
//                        for (int i = 0; i < 3; i++) {
//                            sudokuBox[Arrays.asList(sudoku).indexOf(row)][i] = row[startColumn];
//                            startColumn++;
//                        }
//                    }
//                }
//        );
//        if(Arrays.toString(sudokuBox).contains("2")){
//            System.out.println("Box " + Arrays.toString(sudokuBox) + " contains 2");
//        }
    }
}
