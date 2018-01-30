<%-- 
    Document   : roll
    Created on : Jun 22, 2017, 4:17:59 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="err.jsp" %>
<%
int n;
String a=request.getParameter("Roll");
n=Integer.parseInt(a);
out.println(n);
%>