package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Rayon;
@Repository
public interface RayonRepository extends JpaRepository<Rayon ,Long > {
}
