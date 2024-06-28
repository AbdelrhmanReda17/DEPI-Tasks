import System.*;
import System.Decorators.AdditionDecorator;
import System.Decorators.BurgerDecorator;
import System.Items.Addition;

import java.util.ArrayList;
import java.util.List;

public class UserMain {
    public static void run() {
        System.out.println("Welcome to our Restaurant!");
        Menu menu = Menu.getInstance();
        Order dummyOrder;
        while(true){
            menu.displayMenu();
            int choice = ConsoleInputs.getInput(menu.getMenuItems().size());
            if(choice == 0) break; else if(choice == -1) continue;
            Sandwich selectedSandwich = menu.getMenuItems().get(choice - 1);
            System.out.println("You have selected: " + selectedSandwich.getName());
            System.out.println("Do you want to add any additions? (y/n)");
            String needAdditions = ConsoleInputs.getFalseOrTrue();
            if(needAdditions == null || needAdditions.equals("n")){
                BurgerDecorator burgerDecorator = new BurgerDecorator(selectedSandwich);
                dummyOrder = new Order(burgerDecorator);
                dummyOrder.printOrder();
                boolean isFinish = OrderConfirmation(dummyOrder);
                System.out.println(isFinish);
                if(isFinish) return;
                continue;
            }
            while(true){
                menu.displayAdditions();
                List<Integer> additionChoice = ConsoleInputs.getMultipleInput(menu.getAdditions().size());
                if(additionChoice == null) continue; else if(additionChoice.isEmpty()) break;
                List<Addition> selectedAdditions = new ArrayList<>();
                for(int choiceInt : additionChoice)  selectedAdditions.add(menu.getAdditions().get(choiceInt - 1));
                AdditionDecorator additionDecorator = new AdditionDecorator(selectedSandwich, selectedAdditions);
                dummyOrder = new Order(additionDecorator);
                dummyOrder.printOrder();
                boolean isFinish = OrderConfirmation(dummyOrder);
                if(isFinish) return; else break;
            }
        }
    }
    public static boolean OrderConfirmation(Order dummyOrder){
        while(true){
            int confirm = ConsoleInputs.confirmOrder();
            if(confirm == 0) break;
            else if(confirm == 1){
                generateReceipt.printReceipt(dummyOrder);
                break;
            }
        }
        while(true){
            int back = ConsoleInputs.backOrExit();
            if(back == 0) return true;
            else if(back == 1) return false;
        }
    }
}
