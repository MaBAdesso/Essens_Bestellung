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

import bestellung.models.Bestellung;
import bestellung.service.BestellungService;

@RestController
public class BestellungController {

	public BestellungController() {

	}

	@Autowired
	private BestellungService bestellungService;

	@RequestMapping(method = RequestMethod.GET, value = "/bestellungen")
	public Page<Bestellung> getAllBestellungen(Pageable pageable) {
		return bestellungService.getAllByPage(pageable);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/bestellungen/{bestellungID}")
	public Bestellung getBestellung(@PathVariable UUID bestellungID) {

		return bestellungService.getBestellung(bestellungID);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/bestellungen")
	public Bestellung createBestellung(@RequestBody Bestellung bestellung) {

		return bestellungService.updateAndSave(bestellung);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/bestellung/{bestellungID}")
	public Bestellung updateBestellung(@RequestBody Bestellung bestellung) {

		return bestellungService.updateAndSave(bestellung);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/bestellungen/{bestellungID}")
	public void deleteBestellung(@PathVariable UUID bestellungID) {

		bestellungService.deleteBestellung(bestellungID);
	}

}
