package com.company;

import java.util.Scanner;

public class SwitchStatements {
    //  SWITCH STATEMENTS
    public void switching(){
           Scanner input = new Scanner(System.in);
            System.out.println("Please enter a command: ");

            String text = input.nextLine();
    switch (text) {
      case "start":
        System.out.println("machine started!");
        break;

      case "stop":
        System.out.println("Machine stopped!");
        break;

      default:
        System.out.println("Command not recognized");
    }
    }

}
