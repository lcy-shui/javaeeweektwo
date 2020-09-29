package dao.impl;

import dao.EmployeeDao;
import entity.Employee;
import tools.DBTools;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public List<Employee> sel(String name, int job) {
        return (List<Employee>) DBTools.exQuery("select * from employee where EMP_NAME like ? and POST_TYPE=?",Employee.class,"%"+name+"%",job);
    }
}
