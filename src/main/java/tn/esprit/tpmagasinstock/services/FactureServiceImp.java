package tn.esprit.tpmagasinstock.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Facture;

import java.util.List;

@Service
public class FactureServiceImp implements ICrudService<Facture ,Long> , IFactureService{



    @Override
    public List<Facture> getAll() {
        return null;
    }

    @Override
    public Facture add(Facture class1) {
        return null;
    }

    @Override
    public Facture update(Facture class1, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
