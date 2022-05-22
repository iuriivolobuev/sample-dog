package servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletFilterA implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(ServletFilterA.class.getName() + ": before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(ServletFilterA.class.getName() + ": after");
    }
}
