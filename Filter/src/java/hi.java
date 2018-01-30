

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class hi implements Filter {
    
        @Override
        public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException
           {
               PrintWriter out=response.getWriter();
               out.println("BeFORE Processing");
               chain.doFilter(request,response);
               out.println("After Processing");
               
               
        
       
        }

    @Override
    public void init(FilterConfig filterConfig) {
         
    }

    @Override
    public void destroy() {
           }
        
       
        

}      
