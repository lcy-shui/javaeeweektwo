package dao.impl;

import dao.EmpDao;
import entity.Emp;
import tools.DBTools;
import tools.Page;

import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
    @Override
    public boolean add(Emp emp) {
        return DBTools.exUpdate("insert into emp values(?,?,?,?,?,?,?,?)",emp.getEmpno(),emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno())>0;
    }

    @Override
    public boolean del(int empid) {
        return DBTools.exUpdate("delete from emp where empno=?",empid)>0;
    }

    @Override
    public boolean upd(Emp emp) {
        return DBTools.exUpdate("update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?",
                emp.getEname(),emp.getJob(),emp.getMgr(),emp.getHiredate(),emp.getSal(),emp.getComm(),emp.getDeptno())>0;
    }

    @Override
    public List<Emp> sel() {
        return (List<Emp>) DBTools.exQuery("select * from emp",Emp.class);
    }
     @Override
     public Emp selById(int id){
        List<Emp> emps = (List<Emp>) DBTools.exQuery("select * from emp where empno=?",Emp.class,id);
        if (emps==null||emps.isEmpty()) return null;
        else return emps.get(0);
     }
     @Override
     public List<Emp> selEmpByName(String name){
        return (List<Emp>) DBTools.exQuery("select * from emp where ename like ?",Emp.class,"%"+name+"%");
     }

    @Override
    public Page<Emp> selByPage(int start, int limit){
        List<Emp> list=new ArrayList<>();
        list=(List<Emp>) DBTools.exQuery("select * from emp limit ?,?",Emp.class,start,limit);
        Page<Emp> page=new Page<>();
        page.setList(list);
        page.setTotal(list.size());
        return page;
    }
}
