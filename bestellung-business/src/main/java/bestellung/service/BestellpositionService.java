package bestellung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestellung.models.Bestellposition;
import bestellung.repository.BestellpositionRepository;

@Service
public class BestellpositionService {

	@Autowired
	private BestellpositionRepository bestellpositionRepository;

	public List<Bestellposition> getAllbestellPosition() {
		return bestellpositionRepository.findAll();
	}

	public Bestellposition updateAndSave(Bestellposition bestellPosition) {
		return bestellpositionRepository.save(bestellPosition);
	}

	public void deletebestellPosition(Bestellposition bestellPosition) {
		bestellpositionRepository.delete(bestellPosition);
	}

}
