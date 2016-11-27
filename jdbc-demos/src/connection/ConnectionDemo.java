package connection;

import java.sql.*;
import static java.lang.System.out;

public class ConnectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/abc";
        String user = "root";
        String passwd = "dujinqiao";
        try (Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd)) {
            out.printf("already %s database connection", conn.isClosed() ? "closed" : "open");
        }
    }
}
