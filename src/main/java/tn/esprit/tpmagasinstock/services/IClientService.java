package tn.esprit.tpmagasinstock.services;

import tn.esprit.tpmagasinstock.entities.CategorieClient;

import java.util.Date;

public interface IClientService {
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
}
