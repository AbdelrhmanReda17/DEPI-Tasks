package System.Items;

import System.Sandwich;

public class Burger implements Sandwich {
    private String name;
    private double cost;
    public Burger(String name , double cost){
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
