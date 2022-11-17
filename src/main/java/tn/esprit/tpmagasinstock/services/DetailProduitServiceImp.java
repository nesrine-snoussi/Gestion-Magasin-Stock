package tn.esprit.tpmagasinstock.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.DetailProduit;

import java.util.List;

@Service
public class DetailProduitServiceImp implements ICrudService<DetailProduit , Long> ,IDetailProduitService{

    @Override
    public List<DetailProduit> getAll() {
        return null;
    }

    @Override
    public DetailProduit add(DetailProduit class1) {
        return null;
    }

    @Override
    public DetailProduit update(DetailProduit class1, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
