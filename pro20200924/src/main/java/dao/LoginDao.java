package dao;

import entity.Login;

import java.util.List;

public interface LoginDao {
    List<Login> mOfLogin(Login login);
}
