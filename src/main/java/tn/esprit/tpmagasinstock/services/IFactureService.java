package tn.esprit.tpmagasinstock.services;

import tn.esprit.tpmagasinstock.entities.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> getFacturesByClient(Long idClient);
}
