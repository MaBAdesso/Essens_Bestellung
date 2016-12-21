package bestellung.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import bestellung.models.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
