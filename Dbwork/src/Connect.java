/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.sql.Connection;
public class Connect {
    Connection con;
    static String url="jdbc:mysql://127.0.0.1:3306/DBWORK";
    static String uname="root";
    static String pass="";
    public static Connection dbconnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, uname, pass);
        }
        catch(Exception e){System.out.println(e);}
        }
    }
    
    
}
