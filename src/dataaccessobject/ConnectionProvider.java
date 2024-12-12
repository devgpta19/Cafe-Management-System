/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccessobject;
import java.sql.*;
/**
 *
 * @author Devansh Gupta
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","devansh");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
