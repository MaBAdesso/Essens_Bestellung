package bestellung.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestellung.models.Address;
import bestellung.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

	public Address getAddress(UUID addressID) {
		return addressRepository.findOne(addressID);
	}

	public Address updateAndSave(Address address) {
		return addressRepository.save(address);
	}

	public void deleteLieferant(Address address) {
		addressRepository.delete(address);
	}

}