


import java.sql.*;
import javax.swing.JOptionPane;

public class connect {

    public static Connection connect() {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "scott");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

}
