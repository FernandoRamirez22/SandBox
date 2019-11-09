package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> myList = new ArrayList<>();


//Anonymous class
        Chicken Buk = new Chicken() {
            @Override
            public void cluck() {
                System.out.println("Say Duh Hello, BUk BUk ");
            }
        };


        //Creating objects for classes

        Test test1 = new Test();
        test1.method();

        Car driving = new Car();
        driving.drive();

            //Object for Vegetables class and call
             Vegetables vegetableObject = new Vegetables();
             vegetableObject.simpleMessage();

             //Object for ScannerCLass class and call
             ScannerClass ScannerClassObject = new ScannerClass();
             ScannerClassObject.scanning();

             //Object for SwitchStatements class and call
             SwitchStatements SwitchStatementsObject = new SwitchStatements();
             SwitchStatementsObject.switching();

             //Object for Arrays class and call
             Arrays ArraysObject = new Arrays();
             ArraysObject.array();

             //Object of MultiDimensionalArray class and call
             MultiDimensionalArray MultiDimensionalArrayObject = new MultiDimensionalArray();
             MultiDimensionalArrayObject.MultiDimArray();













    }
}
