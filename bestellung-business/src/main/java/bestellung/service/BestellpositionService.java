package bestellung.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import bestellung.models.Bestellposition;
import bestellung.repository.BestellpositionRepository;

@Service
public class BestellpositionService {

	@Autowired
	private BestellpositionRepository bestellpositionRepository;

	public Page<Bestellposition> getAllByPage(Pageable pageable) {

		return bestellpositionRepository.findAll(pageable);
	}

	public Bestellposition updateAndSave(Bestellposition bestellPosition) {

		return bestellpositionRepository.save(bestellPosition);
	}

	public void deletebestellPosition(Bestellposition bestellPosition) {
		bestellpositionRepository.delete(bestellPosition);
	}

}
