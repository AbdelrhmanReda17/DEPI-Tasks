package P1;
// Dependency Inversion Principle
interface Database {
    void connect();
    void disconnect();
}
public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL database");
    }
}

class Application{
    private final Database mySQLDatabase;

    public Application(Database mySQLDatabase) {
        this.mySQLDatabase = mySQLDatabase;
    }
    public void run(){
        mySQLDatabase.connect();
        mySQLDatabase.disconnect();
    }
}

class Main {
    public static void main(String[] args) {
        Database mySQLDatabase = new MySQLDatabase();
        Application app = new Application(mySQLDatabase);
        app.run();
    }
}