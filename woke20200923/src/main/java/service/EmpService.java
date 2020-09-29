package service;

import entity.Emp;
import tools.Page;

import java.util.List;

public interface EmpService {
    boolean add(Emp emp);
    boolean del(int empid);
    boolean upd(Emp emp);
    List<Emp> sel();
    List<Emp> selEmpByName(String name);

    Page<Emp> selByPage(int pageNow, int limit);
}
