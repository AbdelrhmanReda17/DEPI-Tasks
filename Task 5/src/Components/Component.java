package Components;

import Manufacturer.Manufacturer;

public abstract class Component {
    private final Manufacturer manufacturer;
    public abstract void operation();
    public Component(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
