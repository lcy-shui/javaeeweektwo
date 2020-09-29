package dao.impl;

import dao.LoginDao;
import entity.Login;
import tools.DBTools;

import java.util.List;

public class LoginDaoImpl implements LoginDao {
    @Override
    public List<Login> mOfLogin(Login login) {
        return (List<Login>) DBTools.exQuery("select * from login where username=? and password =?",Login.class,login.getUsername(),login.getPassword());
    }
}
