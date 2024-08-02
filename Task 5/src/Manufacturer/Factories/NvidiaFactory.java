package Manufacturer.Factories;

import Manufacturer.Manufacturer;
import Manufacturer.NvidiaManufacturer;

public class NvidiaFactory implements ManufacturerFactory {
    @Override
    public Manufacturer createManufacturer() {
        return new NvidiaManufacturer();
    }
}
