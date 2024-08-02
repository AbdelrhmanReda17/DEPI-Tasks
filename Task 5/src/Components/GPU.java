package Components;

import Manufacturer.Manufacturer;

public class GPU extends Component {
    private final String model;
    public GPU(Manufacturer manufacturer , String model) {
        super(manufacturer);
        this.model = model;
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.getManufacturer() + " " + this.model + " GPU");
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " GPU";
    }
}
