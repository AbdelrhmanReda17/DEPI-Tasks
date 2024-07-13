package Components;

import Manufacturer.Manufacturer;

public class PowerSupply extends Component {
    private final int wattage;
    public PowerSupply(Manufacturer manufacturer , int watt) {
        super(manufacturer);
        this.wattage = watt;
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.toString() + " " + this.wattage + "Wattage Power Supply");
    }

    @Override
    public String toString() {
        return "Power Supply [Manufacturer: " + super.toString() + "]";
    }
}
