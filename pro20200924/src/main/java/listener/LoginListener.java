package listener;

import entity.Num;
import tools.DBTools;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;
public class LoginListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        List<Num> num = (List<Num>) DBTools.exQuery("select * from num", Num.class);
        System.out.println("监听"+num.get(0));
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("num",num.get(0).getNum());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        DBTools.exUpdate("update num set num=?",(int)servletContextEvent.getServletContext().getAttribute("num"));
    }
}
