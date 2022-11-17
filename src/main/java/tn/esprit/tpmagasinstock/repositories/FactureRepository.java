package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Facture;
@Repository
public interface FactureRepository extends JpaRepository<Facture ,Long> {
}
