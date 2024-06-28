package System;

import System.Decorators.AdditionDecorator;
import System.Decorators.BurgerDecorator;
import System.Items.Addition;

public class Order {
    private final Sandwich sandwich;
    private boolean hasAdditions = false;
    public Order(Sandwich sandwich){
        this.sandwich = sandwich;
        if(sandwich instanceof AdditionDecorator) hasAdditions = true;

    }
    public double getTotalCost(){
        double cost = sandwich.getCost();
        if(hasAdditions){
            for(Addition addition : ((AdditionDecorator) sandwich).getAdditions()){
                cost += addition.getCost();
            }
        }
        return cost;
    }

    public boolean hasAdditions(){
        return hasAdditions;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }
    public void printOrder(){
        System.out.println("-------------------------------");
        System.out.println("Your Order");
        System.out.println("  " + sandwich.getName());
        if(hasAdditions){
            boolean first = true;
            for(Addition addition : ((AdditionDecorator) sandwich).getAdditions()){
                if(first){
                    System.out.print("  " + addition.getName() );
                    first = false;
                }else
                    System.out.print( "+" + addition.getName());
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }
}
