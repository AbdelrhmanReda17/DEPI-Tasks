package System;

import System.Decorators.AdditionDecorator;
import System.Decorators.BurgerDecorator;
import System.Items.Addition;

public class generateReceipt {
    public static void printReceipt(Order order){
        System.out.println("-------------------------------");
        System.out.println("Receipt");
        System.out.println("1 Sandwich: " + order.getSandwich().getName() + " " + order.getSandwich().getCost());
        if(order.hasAdditions()){
            System.out.println("Additions: ");
            for(Addition addition : ((AdditionDecorator) order.getSandwich()).getAdditions()){
                System.out.println("1 " + addition.getName() + " " + addition.getCost());
            }
        }
        System.out.println("Total: " + order.getTotalCost());
        System.out.println("-------------------------------");
    }

}
