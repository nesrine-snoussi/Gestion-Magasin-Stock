package tn.esprit.tpmagasinstock.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Produit;

import java.util.List;

@Service
public class ProduitServiceImp implements ICrudService<Produit , Long> , IProduitService{
    @Override
    public List<Produit> getAll() {
        return null;
    }

    @Override
    public Produit add(Produit class1) {
        return null;
    }

    @Override
    public Produit update(Produit class1, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
