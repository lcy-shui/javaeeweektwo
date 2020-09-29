package entity;

public class Employee {
    private int id;
    private int POST_TYPE;
    private String EMP_NAME ;
    private int EMP_SEX;
    private int EMP_AGE;
    private String EMP_DEPART;
    private int EMP_YEAR;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", POST_TYPE=" + POST_TYPE +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", EMP_SEX=" + EMP_SEX +
                ", EMP_AGE=" + EMP_AGE +
                ", EMP_DEPART='" + EMP_DEPART + '\'' +
                ", EMP_YEAR=" + EMP_YEAR +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPOST_TYPE() {
        return POST_TYPE;
    }

    public void setPOST_TYPE(int POST_TYPE) {
        this.POST_TYPE = POST_TYPE;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public int getEMP_SEX() {
        return EMP_SEX;
    }

    public void setEMP_SEX(int EMP_SEX) {
        this.EMP_SEX = EMP_SEX;
    }

    public int getEMP_AGE() {
        return EMP_AGE;
    }

    public void setEMP_AGE(int EMP_AGE) {
        this.EMP_AGE = EMP_AGE;
    }

    public String getEMP_DEPART() {
        return EMP_DEPART;
    }

    public void setEMP_DEPART(String EMP_DEPART) {
        this.EMP_DEPART = EMP_DEPART;
    }

    public int getEMP_YEAR() {
        return EMP_YEAR;
    }

    public void setEMP_YEAR(int EMP_YEAR) {
        this.EMP_YEAR = EMP_YEAR;
    }

    public Employee(int id, int POST_TYPE, String EMP_NAME, int EMP_SEX, int EMP_AGE, String EMP_DEPART, int EMP_YEAR) {
        this.id = id;
        this.POST_TYPE = POST_TYPE;
        this.EMP_NAME = EMP_NAME;
        this.EMP_SEX = EMP_SEX;
        this.EMP_AGE = EMP_AGE;
        this.EMP_DEPART = EMP_DEPART;
        this.EMP_YEAR = EMP_YEAR;
    }

    public Employee() {
    }
}
