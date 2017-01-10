package bestellung.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bestellung.models.Lieferant;
import bestellung.repository.LieferantRepository;

@Service
@Transactional
public class LieferantenService {

	@Autowired
	private LieferantRepository lieferantenRepository;

	public Page<Lieferant> listAllByPage(Pageable pageable) {
		return lieferantenRepository.findAll(pageable);
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