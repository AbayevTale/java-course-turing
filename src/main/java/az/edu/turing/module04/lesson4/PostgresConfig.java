package az.edu.turing.module04.lesson4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConfig {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/postgres",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
