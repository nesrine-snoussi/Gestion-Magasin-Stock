package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Produit;
import tn.esprit.tpmagasinstock.entities.Produit;
import tn.esprit.tpmagasinstock.repositories.ProduitRepository;

import java.util.Date;
import java.util.List;

@Service
public class ProduitServiceImp implements ICrudService<Produit , Long> , IProduitService{
    @Autowired
    ProduitRepository produitRepository ;
    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit add(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit  , Long idProduit) {
        if(produitRepository.findById(idProduit).isPresent()) {

            Produit produit1 = produitRepository.findById(idProduit).get();
            produit1.setCodeProduit(produit.getCodeProduit());
            produit1.setLibelleProduit(produit.getLibelleProduit());
            produit1.setPrixUnitaire(produit.getPrixUnitaire());
            produit1.setDetailFactures(produit.getDetailFactures());
            produit1.setFournisseurs(produit.getFournisseurs());

            return produitRepository.save(produit1);
        }
        return  null;
    }

    @Override
    public void delete(Long idProduit) {
        produitRepository.deleteById(idProduit);

    }

    @Override
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        return produitRepository.getRevenuBrutProduit(produit, startDate, endDate);
    }
}
