import Components.*;

public class ComputerBuilder {
    private Computer computer;
    public ComputerBuilder() {
        computer = new Computer();
    }

    public ComputerBuilder setCpu(Component cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setGpu(Component gpu) {
        computer.setGpu(gpu);
        return this;
    }

    public ComputerBuilder setRam(Component ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(Component storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder setPowerSupply(Component powerSupply) {
        computer.setPowerSupply(powerSupply);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
