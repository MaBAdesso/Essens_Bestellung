package bestellung.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestellung.models.Bestellposition;
import bestellung.repository.BestellpositionRepository;

@Service
public class BestellpositionService {

	@Autowired
	private BestellpositionRepository bestellpositionRepository;

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEMF(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public List<Bestellposition> getAllbestellPosition() {
		EntityManager em = emf.createEntityManager();

		return bestellpositionRepository.findAll();
	}

	public Bestellposition updateAndSave(Bestellposition bestellPosition) {

		return bestellpositionRepository.save(bestellPosition);
	}

	public void deletebestellPosition(Bestellposition bestellPosition) {
		bestellpositionRepository.delete(bestellPosition);
	}

}
