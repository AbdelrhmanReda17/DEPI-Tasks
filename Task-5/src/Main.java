import Components.*;
import Manufacturer.*;

public class Main {
    public static void main(String[] args) {
        Manufacturer dellManufacturer = new Dell_Manufacturer();
        Manufacturer hpManufacturer = new HP_Manufacturer();
        ComputerBuilder computerBuilder = new ComputerBuilder();

        Component cpu = new CPU(dellManufacturer);
        Component gpu = new GPU(hpManufacturer);
        Component ram = new RAM(dellManufacturer , "DDR4" , 16);
        Component storage = new Storage(hpManufacturer , "SSD" , 500);
        Component powerSupply = new PowerSupply(dellManufacturer , 500);
        
        Computer customComputer = computerBuilder
                .setCpu(cpu)
                .setGpu(gpu)
                .setRam(ram)
                .setStorage(storage)
                .setPowerSupply(powerSupply)
                .build();
        System.out.println(customComputer);
        customComputer.run();

    }
}