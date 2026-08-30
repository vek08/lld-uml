import java.util.ArrayList;
import java.util.List;
public class Library{
    private String name;
    private List<Book> books;

    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void removeBook(Book b){
        books.remove(b);
    }

}

