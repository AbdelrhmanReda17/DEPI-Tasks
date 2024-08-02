package Manufacturer.Factories;

import Manufacturer.Manufacturer;
import Manufacturer.AMDManufacturer;

public class AMDFactory implements ManufacturerFactory {
    @Override
    public Manufacturer createManufacturer() {
        return new AMDManufacturer();
    }
}
