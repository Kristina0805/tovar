package tovar;
public class Book extends Product {

    private String author;


    public Book(int productId,String name, String author) {
        super(productId, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
