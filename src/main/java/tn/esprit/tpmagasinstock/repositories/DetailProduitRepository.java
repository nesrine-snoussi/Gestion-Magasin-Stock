package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.DetailProduit;
@Repository
public interface DetailProduitRepository extends JpaRepository<DetailProduit, Long> {
}
