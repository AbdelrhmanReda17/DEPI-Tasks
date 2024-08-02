package Components;

import Manufacturer.Manufacturer;

public class Storage extends Component {
    private final String type;
    private final int capacity;
    public Storage(Manufacturer manufacturer , String type , int capacity) {
        super(manufacturer);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void operation() {
        System.out.println("Running a " + super.getManufacturer() + " " + this.type + " Storage with " + this.capacity + "GB capacity");
    }

    @Override
    public String toString() {
        return super.getManufacturer() + " Storage";
    }
}
