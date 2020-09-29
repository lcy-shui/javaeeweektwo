package service;

import entity.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    boolean delDept(int deptid);
    boolean updDept(Dept dept);
    List<Dept> selAllDept();
}
