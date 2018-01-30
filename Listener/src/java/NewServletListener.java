
import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class NewServletListener implements ServletRequestListener {
int count=0;
long l1,l2;

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
         //To change body of generated methods, choose Tools | Templates.
         l2=System.currentTimeMillis();
         System.out.println("You are Destroyed");
         System.out.println("Time taken: "+(l2-l1));
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        
        if(sre.getServletRequest()!=null)
        count++;
        System.out.println("Currently there are "+count+" users");
        l1=System.currentTimeMillis();//To change body of generated methods, choose Tools | Templates.
    }
}
