package lesson_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class ConnectLocalBase {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "admin";
        String password = "admin";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected was successfully!");

            String sql = "SELECT * FROM clients";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("full_name");
                    Timestamp createdAt = rs.getTimestamp("created_at");

                    System.out.printf("%d | %s | %s%n", id, name, createdAt);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR:");
            e.printStackTrace();
        }
    }
}