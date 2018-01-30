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
public class Edit extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        try
        {
            String name=request.getParameter("n");
            
            Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/reg","root","");  
  String q="select * from registration where name=?";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,name);
//int i=ps.executeUpdate();
ResultSet rs=ps.executeQuery();
if(rs.next())
{
    out.println("<form action='EditServlet'>");
    out.println("<pre>");
    out.println("Name : <input type='text' name ='userName' value='"+rs.getString(1)+"'>");
    out.println("Password : <input type='password' name ='userPass' value='"+rs.getString(2)+"'>");
    out.println("Email : <input type='text' name ='userEmail' value='"+rs.getString(3)+"'>");
    out.println("Country : <input type='text' name ='userCountry' value='"+rs.getString(4)+"'>");
      out.println("<input type='hidden' name ='oName' value='"+rs.getString(1)+"'>");
    out.println("<input type='submit' value='Edit'>");
    out.println("</pre>");
    out.println("</form>");
}

        }catch(Exception e){}

    }
}