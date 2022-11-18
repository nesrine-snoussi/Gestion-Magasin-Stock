package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.Fournisseur;
import tn.esprit.tpmagasinstock.entities.Fournisseur;
import tn.esprit.tpmagasinstock.repositories.FournisseurRepository;

import java.util.List;

@Service
public class FournisseurServiceImp implements ICrudService<Fournisseur , Long > , IFournisseurService  {
    @Autowired
    FournisseurRepository fournisseurRepository ;
    @Override
    public List<Fournisseur> getAll() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur add(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur update(Fournisseur fournisseur  , Long idFournisseur) {
        if(fournisseurRepository.findById(idFournisseur).isPresent()) {

            Fournisseur fournisseur1 = fournisseurRepository.findById(idFournisseur).get();
            fournisseur1.setCodeFournisseur(fournisseur.getCodeFournisseur());
            fournisseur1.setLibelleFournisseur(fournisseur.getLibelleFournisseur());

            return fournisseurRepository.save(fournisseur1);
        }
        return null;
    }

    @Override
    public void delete(Long idFournisseur) {
        fournisseurRepository.deleteById(idFournisseur);

    }
}
