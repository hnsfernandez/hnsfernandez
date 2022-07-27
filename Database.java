package gui;

import java.sql.*;
import com.mysql.cj.jdbc.ConnectionImpl;
import javax.swing.JOptionPane;

public class Database
{
    public static Connection conn()
    {
        Connection conn = null;
        try {
            //open connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           //bus_ticket_system is the database's name, root is its username, and there is no password
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/bus_ticket_system","root","");
                
                //success message
                JOptionPane.showMessageDialog(null, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}


