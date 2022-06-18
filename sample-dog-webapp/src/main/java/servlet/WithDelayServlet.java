package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class WithDelayServlet extends GenericServlet {
    @Override public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        servletResponse.getWriter().write("<html><body>Some response.</body></html>");
    }
}
