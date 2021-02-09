package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository; // do you have an instance of PirateRepository

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSavePirate(){
		// create a pirate
		Pirate pirate = new Pirate("Jack", "Sparrow", 32);
		// get hold of the pirate repo'
		pirateRepository.save(pirate);
		// use it to save the pirate to the DB
	}

}
