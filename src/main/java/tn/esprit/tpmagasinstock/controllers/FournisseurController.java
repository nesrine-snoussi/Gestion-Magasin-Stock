package tn.esprit.tpmagasinstock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpmagasinstock.entities.Fournisseur;
import tn.esprit.tpmagasinstock.services.FournisseurServiceImp;

import java.util.List;

@RestController
@RequestMapping("fournisseur")
public class FournisseurController {
    @Autowired
    FournisseurServiceImp fournisseurService;

    @GetMapping("/All")
    List<Fournisseur> getAllFournisseurs () {
        return  fournisseurService.getAll();
    }

    @PostMapping("/add")
    Fournisseur addFournisseur(@RequestBody Fournisseur fournisseur){
        return fournisseurService.add(fournisseur);
    }

    @PutMapping("/update/{idFournisseur}")
    Fournisseur updateFournisseur(@RequestBody Fournisseur fournisseur , @PathVariable Long idFournisseur) {
        return fournisseurService.update(fournisseur,idFournisseur) ;
    }

    @DeleteMapping("/delete/{idFournisseur}")
    void deleteFournisseur(@PathVariable Long idFournisseur) {
       fournisseurService.delete(idFournisseur);
    }

    @PostMapping("/assignFournisseurToProduit")
    void assignFournisseurToProduit(@RequestParam Long idFournisseur,@RequestParam Long idProduit) {
        fournisseurService.assignFournisseurToProduit(idFournisseur,idProduit);

    }
}
