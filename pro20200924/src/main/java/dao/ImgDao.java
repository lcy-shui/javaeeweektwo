package dao;

import entity.Img;

import java.util.List;

public interface ImgDao {
    boolean add(Img img);

    List<Img> sel();
}
