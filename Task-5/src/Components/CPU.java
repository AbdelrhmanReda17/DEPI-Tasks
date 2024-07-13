package Components;

import Manufacturer.Manufacturer;

public class CPU extends Component {
    public CPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.getManufacturer() + " CPU");
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " CPU";
    }
}
