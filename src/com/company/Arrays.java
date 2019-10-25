package com.company;

import java.util.ArrayList;

public class Arrays {

  public void array() {
    int value = 7;
    int[] values;
    values = new int[3];

    values[0] = 10;
    values[1] = 69;
    values[2] = 100;


    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }

    int[] numbers = {1, 2, 3, 4, 5};

    // .length in java is basically saying that java knows how long each array is
    // in this case, loop as long as numbers is less than the length of the array (3)
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}



