package controller;

import com.google.gson.Gson;
import entity.Goods;
import service.GoodsService;
import service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet("/ff")
public class GoodsServlet extends HttpServlet {
    GoodsService goodsService=new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        List<Goods> goods=goodsService.selByLike(name);
        Gson gson=new Gson();
        String goodjson=gson.toJson(goods);
        PrintWriter out = resp.getWriter();
        out.write(goodjson);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
