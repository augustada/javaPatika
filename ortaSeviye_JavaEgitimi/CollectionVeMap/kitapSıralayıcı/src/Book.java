import java.util.Comparator;

public class Book {
  private String name;
  private int pageNum;
  private String author;
  private int date;

    public Book(String name, int pageNum) {
        this.name= name;
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}
