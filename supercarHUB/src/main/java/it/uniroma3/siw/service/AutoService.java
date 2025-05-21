package it.uniroma3.siw.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Auto;
import it.uniroma3.siw.repository.AutoRepository;

@Service
public class AutoService {

    private final AutoRepository autoRepository;

    @Autowired
    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public Iterable<Auto> getAllAuto() {
        return autoRepository.findAll();
    }

    public Optional<Auto> getAutoById(Long id) {
        return autoRepository.findById(id);
    }

    public Auto saveAuto(Auto auto) {
        return autoRepository.save(auto);
    }

    public void deleteAuto(Long id) {
        autoRepository.deleteById(id);
    }
}