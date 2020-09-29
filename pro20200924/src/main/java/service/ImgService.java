package service;

import entity.Img;

import java.util.List;

public interface ImgService {
    boolean add(Img img);

    List<Img> sel();
}
