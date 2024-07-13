package Components;

import Manufacturer.Manufacturer;

public class CPU extends Component {
    public CPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.toString() + " CPU");
    }

    @Override
    public String toString() {
        return "CPU [Manufacturer: " + super.toString() + "]";
    }
}
