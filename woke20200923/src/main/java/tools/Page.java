package tools;

import java.util.List;

public class Page<T> {
    private int pageNow;
    private int total;
    private int pageSize;
    private List<T> list;

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Page(int pageNow, int pageSize) {
        this.pageNow = pageNow;
        this.pageSize = pageSize;
    }

    public Page() {
    }

    public int getTotalPage() {
        return (int) Math.ceil(total/pageSize);
    }
    public int prev(){
        return this.pageNow-1>0?this.pageNow-1:0;
    }
    public int next(){
        return this.pageNow+1<(int) Math.ceil(total/pageSize)?this.pageNow+1:(int) Math.ceil(total/pageSize);
    }
    public int startPage(){
        return (pageNow-1)*pageSize;
    }
}
