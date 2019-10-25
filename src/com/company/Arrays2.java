package com.company;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Arrays2 {
  public void array2() {
    java.util.ArrayList myList = new java.util.ArrayList();
    myList.add("hello");
    myList.add(1);
    myList.add(2.2);

    // Create arrays of Integer, Double and Character
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.println("Array integerArray contains:");
    printArray(intArray); // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); // pass a Double array

    System.out.println("\nArray characterArray contains:");
    printArray(charArray); // pass a Character array
  }
         }

//        public static void printArray(Integer[] intArray){
//            for (Integer i; intArray){
//
//            }
//            System.out.println(i + " ");
//        }
//
//        public static void printArray(Double[] doubleArray){
//            for (Double i; doubleArray){
//
//            }
//            System.out.println(i + " ");
//        }
//
//        public static void printArray(Character[] array){
//            for (Character i : array){
//                System.out.println(i + " ");
//            }
//
//        }
//    }
//
//
//
//



