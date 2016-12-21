package bestellung.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import bestellung.models.Bestellposition;

public interface BestellpositionRepository extends JpaRepository<Bestellposition, UUID> {

}
