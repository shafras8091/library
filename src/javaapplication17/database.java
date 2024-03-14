
package javaapplication17;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection connect(){
    
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/library", "root", "");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
