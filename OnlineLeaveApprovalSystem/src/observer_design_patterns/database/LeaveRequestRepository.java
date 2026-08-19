package observer_design_patterns.database;

import observer_design_patterns.LeaveRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeaveRequestRepository {

    public boolean isDatabaseAvailable() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            return connection != null;
        } catch (SQLException e) {
            printDatabaseError(e);
            return false;
        }
    }

    public void createTables() {
        String createFacultyTable = "CREATE TABLE IF NOT EXISTS faculty ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT NOT NULL UNIQUE,"
                + "category TEXT NOT NULL"
                + ")";

        String createLeaveRequestTable = "CREATE TABLE IF NOT EXISTS leave_requests ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "faculty_id INTEGER NOT NULL,"
                + "leave_type TEXT NOT NULL,"
                + "days INTEGER NOT NULL,"
                + "reason TEXT NOT NULL,"
                + "status TEXT NOT NULL,"
                + "FOREIGN KEY (faculty_id) REFERENCES faculty(id)"
                + ")";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(createFacultyTable);
            statement.execute(createLeaveRequestTable);
            System.out.println("Database tables are ready");
        } catch (SQLException e) {
            printDatabaseError(e);
        }
    }

    public int createFaculty(String name, String category) {
        String sql = "INSERT OR IGNORE INTO faculty(name, category) VALUES(?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, category);
            statement.executeUpdate();
            return findFacultyId(name);
        } catch (SQLException e) {
            printDatabaseError(e);
            return 0;
        }
    }

    public int createLeaveRequest(int facultyId, String leaveType, LeaveRequest leaveRequest) {
        String sql = "INSERT INTO leave_requests(faculty_id, leave_type, days, reason, status) VALUES(?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, facultyId);
            statement.setString(2, leaveType);
            statement.setInt(3, leaveRequest.getDays());
            statement.setString(4, leaveRequest.getReason());
            statement.setString(5, leaveRequest.getStatus());
            statement.executeUpdate();

            try (ResultSet keys = statement.getGeneratedKeys()) {
                if (keys.next()) {
                    int id = keys.getInt(1);
                    leaveRequest.setId(id);
                    return id;
                }
            }
        } catch (SQLException e) {
            printDatabaseError(e);
        }

        return 0;
    }

    public void readLeaveRequests() {
        String sql = "SELECT lr.id, f.name, f.category, lr.leave_type, lr.days, lr.reason, lr.status "
                + "FROM leave_requests lr "
                + "JOIN faculty f ON lr.faculty_id = f.id "
                + "ORDER BY lr.id";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            System.out.println("Leave request records:");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " | "
                        + resultSet.getString("name") + " | "
                        + resultSet.getString("category") + " | "
                        + resultSet.getString("leave_type") + " | "
                        + resultSet.getInt("days") + " day(s) | "
                        + resultSet.getString("reason") + " | "
                        + resultSet.getString("status"));
            }
        } catch (SQLException e) {
            printDatabaseError(e);
        }
    }

    public void updateLeaveStatus(int leaveRequestId, String status) {
        String sql = "UPDATE leave_requests SET status = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, status);
            statement.setInt(2, leaveRequestId);
            statement.executeUpdate();
            System.out.println("Database leave status updated to " + status);
        } catch (SQLException e) {
            printDatabaseError(e);
        }
    }

    public void deleteLeaveRequest(int leaveRequestId) {
        String sql = "DELETE FROM leave_requests WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, leaveRequestId);
            statement.executeUpdate();
            System.out.println("Leave request deleted from database");
        } catch (SQLException e) {
            printDatabaseError(e);
        }
    }

    private int findFacultyId(String name) throws SQLException {
        String sql = "SELECT id FROM faculty WHERE name = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id");
                }
            }
        }

        return 0;
    }

    private void printDatabaseError(SQLException e) {
        System.out.println("Database operation failed: " + e.getMessage());
    }
}
