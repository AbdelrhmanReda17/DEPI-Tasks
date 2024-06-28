import System.*;
import System.Items.Addition;
import System.Items.Burger;

public class AdminMain {
    public static void run() {
        System.out.println("Welcome to the Admin Panel!");
        while(true){
            System.out.println("1. View Menu");
            System.out.println("2. View Additions");
            System.out.println("3. Add Item to Menu");
            System.out.println("4. Add Addition");
            System.out.println("5. Back to User Menu");
            System.out.println("6. Exit");
            int choice = ConsoleInputs.getInput(6);
            if(choice == 6) break;
            switch(choice){
                case 1:
                    Menu.getInstance().displayMenu();
                    break;
                case 2:
                    Menu.getInstance().displayAdditions();
                    break;
                case 3:
                    System.out.println("Enter the name of the item: ");
                    String name = ConsoleInputs.getStringInput();
                    System.out.println("Enter the cost of the item: ");
                    double cost = ConsoleInputs.getDoubleInput();
                    Menu.getInstance().addMenuItem(new Burger(name, cost));
                    break;
                case 4:
                    System.out.println("Enter the name of the addition: ");
                    String additionName = ConsoleInputs.getStringInput();
                    System.out.println("Enter the cost of the addition: ");
                    double additionCost = ConsoleInputs.getDoubleInput();
                    Menu.getInstance().addAddition(new Addition(additionName , additionCost));
                    break;
                case 5:
                    UserMain.run();
                    break;
            }
        }
    }
}
