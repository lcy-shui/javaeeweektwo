package dao.impl;

import dao.ImgDao;
import entity.Img;
import tools.DBTools;

import java.util.List;

public class ImgDaoImpl implements ImgDao {
    @Override
    public boolean add(Img img){
        return DBTools.exUpdate("insert into img(name,path) values (?,?)",img.getName(),img.getPath())>0;
    }
    @Override
    public List<Img> sel(){
        return (List<Img>) DBTools.exQuery("select * from img",Img.class);
    }
}
