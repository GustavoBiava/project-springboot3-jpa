package free.biava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import free.biava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
