package bestellung;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bestellung.models.Bestellung;
import bestellung.models.Lieferant;

public class ObjectToJsonUtil {

	public static void main(String[] args) throws JsonProcessingException {
		Bestellung bestellung = new Bestellung();
		bestellung.setDeadline(Calendar.getInstance());
		bestellung.setLieferungsZeit(Calendar.getInstance());
		Lieferant lieferant = new Lieferant();
		lieferant.setName("Hallo Welt");
		bestellung.setLieferant(lieferant);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		System.out.println(mapper.writeValueAsString(bestellung));
	}

}
