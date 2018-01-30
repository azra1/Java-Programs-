<%--
    Document   : delete
    Created on : Jun 21, 2017, 4:25:35 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<%
    response.setContentType("text/html");  
     
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
%>