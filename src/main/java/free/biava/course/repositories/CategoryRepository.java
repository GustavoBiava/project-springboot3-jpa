package free.biava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import free.biava.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
