
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nathaniel T. Duller
 */
public class Connection_SQL {
    
    /**
     *
     * @return
     */
    public static Connection getConnection() {
        
        Connection con = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/signup_info", "root", "");
            
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
       
        return con;
    }
    
    
    
}
