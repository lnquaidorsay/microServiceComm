package com.ln.customerservice;

import com.ln.customerservice.models.Customer;
import com.ln.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return  args -> {
			customerRepository.save(new Customer(null,"Lionel MOLICK","l.mocli@free.fr"));
			customerRepository.save(new Customer(null,"François WERTZ","w.frnaois@gree.fr"));
			customerRepository.save(new Customer(null,"Marc DUVILER","m.duviler@srce.fr"));
			customerRepository.save(new Customer(null,"Georges SAND","g.sand@wrn.fr"));
			customerRepository.save(new Customer(null,"René GOSCINY","r.gosciny@threa.fr"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
