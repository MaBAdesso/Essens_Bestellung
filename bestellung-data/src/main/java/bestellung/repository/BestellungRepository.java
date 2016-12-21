package bestellung.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import bestellung.models.Bestellung;

public interface BestellungRepository extends JpaRepository<Bestellung, UUID> {

}
