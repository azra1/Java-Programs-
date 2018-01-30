import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        if(Validate.checkUser(email, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        }*/
    
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/reg","root","");
         String email = request.getParameter("email");
        String pass = request.getParameter("pass");

         PreparedStatement ps =con.prepareStatement
                             ("Select * from register where email=? and password=?");
         ps.setString(1, email);
         ps.setString(2, pass);
        ResultSet i =ps.executeQuery();
         st = i.next();
         if(st)
         {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
             
         }
        
      }catch(Exception e)
      {
          System.out.println(e);
      }
         //return st;                 
  }   
    }  
    


