package bestellung.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bestellung.models.Bestellung;
import bestellung.repository.BestellungRepository;

@Service
@Transactional
public class BestellungService {
	@Autowired
	private BestellungRepository bestellungRepository;

	public List<Bestellung> getAllBestellungen() {
		return bestellungRepository.findAll();
	}

	public Bestellung getBestellung(UUID bestellungID) {
		return bestellungRepository.findOne(bestellungID);
	}

	public Bestellung updateAndSave(Bestellung bestellung) {
		return bestellungRepository.save(bestellung);
	}

	public void deleteBestellung(UUID bestellungID) {
		bestellungRepository.delete(bestellungID);
	}

}
