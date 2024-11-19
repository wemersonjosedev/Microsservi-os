package br.com.jose.user_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jose.user_api.domain.User;
import br.com.jose.user_api.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
			new User(null, "valdir Cezar", "valdir@mail.com", "123", 20.0)
		));
    }

}
