/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acer
 */
public class Delete extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
         response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        try
        {
            String name=request.getParameter("n");
            
            Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/reg","root","");  
  String q="Delete from registration where name=?";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,name);
int i=ps.executeUpdate();
if(i>0)
{
     request.getRequestDispatcher("RegServlet").forward(request,response);
}
        }catch(Exception e){System.out.println(e);}
    }
}