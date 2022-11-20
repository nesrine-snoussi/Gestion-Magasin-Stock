package tn.esprit.tpmagasinstock.repositories;

import com.mysql.cj.xdevapi.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Facture;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture ,Long> {


   // List<Facture> findFactureByClient(Long idClient);
}
