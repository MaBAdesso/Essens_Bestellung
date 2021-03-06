package bestellung.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bestellung.models.Bestellposition;
import bestellung.service.BestellpositionService;

@RestController
public class BestellpositionController {

	public BestellpositionController() {
	}

	@Autowired
	private BestellpositionService bestellpositionService;

	@RequestMapping(method = RequestMethod.GET, value = "/bestellungen/{bestellungID}/bestellPosition")
	public Page<Bestellposition> getAllbestellPosition(Pageable pageable) {
		return bestellpositionService.getAllByPage(pageable);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/bestellungen/{bestellungID}/bestellPosition")
	public Bestellposition createbestellPosition(@RequestBody Bestellposition bestellPosition) {
		return bestellpositionService.updateAndSave(bestellPosition);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/bestellung/{bestellungID}/bestellPosition")
	public Bestellposition updatebestellPosition(@RequestBody Bestellposition bestellPosition) {
		return bestellpositionService.updateAndSave(bestellPosition);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/bestellung/{bestellungID}/bestellPosition")
	public void deletebestellPosition(@RequestBody Bestellposition bestellPosition) {
		bestellpositionService.deletebestellPosition(bestellPosition);
	}

}
