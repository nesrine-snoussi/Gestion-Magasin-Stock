package tn.esprit.tpmagasinstock.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.DetailFacture;
import tn.esprit.tpmagasinstock.entities.Facture;
import tn.esprit.tpmagasinstock.repositories.DetailFactureRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailFactureServiceImp implements ICrudService<DetailFacture , Long> , IDetailFactureService{
    @Autowired
    DetailFactureRepository detailFactureRepository ;




    @Override
    public List<DetailFacture> getAll() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture add(DetailFacture detailFacture) {
        return detailFactureRepository.save(detailFacture);
    }

    @Override
    public DetailFacture update(DetailFacture detailFacture, Long idDetailFActure) {
        if(detailFactureRepository.findById(idDetailFActure).isPresent()) {

            DetailFacture detailFacture1 = detailFactureRepository.findById(idDetailFActure).get();
            detailFacture1.setMontantRemise(detailFacture.getMontantRemise());
            detailFacture1.setPourcentageRemise(detailFacture.getPourcentageRemise());
            detailFacture1.setQte(detailFacture.getQte());
            detailFacture1.setFacture(detailFacture.getFacture());
            detailFacture1.setPrixTotal(detailFacture1.getPrixTotal());
            detailFacture1.setProduit(detailFacture.getProduit());
            return detailFactureRepository.save(detailFacture1);
        }
        return null;
    }

    @Override
    public void delete(Long idDetailFActure) {
        detailFactureRepository.deleteById(idDetailFActure);


    }
}
