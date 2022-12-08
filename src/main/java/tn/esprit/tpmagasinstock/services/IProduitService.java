package tn.esprit.tpmagasinstock.services;

import java.util.Date;

public interface IProduitService {
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) ;
}
