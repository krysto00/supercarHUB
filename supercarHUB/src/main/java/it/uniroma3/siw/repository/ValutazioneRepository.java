package it.uniroma3.siw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import it.uniroma3.siw.model.Valutazione;

@Repository
public interface ValutazioneRepository extends CrudRepository<Valutazione, Long> {
	
	 List<Valutazione> findByCarId(Long supercarId);
}
