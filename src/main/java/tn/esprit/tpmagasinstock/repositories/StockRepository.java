package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock , Long> {

}
