package com.example.e_learning_platform;

import com.example.e_learning_platform.models.Author;
import com.example.e_learning_platform.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ELearningPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELearningPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository) {
		return args -> {
			var author = Author.builder()
					.firstName("Marcos")
					.lastName("Chong")
					.age(28)
					.email("marcoschong@gmail.com")
					.build();
			repository.save(author);
		};
	}

}
