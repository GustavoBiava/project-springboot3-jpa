package free.biava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import free.biava.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
