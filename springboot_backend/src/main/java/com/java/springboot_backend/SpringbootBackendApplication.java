package com.java.springboot_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.springboot_backend.model.User;
import com.java.springboot_backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Nguyen", "Nam", "nam@gmail.com"));
		this.userRepository.save(new User("Pham", "Dung", "dung@gmail.com"));
		this.userRepository.save(new User("Tran", "Tai", "tai@gmail.com"));
		this.userRepository.save(new User("Le", "Phuc", "phuc@gmail.com"));
	}

}
