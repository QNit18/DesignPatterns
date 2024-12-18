package SOLID.DIP;

public class Database implements MySQL{
    @Override
    public void connect() {
        System.out.println("Connected to database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from database");
    }

    @Override
    public void query(String query) {
        System.out.println("Querying: " + query);
    }
}
