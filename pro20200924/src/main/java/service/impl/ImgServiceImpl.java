package service.impl;

import dao.ImgDao;
import dao.impl.ImgDaoImpl;
import entity.Img;
import service.ImgService;

import java.util.List;

public class ImgServiceImpl implements ImgService {
    ImgDao imgDao=new ImgDaoImpl();
    @Override
    public boolean add(Img img){
        return imgDao.add(img);
    }
    @Override
    public List<Img> sel(){
        return imgDao.sel();
    }
}
