package service.impl;

import dao.GoodsDao;
import dao.impl.GoodsDaoImpl;
import entity.Goods;
import service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    GoodsDao goodsDao=new GoodsDaoImpl();
    @Override
    public List<Goods> selByLike(String name){
        return goodsDao.selByLike(name);
    }
}
