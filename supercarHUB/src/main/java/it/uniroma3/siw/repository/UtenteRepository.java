package it.uniroma3.siw.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import it.uniroma3.siw.model.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {
	
	Optional<Utente> findByUsername(String username);
	
}
