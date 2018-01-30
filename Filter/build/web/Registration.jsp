<%-- 
    Document   : Registration
    Created on : Jun 21, 2017, 3:45:00 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.*"%>
<% 
response.setContentType("text/html");
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/reg","root","");  
  
PreparedStatement ps=con.prepareStatement(  
"Insert into Registration values(?,?,?,?)");  
  
ps.setString(1,n);  

ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  

          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");
String q= "Select * from registration";
PreparedStatement p1=con.prepareStatement(q);
ResultSet rs=p1.executeQuery();
out.println("<table align='center' border='1'>");
out.println("<tr><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
while(rs.next())
{
    out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td><a href='Edit?n="+rs.getString(1)+"'>Edit</a></td><td><a href='Delete?n="+rs.getString(1)+"'>Delete</a></td></tr>");
}


      
          
%>
