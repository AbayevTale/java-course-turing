package az.edu.turing.module04.lesson4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection conn = new PostgresConfig().getConnection();
       final String sql = "select * from students where  id > 199997";

        try {
            Statement stmt = conn.createStatement();
            stmt.executeQuery(sql);
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                long id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " " + name);
            }

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
