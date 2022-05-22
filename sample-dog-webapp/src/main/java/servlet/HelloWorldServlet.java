package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println(HelloWorldServlet.class.getName());
        servletResponse.getWriter().write("<html><body>Hello World Servlet</body></html>");
    }
}
