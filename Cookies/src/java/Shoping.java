
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Shoping extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        request.getRequestDispatcher("index.html").include(request, response);
        String name=request.getParameter("name");
        Cookie ck=new Cookie("Name",name);
        response.addCookie(ck);
       
        
    }
    
}