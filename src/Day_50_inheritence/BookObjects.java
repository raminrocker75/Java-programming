package Day_50_inheritence;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java";
        book.author = "Savitch";
        book.type = "Programming";
        book.price = 85.0;
        System.out.println(book.toString());
        System.out.println();
        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator= "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();
        System.out.println();
        Ebook ebook = new Ebook();
        ebook.title = "Java";
        ebook.author = "Savitch";
        ebook.type = "Programming";
        ebook.price = 85.0;
        ebook.size = 2;
        ebook.pages = 1000;
        ebook.readBook();

    }
}
