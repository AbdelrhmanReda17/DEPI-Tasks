package System;

import java.util.ArrayList;
import java.util.List;

public class ConsoleInputs {
    public static int getInput(int range) {
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(System.console().readLine());
        if(choice <= 0 || choice > range){
            System.out.println("Invalid choice!");
            return -1;
        }
        return choice;
    }
    public static String getStringInput() {
        return System.console().readLine();
    }
    public static double getDoubleInput() {
        return Double.parseDouble(System.console().readLine());
    }

    public static List<Integer> getMultipleInput(int range){
        System.out.print("Enter your choices separated by commas: ");
        String[] choices = System.console().readLine().split(",");
        List<Integer> selectedChoices = new ArrayList<>();
        for(String choice : choices){
            int choiceInt = Integer.parseInt(choice);
            if(choiceInt <= 0 || choiceInt > range){
                System.out.println("Invalid choice!");
                return null;
            }
            selectedChoices.add(choiceInt);
        }
        return selectedChoices;
    }
    public static int backOrExit(){
        System.out.println("1. Back to Main Menu");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(System.console().readLine());
        if (choice == 0 || choice == 1) {
            return choice;
        }
        System.out.println("Invalid choice!");
        return -1;
    }
    public static int confirmOrder(){
        System.out.println("1. Confirm Order");
        System.out.println("0. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(System.console().readLine());
        if (choice == 0 || choice == 1) {
            return choice;
        }
        System.out.println("Invalid choice!");
        return -1;
    }
    public static String getFalseOrTrue() {
        String choice = System.console().readLine();
        if(!choice.equals("y") && !choice.equals("n")){
            System.out.println("Invalid choice!");
            return null;
        }
        return choice;
    }
}
