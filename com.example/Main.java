import java.sql.SQLException;
import connection.DatabaseConnection;
import services.PostgreSQLService;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        connection.connect();

        // Use PostgreSQLService to interact with the database
        PostgreSQLService service = new PostgreSQLService(connection.getConnection());
        // Example usage:
        service.insertData("some data");
        service.updateData("some data");
        service.getData();
    }
}