package com.tec.games.sudoku;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuGenerator {

    private final int[][] sudoku;

    public SudokuGenerator() {

        this.sudoku = new int[9][9];
    }

    public int[][] generateSudoku() {
        clearBoard();
        fillBoard(0, 0);
        return sudoku;
    }

    private void clearBoard() {
        IntStream.range(0, 9).forEach(i -> Arrays.fill(sudoku[i], 0));
    }

    private Integer[] shuffledNumbers() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> intList = Arrays.asList(numbers);
        Collections.shuffle(intList);
        intList.toArray(numbers);
        return numbers;
    }

    private boolean fillBoard(int row, int column) {
        int nextRow;
        int nextColumn;
        Integer[] numbers;
        if (row > 0 && row < 9 && column > 0 && column < 9) {
            nextRow = (column == 8) ? row + 1 : row;
            nextColumn = (column + 1) % 9;
            numbers = shuffledNumbers();
            for (int number : numbers) {
                if (SudokuValidator.isValid(sudoku, row, column, number)) {
                    sudoku[row][column] = number;
                    if (fillBoard(nextRow, nextColumn))
                        return true;
                    else
                        sudoku[row][column] = 0; // Backtrack
                }
            }
            return false;
        } else {
            return true;
        }
    }
}
