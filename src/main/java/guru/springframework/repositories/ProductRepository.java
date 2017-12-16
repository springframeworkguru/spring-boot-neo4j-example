package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends Neo4jRepository<Product, Long> {
}
