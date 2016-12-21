package bestellung.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bestellung.models.Bestellposition;
import bestellung.service.BestellpositionService;

@RestController
public class BestellpositionController {

	@Autowired
	private BestellpositionService bestellpositionService;

	@RequestMapping(method = RequestMethod.GET, value = "/bestellungen/{bestellungID}/bestellPosition")
	public List<Bestellposition> getAllbestellPosition() {
		return bestellpositionService.getAllbestellPosition();
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
