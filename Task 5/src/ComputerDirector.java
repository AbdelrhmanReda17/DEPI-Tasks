import Components.*;
import Manufacturer.Manufacturer;

public class ComputerDirector {
    private final Manufacturer manufacturer;
    public ComputerDirector(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Computer constructGamingPC() {
        ComputerBuilder builder = new ComputerBuilder();
        Component cpu = new CPU(manufacturer, manufacturer + " i9");
        Component gpu = new GPU(manufacturer , manufacturer + " Graphics");
        Component ram = new RAM(manufacturer, manufacturer + " DDR4" , 16);
        Component storage = new Storage(manufacturer , manufacturer + " SSD" , 500);
        Component powerSupply = new PowerSupply(manufacturer , 500);
        return builder.setCpu(cpu).setCpu(cpu).setGpu(gpu).setRam(ram).setStorage(storage).setPowerSupply(powerSupply).build();
    }
}
