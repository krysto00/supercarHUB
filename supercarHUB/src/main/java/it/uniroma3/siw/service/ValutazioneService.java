package it.uniroma3.siw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.model.Valutazione;
import it.uniroma3.siw.repository.ValutazioneRepository;

@Service
public class ValutazioneService {

    private final ValutazioneRepository valutazioneRepository;

    @Autowired
    public ValutazioneService(ValutazioneRepository valutazioneRepository) {
        this.valutazioneRepository = valutazioneRepository;
    }

    public Iterable<Valutazione> getAllValutazioni() {
        return valutazioneRepository.findAll();
    }

    public Optional<Valutazione> getById(Long id) {
        return valutazioneRepository.findById(id);
    }

    public List<Valutazione> getByCarId(Long carId) {
        return valutazioneRepository.findByCarId(carId);
    }

    public Valutazione save(Valutazione valutazione) {
        return valutazioneRepository.save(valutazione);
    }

    public void delete(Long id) {
        valutazioneRepository.deleteById(id);
    }
}