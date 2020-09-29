package dao;

import entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> sel(String name,int job);
}
