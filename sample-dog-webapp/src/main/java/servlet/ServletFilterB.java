package servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletFilterB implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(ServletFilterB.class.getName() + ": before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(ServletFilterB.class.getName() + ": after");
    }
}
