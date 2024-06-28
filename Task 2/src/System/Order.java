package System;

import System.Decorators.AdditionDecorator;
import System.Items.Addition;

public class Order {
    private final Item items;
    private boolean hasAdditions = false;
    public Order(Item sandwich){
        this.items = sandwich;
        if(sandwich instanceof AdditionDecorator) hasAdditions = true;

    }
    public double getTotalCost(){
        double cost = items.getCost();
        if(hasAdditions){
            for(Addition addition : ((AdditionDecorator) items).getAdditions()){
                cost += addition.getCost();
            }
        }
        return cost;
    }

    public boolean hasAdditions(){
        return hasAdditions;
    }

    public Item getItems() {
        return items;
    }
    public void printOrder(){
        System.out.println("-------------------------------");
        System.out.println("Your Order");
        System.out.println("  " + items.getName());
        if(hasAdditions){
            boolean first = true;
            for(Addition addition : ((AdditionDecorator) items).getAdditions()){
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
