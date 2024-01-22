package free.biava.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import free.biava.course.entities.Category;
import free.biava.course.entities.Order;
import free.biava.course.entities.User;
import free.biava.course.entities.enums.OrderStatus;
import free.biava.course.repositories.CategoryRepository;
import free.biava.course.repositories.OrderRepository;
import free.biava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User user = new User(null, "Cristiano", "cristiano@goatmail.com", "12345-6789", "12345");
		User user2 = new User(null, "Lionel", "lionel@gmail.com", "54321-9876", "54321");
		
		Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"), OrderStatus.PAID, user); 
		Order o2 = new Order(null, Instant.parse("2024-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2); 
		Order o3 = new Order(null, Instant.parse("2024-07-22T15:21:22Z"), OrderStatus.SHIPPED, user);
		
		userRepository.saveAll(Arrays.asList(user,user2));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	

}
