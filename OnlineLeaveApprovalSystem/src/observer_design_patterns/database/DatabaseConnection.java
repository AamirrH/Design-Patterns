package observer_design_patterns.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DEFAULT_URL = "jdbc:sqlite:OnlineLeaveApprovalSystem/src/observer_design_patterns/database/leave_management.db";

    private DatabaseConnection() {
    }

    public static Connection getConnection() throws SQLException {
        String url = System.getProperty("leave.db.url", DEFAULT_URL);
        return DriverManager.getConnection(url);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("Database connection established");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
            System.out.println("Add sqlite-jdbc to the classpath before running the database demo.");
        }


    }





}
