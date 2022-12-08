package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Produit;
import tn.esprit.tpmagasinstock.entities.Stock;
import tn.esprit.tpmagasinstock.entities.Stock;
import tn.esprit.tpmagasinstock.repositories.ProduitRepository;
import tn.esprit.tpmagasinstock.repositories.StockRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class StockServiceImp implements ICrudService<Stock , Long> , IStockService {
    @Autowired
    StockRepository stockRepository ;
    @Autowired
    ProduitRepository produitRepository ;
    @Override
    public List<Stock> getAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock add(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock update(Stock stock  , Long idProduit) {
        if(stockRepository.findById(idProduit).isPresent()) {

            Stock stock1 = stockRepository.findById(idProduit).get();
            stock1.setQteStock(stock1.getQteStock());
            stock1.setQteMin(stock1.getQteMin());
            stock1.setLibelleStock(stock1.getLibelleStock());



            

            return stockRepository.save(stock1);
        }
        return  null;
    }

    @Override
    public void delete(Long idProduit) {
        stockRepository.deleteById(idProduit);

    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock = stockRepository.findById(idStock).get();
        //System.out.println(stock.getQteStock());
        Produit produit = produitRepository.findById(idProduit).get();
        //System.out.println(produit.getCodeProduit());
        produit.setStock(stock);
        stock.getProduits().add(produit);
        System.out.println(stock.getProduits());
        produitRepository.save(produit);
        stockRepository.save(stock);




    }

    //@Scheduled(fixedDelay = 60000)
    @Scheduled(cron ="0 22 * * ?")
    @Override
    public String retrieveStatusStock() {

        List<Produit> produitList =  stockRepository.getStockProduits() ;
        produitList.stream().forEach(produit -> System.out.println(produit.getLibelleProduit()));
       // System.out.println( produitList.stream().map(Object::toString).toArray(String[]::new)) ;

        return null ;
    }
}
