package tn.esprit.tpmagasinstock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpmagasinstock.entities.Facture;
import tn.esprit.tpmagasinstock.services.FactureServiceImp;

import java.util.List;
@RestController
@RequestMapping("facture")

public class FactureController {
    @Autowired
    FactureServiceImp factureService;

    @GetMapping("/all")
    List<Facture> getAllFactures () {
        return   factureService.getAll();
    }

    @PostMapping("/add")
    Facture addClient(@RequestBody Facture facture){
        return factureService.add(facture);
    }

    @PutMapping("/update/{idFacture}")
    Facture updateClient(@RequestBody Facture facture , @PathVariable Long idFacture) {
        return factureService.update(facture,idFacture) ;
    }

    @DeleteMapping("/delete/{idFacture}")
    void deleteClient(@PathVariable Long idFacture) {
        factureService.delete(idFacture);
    }
}
