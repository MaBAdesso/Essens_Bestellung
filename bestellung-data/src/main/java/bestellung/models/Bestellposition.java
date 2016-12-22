package bestellung.models;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "bestellposition")
public class Bestellposition extends EntityBase {

	private String name;
	private String artikel;
	private BigDecimal preis;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtikel() {
		return artikel;
	}

	public void setArtikel(String artikel) {
		this.artikel = artikel;
	}

	public BigDecimal getPreis() {
		return preis;
	}

	public void setPreis(BigDecimal preis) {
		this.preis = preis;
	}

}
