package Day_50_inheritence;

public class Book {
    String title;
    String type;
    String author;
    double price;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
