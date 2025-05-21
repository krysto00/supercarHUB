package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import it.uniroma3.siw.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
}
