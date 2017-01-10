package bestellung.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bestellung.models.Bestellung;
import bestellung.repository.BestellungRepository;

@Service
@Transactional
public class BestellungService {
	@Autowired
	private BestellungRepository bestellungRepository;

	public Page<Bestellung> getAllByPage(Pageable pageable) {
		return bestellungRepository.findAll(pageable);
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
