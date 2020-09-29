package dao.impl;

import dao.GoodsDao;
import entity.Goods;
import tools.DBTools;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public List<Goods> selByLike(String name){
        return (List<Goods>) DBTools.exQuery("select * from easybuy_product where name like ?",Goods.class,"%"+name+"%");
    }
}
