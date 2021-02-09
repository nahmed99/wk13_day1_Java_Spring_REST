package com.example.codeclan.pirateservice.repositories;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // when spring starts create an instance of PirateRepository for later
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
