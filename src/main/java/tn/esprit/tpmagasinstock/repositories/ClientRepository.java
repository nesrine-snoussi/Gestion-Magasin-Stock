package tn.esprit.tpmagasinstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpmagasinstock.entities.CategorieClient;
import tn.esprit.tpmagasinstock.entities.Client;

import java.util.Date;

@Repository
public interface ClientRepository extends JpaRepository<Client , Long>{
    @Query
            ("SELECT sum(f.montantFacture) FROM Facture f where f.client.categorieClient=:categorieClient and f.dateFacture between :startDate"
                    + " and :endDate and f.active=true")
    public float getChiffreAffaireParCategorieClient(@Param("categorieClient") CategorieClient categorieClient,
                                                     @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
