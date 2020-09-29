package service.impl;

import dao.LoginDao;
import dao.impl.LoginDaoImpl;
import entity.Login;
import service.LoginService;

import java.io.DataOutputStream;
import java.util.Arrays;
import java.util.List;

public class LoginServiceImpl implements LoginService {
    LoginDao loginDao=new LoginDaoImpl();
    @Override
    public Login meForLogin(Login login){
        List<Login> logins=loginDao.mOfLogin(login);
        if (logins==null||logins.size()==0) return null;
        else return logins.get(0);
    }
}
