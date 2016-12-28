package bestellung.models;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity(name = "address")
public class Address extends EntityBase {

	@NotNull
	private String street;

	@NotNull
	@DecimalMax(value = "1503")
	private int houseNumber;

	@NotNull
	@Pattern(regexp = "/^([0]{1}[1-9]{1}|[1-9]{1}[0-9]{1})[0-9]{3}$/")
	private String zipcode;

	@NotNull
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
