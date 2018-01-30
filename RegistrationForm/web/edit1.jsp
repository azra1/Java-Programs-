<%-- 
    Document   : edit1
    Created on : Jun 21, 2017, 4:20:04 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<%
    response.setContentType("text/html;charset=UTF-8");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");            
            out.println("</head>");
            out.println("<body>");
                      
String n=request.getParameter("userName");  
String p=request.getParameter("userPass");  
String e=request.getParameter("userEmail");  
String c=request.getParameter("userCountry");  
String on=request.getParameter("oName");  
//out.println(n);
            
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/reg","root","");  
  
PreparedStatement ps=con.prepareStatement(  
"update Registration set name=?,password=?,email=?,country=? where name=?");  
  
ps.setString(1,n);  

ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
ps.setString(5,on);
  
int i=ps.executeUpdate();  
if(i>0)
{
    request.setAttribute("msg","Data updated Successfully");
    request.getRequestDispatcher("RegServlet").forward(request,response);
}
            out.println("</body>");
            out.println("</html>");
%>