package bestellung.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestellung.models.Lieferant;
import bestellung.repository.LieferantRepository;

@Service
public class LieferantenService {

	@Autowired
	private LieferantRepository lieferantenRepository;

	public List<Lieferant> getAllLieferanten() {
		return lieferantenRepository.findAll();
	}

	public Lieferant getLieferant(UUID lieferantenID) {
		return lieferantenRepository.findOne(lieferantenID);
	}

	public Lieferant updateAndSave(Lieferant lieferant) {
		return lieferantenRepository.save(lieferant);
	}

	public void deleteLieferant(Lieferant lieferant) {
		lieferantenRepository.delete(lieferant);
	}

}