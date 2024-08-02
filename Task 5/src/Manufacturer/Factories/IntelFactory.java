package Manufacturer.Factories;


import Manufacturer.IntelManufacturer;
import Manufacturer.Manufacturer;

public class IntelFactory implements ManufacturerFactory {
    @Override
    public Manufacturer createManufacturer() {
        return new IntelManufacturer();
    }
}
