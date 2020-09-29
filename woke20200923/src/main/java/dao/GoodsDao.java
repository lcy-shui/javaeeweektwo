package dao;

import entity.Goods;

import java.util.List;

public interface GoodsDao {
    List<Goods> selByLike(String name);
}
