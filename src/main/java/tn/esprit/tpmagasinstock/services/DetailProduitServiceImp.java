package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.DetailProduit;
import tn.esprit.tpmagasinstock.entities.DetailProduit;
import tn.esprit.tpmagasinstock.repositories.DetailProduitRepository;

import java.util.List;

@Service
public class DetailProduitServiceImp implements ICrudService<DetailProduit , Long> ,IDetailProduitService{

    @Autowired
    DetailProduitRepository detailProduitRepository ;




    @Override
    public List<DetailProduit> getAll() {
        return detailProduitRepository.findAll();
    }

    @Override
    public DetailProduit add(DetailProduit detailProduit) {
        return detailProduitRepository.save(detailProduit);
    }

    @Override
    public DetailProduit update(DetailProduit detailProduit, Long idDetailProduit) {
        if(detailProduitRepository.findById(idDetailProduit).isPresent()) {

            DetailProduit detailProduit1 = detailProduitRepository.findById(idDetailProduit).get();
            detailProduit1.setProduit(detailProduit.getProduit());
            detailProduit1.setCategoriProduit(detailProduit.getCategoriProduit());
            return detailProduitRepository.save(detailProduit1);
        }
        return null;
    }

    @Override
    public void delete(Long idDetailProduit) {
        detailProduitRepository.deleteById(idDetailProduit);


    }
}
