package System.Decorators;

import System.Items.Addition;
import System.Sandwich;

import java.util.List;

public class AdditionDecorator extends BurgerDecorator {
    private final List<Addition> addition;
    public AdditionDecorator(Sandwich sandwich, List<Addition> addition) {
        super(sandwich);
        this.addition = addition;
    }
    public List<Addition> getAdditions() {
        return addition;
    }
    @Override
    public double getCost() {
        double cost = super.getCost();
        for(Addition addition : addition){
            cost += addition.getCost();
        }
        return cost;
    }
}
