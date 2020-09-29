package servlet;

import entity.Img;
import service.ImgService;
import service.impl.ImgServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

@MultipartConfig
@WebServlet("/cc")
public class servlet3 extends HttpServlet {
    ImgService imgService=new ImgServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op=req.getParameter("op");
        if ("add".equals(op)){
            this.add(req,resp);
        }if ("sel".equals(op)){
            this.sel(req,resp);
        }
    }

    private void sel(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Img> imgs =imgService.sel();
        req.setAttribute("imgs",imgs);
        req.getRequestDispatcher("selImg.jsp").forward(req,resp);
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String name=req.getParameter("name");
        Part file = req.getPart("file");
        String path= "/"+UUID.randomUUID().toString()+file.getSubmittedFileName().substring(file.getSubmittedFileName().lastIndexOf("."));
        String path1=this.getServletContext().getRealPath("/upload");
        File f=new File(path1);
        if (!f.exists()){
            f.mkdir();
        }
        file.write(path1+path);
        Img img=new Img(name,"/upload"+path);
        imgService.add(img);
        resp.sendRedirect("fileTest.jsp");
    }
}
