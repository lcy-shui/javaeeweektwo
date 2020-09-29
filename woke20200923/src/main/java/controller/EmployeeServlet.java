package controller;

import entity.Employee;
import service.EmployeeService;
import service.impl.EmloyeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/aa")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService=new EmloyeeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("ename");
        int job= Integer.parseInt(req.getParameter("job"));
        List<Employee> employees = employeeService.sel(name, job);
        req.setAttribute("list",employees);
        req.getRequestDispatcher("res.jsp").forward(req,resp);
    }
}
