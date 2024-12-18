package SOLID.DIP;

public interface MySQL {
    void connect();
    void disconnect();
    void query(String query);
}
