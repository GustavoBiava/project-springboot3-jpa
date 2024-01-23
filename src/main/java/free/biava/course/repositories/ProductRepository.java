package free.biava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import free.biava.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
