package P2;
// Interface Segregation Principle
public interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class OldPrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("OldPrinter - Print");
    }

    @Override
    public void scan() {
        System.out.println("OldPrinter - Scan");
    }
}

class ModernPrinter implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("MultifunctionPrinter - Print");
    }

    @Override
    public void scan() {
        System.out.println("MultifunctionPrinter - Scan");
    }

    @Override
    public void fax() {
        System.out.println("MultifunctionPrinter - Fax");
    }
}

class Main {
    public static void main(String[] args) {
        Printer printer = new OldPrinter();
        printer.print();
        Scanner scanner = new OldPrinter();
        scanner.scan();
        ModernPrinter mp = new ModernPrinter();
        mp.print();
        mp.scan();
        mp.fax();
    }
}

