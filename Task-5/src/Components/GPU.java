package Components;

import Manufacturer.Manufacturer;

public class GPU extends Component {
    public GPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.getManufacturer() + " GPU");
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " GPU";
    }
}
