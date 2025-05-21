package it.uniroma3.siw.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Utente;
import it.uniroma3.siw.repository.UtenteRepository;

@Service
public class UtenteService {

    private final UtenteRepository utenteRepository;

    @Autowired
    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public Iterable<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }

    public Optional<Utente> getById(Long id) {
        return utenteRepository.findById(id);
    }

    public Optional<Utente> getByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

    public Utente save(Utente utente) {
        return utenteRepository.save(utente);
    }

    public void delete(Long id) {
        utenteRepository.deleteById(id);
    }
}