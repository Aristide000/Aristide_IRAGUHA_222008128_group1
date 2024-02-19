package parkingticketsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParkingTicketInput {
    
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/parkingticketsystem";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // SQL query to insert parking ticket information into the database
    private static final String INSERT_TICKET_QUERY = "INSERT INTO parking_tickets (vehicle_id, issue_date_time, location, violation_type, fine_amount, status) VALUES (?, ?, ?, ?, ?, ?)";
    
    public static void main(String[] args) {
        // Parking ticket information to be inserted
        String vehicleId = "ABC123";
        String issueDateTime = "2024-02-18 10:30:00";
        String location = "123 Main Street";
        String violationType = "Expired Meter";
        double fineAmount = 50.00;
        String status = "pending"; // Or you can set it to "paid" or "overdue"
        
        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            // Creating a prepared statement to execute the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TICKET_QUERY);
        ) {
            // Setting parameters for the prepared statement
            preparedStatement.setString(1, vehicleId);
            preparedStatement.setString(2, issueDateTime);
            preparedStatement.setString(3, location);
            preparedStatement.setString(4, violationType);
            preparedStatement.setDouble(5, fineAmount);
            preparedStatement.setString(6, status);
            
            // Executing the query to insert parking ticket information
            int rowsInserted = preparedStatement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Parking ticket information inserted successfully!");
            } else {
                System.out.println("Failed to insert parking ticket information.");
            }
        } catch (SQLException e) {
            System.err.println("Error occurred while inserting parking ticket information: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
