package free.biava.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import free.biava.course.entities.User;
import free.biava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User(null, "Cristiano", "cristiano@goatmail.com", "12345-6789", "12345");
		User user2 = new User(null, "Lionel", "lionel@gmail.com", "54321-9876", "54321");
		
		userRepository.saveAll(Arrays.asList(user,user2));
		
	}
	
	

}
