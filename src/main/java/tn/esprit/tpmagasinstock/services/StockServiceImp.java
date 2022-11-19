package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Stock;
import tn.esprit.tpmagasinstock.entities.Stock;
import tn.esprit.tpmagasinstock.repositories.StockRepository;

import java.util.List;

@Service

public class StockServiceImp implements ICrudService<Stock , Long> , IStockService {
    @Autowired
    StockRepository stockRepository ;
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
}
