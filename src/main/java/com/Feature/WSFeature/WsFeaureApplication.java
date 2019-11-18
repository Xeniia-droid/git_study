package com.Feature.WSFeature;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsFeaureApplication {

	private static final Logger log = LoggerFactory.getLogger(WsFeaureApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WsFeaureApplication.class, args);
	}

}
