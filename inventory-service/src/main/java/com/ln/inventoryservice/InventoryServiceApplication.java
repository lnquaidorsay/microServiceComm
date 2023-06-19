package com.ln.inventoryservice;

import com.ln.inventoryservice.models.Product;
import com.ln.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository) {
		return  args -> {
			productRepository.save(new Product(null,"Computer Desktop HP",900));
			productRepository.save(new Product(null,"Printer Epson",75));
			productRepository.save(new Product(null,"Laptop ASUS",250));
			productRepository.save(new Product(null,"MacBook Laptop pro",1775));
			productRepository.save(new Product(null,"Printer Canon",98));
			productRepository.findAll().forEach(System.out::println);
		};
	}

}
