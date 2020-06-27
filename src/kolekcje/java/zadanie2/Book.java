package zadanie2;

import java.util.List;
import java.util.Objects;

enum Typ{
    Action,Drama,Science_Ficition
}
public class Book {
    private String title;
    private float price;
    private int yearOfPublishment;
    private List<Author> authors;
    private Typ typ;

    public Book(String title, float price, int yearOfPublishment, List<Author> authors, Typ typ) {
        this.title = title;
        this.price = price;
        this.yearOfPublishment = yearOfPublishment;
        this.authors = authors;
        this.typ = typ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Float.compare(book.getPrice(), getPrice()) == 0 &&
                getYearOfPublishment() == book.getYearOfPublishment() &&
                Objects.equals(getTitle(), book.getTitle()) &&
                Objects.equals(getAuthors(), book.getAuthors()) &&
                getTyp() == book.getTyp();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPrice(), getYearOfPublishment(), getAuthors(), getTyp());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublishment=" + yearOfPublishment +
                ", authors=" + authors +
                ", typ=" + typ +
                '}';
    }
}
