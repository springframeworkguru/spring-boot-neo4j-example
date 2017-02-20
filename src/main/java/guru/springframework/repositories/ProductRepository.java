package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends GraphRepository<Product> {
}
