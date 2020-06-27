package zadanie2;


import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class BookService {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAll() {
        return books;
    }

    public List<Book> findByType(Type type) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getType() == type) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByYear(int yearOfPublishment) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublishment() < yearOfPublishment) {
                results.add(book);
            }
        }
        return results;
    }

}