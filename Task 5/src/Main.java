import Components.*;
import Manufacturer.*;
import Manufacturer.Factories.AMDFactory;
import Manufacturer.Factories.IntelFactory;
import Manufacturer.Factories.NvidiaFactory;
import Manufacturer.Factories.SamsungFactory;

public class Main {
    public static void main(String[] args) {
        IntelFactory intelFactory = new IntelFactory();
        SamsungFactory samsungFactory = new SamsungFactory();
        NvidiaFactory nvidiaFactory = new NvidiaFactory();
        AMDFactory amdFactory = new AMDFactory();

        ComputerBuilder computerBuilder = new ComputerBuilder();
        Component cpu = new CPU(intelFactory.createManufacturer() , "i9-11900K");
        Component gpu = new GPU(amdFactory.createManufacturer() , "Radeon RX 6900 XT");
        Component ram = new RAM(nvidiaFactory.createManufacturer(), "DDR4" , 16);
        Component storage = new Storage(samsungFactory.createManufacturer() , "SSD" , 500);
        Component powerSupply = new PowerSupply(samsungFactory.createManufacturer() , 500);
        Computer customComputer = computerBuilder
                .setCpu(cpu)
                .setGpu(gpu)
                .setRam(ram)
                .setStorage(storage)
                .setPowerSupply(powerSupply)
                .build();
        System.out.println(customComputer);

        ComputerDirector cd = new ComputerDirector(nvidiaFactory.createManufacturer());
        Computer nvidiaGamingPC = cd.constructGamingPC();
        System.out.println(nvidiaGamingPC);
    }
}