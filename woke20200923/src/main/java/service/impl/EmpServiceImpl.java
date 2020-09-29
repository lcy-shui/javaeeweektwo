package service.impl;

import dao.EmpDao;
import dao.impl.EmpDaoImpl;
import entity.Emp;
import service.EmpService;
import tools.Page;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    EmpDao empDao=new EmpDaoImpl();
    @Override
    public boolean add(Emp emp) {
        if (empDao.selById(emp.getEmpno())!=null) return false;
        else return empDao.add(emp);
    }

    @Override
    public boolean del(int empid) {
        return empDao.del(empid);
    }

    @Override
    public boolean upd(Emp emp) {
        return empDao.upd(emp);
    }

    @Override
    public List<Emp> sel() {
        return empDao.sel();
    }

    @Override
    public List<Emp> selEmpByName(String name) {
        return empDao.selEmpByName(name);
    }

    @Override
    public Page<Emp> selByPage(int pageNow, int limit){
        Page<Emp> page=new Page<>();
        page.setPageNow(pageNow);
        page.setPageSize(limit);
        page=empDao.selByPage(page.startPage(),limit);
        page.setPageNow(pageNow);
        page.setPageSize(limit);
        return page;
    }
}
