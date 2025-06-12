// WAP to demonstrate database connectivity using JDBC

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement()) {

            System.out.println("✅ Database connected");

            // Example statement
            // st.executeUpdate("INSERT INTO students(name) VALUES('John')");
            
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
}
}