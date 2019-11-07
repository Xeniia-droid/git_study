package com.Feature.WSFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsFeaureApplication {

	private static final Logger log = LoggerFactory.getLogger(WsFeaureApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WsFeaureApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new User(1, "Bauer"));
			repository.save(new User(2, "O'Brian"));
			repository.save(new User(3, "Bauer"));
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findAllByName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}






}
