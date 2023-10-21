package com.spencercode.springbootexample;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.spencercode.springbootexample.customer.Customer;
import com.spencercode.springbootexample.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringBootExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			var faker = new Faker();
			Name name = faker.name();
			String firstName = name.firstName();
			String lastName = name.lastName();
			Random random = new Random();
			Customer customer = new Customer(
					firstName + " " + lastName,
					firstName.toLowerCase() + "." + lastName.toLowerCase() + "@spencer.com",
					random.nextInt(16,99)
			);
			customerRepository.save(customer);
		};
	}
}
