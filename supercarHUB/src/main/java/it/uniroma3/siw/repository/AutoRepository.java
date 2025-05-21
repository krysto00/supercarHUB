package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import it.uniroma3.siw.model.Auto;

@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {
}
