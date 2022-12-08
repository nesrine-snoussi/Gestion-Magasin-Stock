package tn.esprit.tpmagasinstock.services;

public interface IStockService {
    void assignProduitToStock(Long idProduit, Long idStock);
    String retrieveStatusStock();
}
