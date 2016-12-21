package bestellung.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import bestellung.models.Lieferant;

public interface LieferantRepository extends JpaRepository<Lieferant, UUID> {

}
