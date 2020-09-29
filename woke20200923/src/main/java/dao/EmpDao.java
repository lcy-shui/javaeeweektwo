package dao;

import entity.Emp;
import tools.Page;

import java.util.List;

public interface EmpDao {
    boolean add(Emp emp);
    boolean del(int empid);
    boolean upd(Emp emp);
    List<Emp> sel();

    Emp selById(int id);

    List<Emp> selEmpByName(String name);

    Page<Emp> selByPage(int start, int limit);
}
