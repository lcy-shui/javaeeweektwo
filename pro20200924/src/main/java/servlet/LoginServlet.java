package servlet;

import entity.Login;
import service.LoginService;
import service.impl.LoginServiceImpl;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/aa")
public class LoginServlet extends HttpServlet {
    LoginService loginService=new LoginServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op=req.getParameter("op");
        System.out.println(op);
        if ("login".equals(op)){
            this.login(req,resp);
        }

    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        Login login=new Login(username,password);
        login=loginService.meForLogin(login);
        if (login==null){
            System.out.println("denglushibai");
            req.setAttribute("msg","登录失败");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("login",login);
            int num=(int)this.getServletContext().getAttribute("num");
            this.getServletContext().setAttribute("num",num+1);
            System.out.println("success"+num);
            resp.sendRedirect("success.jsp");
        }
    }
}
