<%-- 
    Document   : edit2
    Created on : Jun 21, 2017, 4:21:53 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%@page buffer="8kb" %>
<%
response.setContentType("text/html");  
         
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
%>

