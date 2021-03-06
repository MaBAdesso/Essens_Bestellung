package bestellung.api;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bestellung.models.Lieferant;
import bestellung.service.LieferantenService;

@RestController
public class LieferantenController {

	public LieferantenController() {

	}

	@Autowired
	private LieferantenService lieferantenService;

	/**
	 * gibt alle Leiferanten zurück
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/lieferanten")
	public Page<Lieferant> getAllLieferanten(Pageable pageable) {
		return lieferantenService.listAllByPage(pageable);
	}

	/**
	 * gibt einen bestimmten Leiferanten zurück
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/lieferanten/{lieferantenID}")
	public Lieferant getLieferant(@PathVariable UUID lieferantenID) {
		return lieferantenService.getLieferant(lieferantenID);
	}

	/**
	 * Erstellt einen neuen Lieferanten
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/lieferanten")
	public Lieferant createLieferant(@RequestBody Lieferant lieferant) {
		return lieferantenService.updateAndSave(lieferant);
	}

	/**
	 * 
	 * Verändert die Werte eines Lieferanten
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/lieferanten/{lieferantenID}")
	public Lieferant updateLieferant(@RequestBody Lieferant lieferant) {
		return lieferantenService.updateAndSave(lieferant);
	}

	/**
	 * 
	 * @param lieferantenID
	 * @return
	 */

	@RequestMapping(method = RequestMethod.DELETE, value = "/Lieferanten/{LieferantenID}")
	public void deleteLieferant(@RequestBody Lieferant lieferant) {
		lieferantenService.deleteLieferant(lieferant);
	}

}
