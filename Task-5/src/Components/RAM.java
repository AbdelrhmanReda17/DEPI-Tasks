package Components;

import Manufacturer.Manufacturer;

public class RAM extends Component {
    private final String type;
    private final int capacity;
    public RAM(Manufacturer manufacturer , String type , int capacity) {
        super(manufacturer);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.toString() + " " + this.type + " RAM with " + this.capacity + "GB capacity");
    }

    @Override
    public String toString() {
        return "RAM [Manufacturer: " + super.toString() + "]";
    }
}
