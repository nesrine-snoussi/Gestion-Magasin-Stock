package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Fournisseur;
@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur ,Long > {
}
