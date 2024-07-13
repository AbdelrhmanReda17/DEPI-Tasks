package Manufacturer.Factories;

import Manufacturer.Manufacturer;
import Manufacturer.SamsungManufacturer;

public class SamsungFactory implements ManufacturerFactory {
    public Manufacturer createManufacturer() {
        return new SamsungManufacturer();
    }
}
