package entity;

public class Num {
    private int num;

    @Override
    public String toString() {
        return "Num{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Num() {
    }

    public Num(int num) {
        this.num = num;
    }
}
