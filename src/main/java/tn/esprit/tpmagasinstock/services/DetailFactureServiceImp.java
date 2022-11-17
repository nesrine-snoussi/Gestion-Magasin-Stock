package tn.esprit.tpmagasinstock.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpmagasinstock.entities.DetailFacture;

import java.util.List;

@Service
public class DetailFactureServiceImp implements ICrudService<DetailFacture , Long> , IDetailFactureService{

    @Override
    public List<DetailFacture> getAll() {
        return null;
    }

    @Override
    public DetailFacture add(DetailFacture class1) {
        return null;
    }

    @Override
    public DetailFacture update(DetailFacture class1, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
