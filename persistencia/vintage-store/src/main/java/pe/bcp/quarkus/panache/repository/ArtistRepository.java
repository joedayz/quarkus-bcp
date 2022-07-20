package pe.bcp.quarkus.panache.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import pe.bcp.quarkus.jdbc.Artist;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ArtistRepository implements PanacheRepository<Artist> {

  public List<Artist> listAllArtistsSorted() {
    return listAll(Sort.descending("name"));
  }
}
