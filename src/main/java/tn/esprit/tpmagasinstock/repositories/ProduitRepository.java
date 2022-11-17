package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
