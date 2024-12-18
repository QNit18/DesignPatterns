package SOLID.DIP;

public class ErrorExample {

    // In this case, UserService is tightly coupled with Database class. If we want to change the database,
    // we have to change the UserService class,violating the Dependency Inversion Principle.

    // Low-level module
    class Database {
        public void save(String data) {
            System.out.println("Saving to database: " + data);
        }
    }

    // High-level module that directly depends on the low-level module
    class UserService {
        private Database database;

        public UserService() {
            this.database = new Database();  // Tight coupling between UserService and Database
        }

        public void saveUser(String username) {
            database.save(username);
        }
    }

}
