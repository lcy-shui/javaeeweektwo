package controller;

import entity.Emp;
import service.EmpService;
import service.impl.EmpServiceImpl;
import tools.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cc")
public class pageServlet extends HttpServlet {
    EmpService empService=new EmpServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pagenow= Integer.parseInt(req.getParameter("pagenow"));
        int limit= Integer.parseInt(req.getParameter("limit"));
        Page<Emp> page=empService.selByPage(pagenow,limit);
        req.setAttribute("page",page);
        req.getRequestDispatcher("limit.jsp").forward(req,resp);
    }
}
