package service.impl;

import dao.DeptDao;
import dao.impl.DeptDaoImpl;
import entity.Dept;
import service.DeptService;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    DeptDao deptDao=new DeptDaoImpl();
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public boolean delDept(int deptid) {
        return deptDao.delDept(deptid);
    }

    @Override
    public boolean updDept(Dept dept) {
        return deptDao.updDept(dept);
    }

    @Override
    public List<Dept> selAllDept() {
        return deptDao.selAllDept();
    }
}
