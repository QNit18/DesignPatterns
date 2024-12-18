package SOLID.DIP;

// high-level module
public class UserService {

    public static void main(String[] args) {
        MySQL mySQL = new Database();
        UserService userService = new UserService(mySQL);
        userService.createUser();
    }

    private MySQL mySQL;

    public UserService(MySQL mySQL) {
        this.mySQL = mySQL; // UserService is no longer tightly coupled with Database class
    }

    public void createUser() {
        mySQL.connect();
        mySQL.query("INSERT INTO users VALUES ('John', 'Doe')");
        mySQL.disconnect();
    }
}
