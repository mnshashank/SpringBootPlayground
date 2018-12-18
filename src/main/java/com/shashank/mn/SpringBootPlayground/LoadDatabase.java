package com.shashank.mn.SpringBootPlayground;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
public class LoadDatabase {
	
	Logger LOG = Logger.getLogger(LoadDatabase.class.getName());

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			LOG.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			LOG.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
		};
	}
	
}
