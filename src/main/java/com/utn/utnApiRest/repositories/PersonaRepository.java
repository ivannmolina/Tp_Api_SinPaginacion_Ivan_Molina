package com.utn.utnApiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utn.utnApiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
