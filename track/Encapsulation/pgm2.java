package track.Encapsulation;

class Book {
    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class pgm2 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(50);
        System.out.println(b.getData());
    }
}
