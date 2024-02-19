package parkingticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInput {
    
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/parkingticketsystem";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // SQL query to insert user information into the database
    private static final String INSERT_USER_QUERY = "INSERT INTO users (name, contact_email, contact_phone, address, vehicle_id, registration_date, username, password, preferred_language) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    public static void main(String[] args) {
        // User information to be inserted
        String name = "John Doe";
        String contactEmail = "john.doe@example.com";
        String contactPhone = "1234567890";
        String address = "123 Main Street, City, Country";
        String vehicleId = "ABC123";
        String registrationDate = "2024-02-18";
        String username = "johndoe";
        String password = "password123";
        String preferredLanguage = "English";
        
        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Creating a prepared statement to execute the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_QUERY);
        ) {
            // Setting parameters for the prepared statement
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, contactEmail);
            preparedStatement.setString(3, contactPhone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, vehicleId);
            preparedStatement.setString(6, registrationDate);
            preparedStatement.setString(7, username);
            preparedStatement.setString(8, password);
            preparedStatement.setString(9, preferredLanguage);
            
            // Executing the query to insert user information
            int rowsInserted = preparedStatement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("User information inserted successfully!");
            } else {
                System.out.println("Failed to insert user information.");
            }
        } catch (SQLException e) {
            System.err.println("Error occurred while inserting user information: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
