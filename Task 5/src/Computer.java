import Components.Component;

public class Computer {
    private Component gpu;
    private Component cpu;
    private Component ram;
    private Component storage;
    private Component powerSupply;

    public void setGpu(Component gpu) {
        this.gpu = gpu;
    }

    public void setCpu(Component cpu) {
        this.cpu = cpu;
    }

    public void setRam(Component ram) {
        this.ram = ram;
    }

    public void setStorage(Component storage) {
        this.storage = storage;
    }

    public void setPowerSupply(Component powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void run() {
        gpu.operation();
        cpu.operation();
        ram.operation();
        storage.operation();
        powerSupply.operation();
        System.out.println("Computer is running");
    }

    @Override
    public String toString() {
        return "PC Configuration:\n" +
                " - [GPU: " + gpu + "]\n" +
                " - [CPU: " + cpu + "]\n" +
                " - [RAM: " + ram + "]\n" +
                " - [Storage: " + storage + "]\n" +
                " - [Power Supply: " + powerSupply + "]";
    }
}
