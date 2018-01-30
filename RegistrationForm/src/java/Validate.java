
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/reg","root","");
         PreparedStatement ps =con.prepareStatement
                             ("Select * from register where email=? and password=?");
         ps.setString(1, email);
         ps.setString(2, pass);
          ResultSet i =ps.executeQuery();
         st = i.next();
        
      }catch(Exception e)
      {
          System.out.println(e);
      }
         return st;                 
  }   
}