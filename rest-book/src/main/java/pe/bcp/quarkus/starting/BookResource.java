package pe.bcp.quarkus.starting;

import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @Inject
    Logger logger;

    @GET
    public List<Book> getAllBooks() {
        logger.info("Returns all the books");  //import org.jboss.logging.Logger;
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        logger.info("Returns the number of books");
        return getAllBooks().size();
    }


    @GET
    @Path("{id}")
    public Optional<Book> getBook(@PathParam("id") int id) {
        logger.info("Returns a single book with id "+ id);
        return bookRepository.getBook(id);
    }
}