package service;

import entity.Employee;

import java.util.List;

public interface EmployeeService{
    List<Employee> sel(String name, int job);
}
