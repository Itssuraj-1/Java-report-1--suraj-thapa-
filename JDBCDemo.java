// WAP to demonstrate database connectivity using JDBC
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Create statement and execute query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Database error: " + e);
        }
    }
}
// Note: Ensure you have the MySQL JDBC driver in your classpath to run this code.
// Make sure to replace "testdb", "root", and "password" with your actual database name, username, and password.
// Also, ensure that the MySQL server is running and the database is accessible.
// This code demonstrates how to connect to a MySQL database using JDBC, execute a query, and handle exceptions that may occur during the process.
// Ensure you have the MySQL JDBC driver in your classpath to run this code.