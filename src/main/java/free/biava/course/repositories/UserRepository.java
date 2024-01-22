package free.biava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import free.biava.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
