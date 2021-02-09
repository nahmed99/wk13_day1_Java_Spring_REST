package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository; // do you have an instance of PirateRepository

	@Autowired
	ShipRepository shipRepository; // do you have an instance of PirateRepository

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSavePirate(){

		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship); // save ship to db

		// create a pirate
		Pirate pirate = new Pirate("Jack", "Sparrow", 32, ship);
		// get hold of the pirate repo' and use it to save the pirate to the DB
		pirateRepository.save(pirate);
	}

}
