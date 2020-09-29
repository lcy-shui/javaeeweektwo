package dao.impl;

import dao.DeptDao;
import entity.Dept;
import tools.DBTools;

import java.util.List;

public class DeptDaoImpl implements DeptDao {
    @Override
    public boolean addDept(Dept dept) {
        return DBTools.exUpdate("insert into dept values(?,?,?)",dept.getDeptno(),dept.getDname(),dept.getLoc())>0;
    }

    @Override
    public boolean delDept(int deptid) {
        return DBTools.exUpdate("delete from dept where deptno=?",deptid)>0;
    }

    @Override
    public boolean updDept(Dept dept) {
        return DBTools.exUpdate("update dept set dname=?,loc=? where deptno=?",dept.getDname(),dept.getLoc(),dept.getDeptno())>0;
    }

    @Override
    public List<Dept> selAllDept() {
        return (List<Dept>) DBTools.exQuery("select * from dept",Dept.class);
    }
}
