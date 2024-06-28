package System.Decorators;

import System.Sandwich;

public class BurgerDecorator implements Sandwich {
    private final Sandwich sandwich;

    public BurgerDecorator(Sandwich burger) {
        this.sandwich = burger;
    }
    @Override
    public String getName() {
        return sandwich.getName();
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }
}
