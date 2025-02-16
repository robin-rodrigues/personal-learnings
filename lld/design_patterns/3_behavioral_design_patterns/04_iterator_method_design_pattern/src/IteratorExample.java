import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(120, "Book 1"));
        books.add(new Book(100, "Book 2"));
        books.add(new Book(200, "Book 3"));

        Library library = new Library(books);
        Iterator<Book> iterator = library.createIterator();

        double totalPrice = 0;
        while(iterator.hasNext()) {
            totalPrice += iterator.next().getPrice();
        }

        System.out.println("Total price: " + totalPrice);
    }
}