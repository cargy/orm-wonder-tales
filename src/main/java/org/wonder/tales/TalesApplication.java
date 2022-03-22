package org.wonder.tales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.wonder.tales.domain.Capital;
import org.wonder.tales.domain.Country;
import org.wonder.tales.repository.CountryRepository;

@SpringBootApplication
public class TalesApplication {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(TalesApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Country greece = new Country("Greece");
			Capital athens = new Capital("Athens");
			greece.setCapital(athens);
			countryRepository.save(greece);

			System.out.println("Find country capital:" + countryRepository.findById(greece.getId()).map(Country::getCapital).orElseThrow());
		};
	}

}
