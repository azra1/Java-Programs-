

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Check implements Filter {
    
        @Override
        public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException
           {
                PrintWriter out=response.getWriter();
                String n=request.getParameter("userName");  
                String p=request.getParameter("userPass");  
                String e=request.getParameter("userEmail");  
                String c=request.getParameter("userCountry");
                if(n.length()<1||p.length()<1||e.length()<1||c.length()<1)
                {
                    out.println("One of the labels is blank");
                    RequestDispatcher r=request.getRequestDispatcher("Registration.html");
                    r.forward(request, response);
                }
               else
                {
                    out.println("HI!!! YOu are successfully registered");
                    RequestDispatcher r=request.getRequestDispatcher("Welcome.html");
                    r.forward(request, response);
                }
                    
                }
        
       
        

    @Override
    public void init(FilterConfig filterConfig) {
         
    }

    @Override
    public void destroy() {
           }
        
       
        

}      
