package service;

import entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> selByLike(String name);
}
