package com.mti.paging;

import com.mti.paging.domains.Country;
import com.mti.paging.repository.CountryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CountryRepo mCountryRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		for (int i = 1; i < 20; i++) {
			mCountryRepo.save(new Country("Canada_" + i, "Torento_" + i));
	
		}
			}

}
