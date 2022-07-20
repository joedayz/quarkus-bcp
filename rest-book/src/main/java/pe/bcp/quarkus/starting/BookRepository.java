package pe.bcp.quarkus.starting;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class BookRepository {

  @ConfigProperty(name = "books.genre", defaultValue = "Sci-Fi")
  String genre;

  public List<Book> getAllBooks() {

    return List.of(
        new Book(1, "Understanding Quarkus", "Antonio", 2020, genre),
        new Book(2, "Practising Quarkus", "Antonio", 2020, genre),
        new Book(3, "Effective Java", "Josh Block", 2001, genre),
        new Book(4, "Thinking in Java", "Bruce Eckel", 1998, genre)
    );
  }

  public Optional<Book> getBook(int id) {
    return getAllBooks().stream().filter(book -> book.id == id).findFirst();
  }
}
