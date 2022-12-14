// Problem: https://takeuforward.org/data-structure/set-matrix-zero/

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
  public static void main(String[] args) {
    int[][] matrix = {
        { 0, 1, 2, 0 },
        { 3, 4, 5, 2 },
        { 1, 3, 1, 5 }
    };

    ArrayList<Integer> rowList = new ArrayList<>();
    ArrayList<Integer> columnList = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          rowList.add(i);
          columnList.add(j);
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (rowList.contains(i) || columnList.contains(j))
          matrix[i][j] = 0;
      }
    }

    // used to print 2D arrays with ease
    System.out.println(Arrays.deepToString(matrix));

  }
}

/*
 * Logic
 * 
 * 1. Create two arrays, row list and column list which we will be using to mark
 * the location of row and column having a zero.
 * 2. Traverse the array and update row list and column list.
 * 3. Again traverse the array, but this time if the current row belongs to row
 * list OR current column belongs to column list then assign a zero.
 */
