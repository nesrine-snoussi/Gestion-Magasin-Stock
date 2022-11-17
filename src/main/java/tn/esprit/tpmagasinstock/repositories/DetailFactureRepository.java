package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.DetailFacture;
@Repository
public interface DetailFactureRepository extends JpaRepository<DetailFacture , Long > {
}
