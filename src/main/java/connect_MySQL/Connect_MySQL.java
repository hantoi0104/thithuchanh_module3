package connect_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_MySQL {
    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/quanlynhanvien";
            String username = "root";
            String pass = "mysql.hantoi0104";
            return DriverManager.getConnection(url, username, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
