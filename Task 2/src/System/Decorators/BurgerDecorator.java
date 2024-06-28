package System.Decorators;

import System.Item;

public class BurgerDecorator implements Item {
    private final Item item;

    public BurgerDecorator(Item burger) {
        this.item = burger;
    }
    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public double getCost() {
        return item.getCost();
    }
}
