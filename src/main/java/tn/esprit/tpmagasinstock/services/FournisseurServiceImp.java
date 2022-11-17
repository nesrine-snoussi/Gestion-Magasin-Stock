package tn.esprit.tpmagasinstock.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Fournisseur;

import java.util.List;

@Service
public class FournisseurServiceImp implements ICrudService<Fournisseur , Long > , IFournisseurService  {
    @Override
    public List<Fournisseur> getAll() {
        return null;
    }

    @Override
    public Fournisseur add(Fournisseur class1) {
        return null;
    }

    @Override
    public Fournisseur update(Fournisseur class1, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
