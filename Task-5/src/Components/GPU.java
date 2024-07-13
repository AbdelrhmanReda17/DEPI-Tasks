package Components;

import Manufacturer.Manufacturer;

public class GPU extends Component {
    public GPU(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.toString() + " GPU");
    }

    @Override
    public String toString() {
        return "GPU [Manufacturer: " + super.toString() + "]";
    }
}
