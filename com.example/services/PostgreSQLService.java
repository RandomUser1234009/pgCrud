package services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgreSQLService {
    private final Connection connection;

    public PostgreSQLService(Connection connection) {
        this.connection = connection;
    }

    public void insertData(String data) {
        // Replace with your actual insert logic
        String sql = "INSERT INTO your_table (data) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, data);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(String data) {
        // Replace with your actual update logic
        String sql = "UPDATE your_table SET data = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, data);
            preparedStatement.setInt(2, someId); // Replace with actual id
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getData() {
        // Replace with your actual select logic
        String sql = "SELECT * FROM your_table";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                // Process data
                String data = resultSet.getString("data");
                System.out.println(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}