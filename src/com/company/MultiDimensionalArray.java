package com.company;

public class MultiDimensionalArray {
   public void  MultiDimArray(){

      int[][] grid = {
              {3,5,2343},
              {2,4},
              {1,2,3,4}
      };

      System.out.println(grid[1][1]);
      String[][] texts = new String[2][3];
      texts[0][2] = "Multi Dimensional Array is working";
    System.out.println(texts[0][2]);


    for (int row = 0; row < grid.length; row++)
      for (int col = 0; col < grid[col].length; col++) {
        System.out.print(grid[row][col] + "\t");
    }
    System.out.println();
   }

}
