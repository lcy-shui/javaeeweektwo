package service.impl;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import entity.Employee;
import service.EmployeeService;

import java.util.List;

public class EmloyeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao=new EmployeeDaoImpl();
    @Override
    public List<Employee> sel(String name, int job) {
        return employeeDao.sel(name,job);
    }
}
