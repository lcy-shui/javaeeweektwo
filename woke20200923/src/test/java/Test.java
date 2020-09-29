import com.alibaba.fastjson.JSON;
import dao.impl.EmployeeDaoImpl;

public class Test {
    @org.junit.Test
    public void test(){
        System.out.println(JSON.toJSONString(new EmployeeDaoImpl().sel("",2).get(0)));
    }
}
