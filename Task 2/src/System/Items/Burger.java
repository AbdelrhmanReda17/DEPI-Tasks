package System.Items;

import System.Item;

public class Burger implements Item {
    private final String name;
    private final double cost;
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
