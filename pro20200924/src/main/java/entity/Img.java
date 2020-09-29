package entity;

public class Img {
    private int id;
    private String name;
    private String path;

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Img() {
    }

    public Img(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public Img(int id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }
}
