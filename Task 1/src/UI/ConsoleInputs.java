package UI;

import java.util.AbstractMap;

public  class ConsoleInputs {
    static public AbstractMap.SimpleEntry<String, String> getCredentials(){
        String username; String password;
        System.out.print("Enter your username: ");
        username = System.console().readLine();
        System.out.print("Enter your password: ");
        password = System.console().readLine();
        return new AbstractMap.SimpleEntry<>(username, password);
    }

    public static int getInput(int range) {
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(System.console().readLine());
        if(choice < 0 || choice > range){
            System.out.println("Invalid choice!");
            return -1;
        }
        return choice;
    }

    static public String getType(){
        String type;
        System.out.println("Registering as a student or Instructor (S/I) :?");
        type = System.console().readLine();
        while(!type.equals("S") && !type.equals("I")){
            System.out.println("Invalid type! Please enter S or I :");
            type = System.console().readLine();
        }
        return type;
    }
}
