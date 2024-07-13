package Components;

import Manufacturer.Manufacturer;

public class CPU extends Component {
    private final String model;
    public CPU(Manufacturer manufacturer , String model) {
        super(manufacturer);
        this.model = model;
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.getManufacturer() + " " + this.model + " CPU");
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " CPU";
    }
}
