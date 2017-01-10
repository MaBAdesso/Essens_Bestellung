package bestellung.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "bestellung")
public class Bestellung extends EntityBase {

	@JsonFormat(pattern = "yyyyMMddHHmm")
	private Calendar deadline;

	@JsonFormat(pattern = "yyyyMMddHHmm")
	private Calendar lieferungsZeit;

	@OneToOne(cascade = CascadeType.DETACH) // beim löschen wird Lieferant nicht
											// gelöscht
	private Lieferant lieferant;

	@OneToMany(cascade = CascadeType.ALL) // beim löschen werden alle
											// Bestellpostion ebenfalls gelöscht
	private List<Bestellposition> positionen;

	public Calendar getDeadline() {
		return deadline;
	}

	public void setDeadline(Calendar deadline) {
		this.deadline = deadline;
	}

	public Calendar getLieferungsZeit() {
		return lieferungsZeit;
	}

	public void setLieferungsZeit(Calendar lieferungsZeit) {
		this.lieferungsZeit = lieferungsZeit;
	}

	public List<Bestellposition> getPositionen() {
		return positionen;
	}

	public void setPositionen(List<Bestellposition> positionen) {
		this.positionen = positionen;
	}

	public Lieferant getLieferant() {
		return lieferant;
	}

	public void setLieferant(Lieferant lieferant) {
		this.lieferant = lieferant;
	}

}
