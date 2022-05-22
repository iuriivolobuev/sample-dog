package servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloWorldServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(HelloWorldServletContextListener.class.getName() + ": context is initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(HelloWorldServletContextListener.class.getName() + ": context is about to be destroyed");
    }
}
