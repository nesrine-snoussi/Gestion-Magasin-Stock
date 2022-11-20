package tn.esprit.tpmagasinstock.services;

public interface IFournisseurService {
    void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
