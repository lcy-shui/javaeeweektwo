package dao;

import entity.Dept;

import java.util.List;


public interface DeptDao {
    boolean addDept(Dept dept);
    boolean delDept(int deptid);
    boolean updDept(Dept dept);
    List<Dept> selAllDept();
}
