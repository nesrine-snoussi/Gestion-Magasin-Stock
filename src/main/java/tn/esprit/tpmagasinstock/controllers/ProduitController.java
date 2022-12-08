package tn.esprit.tpmagasinstock.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpmagasinstock.entities.Produit;
import tn.esprit.tpmagasinstock.services.ProduitServiceImp;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("produit")
public class ProduitController {
    @Autowired
    ProduitServiceImp produitService;

    @GetMapping("/All")
    List<Produit> getAllProduits () {
        return   produitService.getAll();
    }

    @PostMapping("/add")
    Produit addProduit(@RequestBody Produit porduit){
        return produitService.add(porduit);
    }

    @PutMapping("/update/{idProduit}")
    Produit updateProduit(@RequestBody Produit porduit , @PathVariable Long idProduit) {
        return produitService.update(porduit,idProduit) ;
    }

    @DeleteMapping("/delete/{idProduit}")
    void deleteProduit(@PathVariable Long idProduit) {
        produitService.delete(idProduit);
    }

    @GetMapping(value = "/getRevenuBrutProduit/{idProduit}/{startDate}/{endDate}")
    public float getRevenuBrutProduit(@PathVariable("idProduit") Long idProduit,
                                      @PathVariable(name = "startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                      @PathVariable(name = "endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        return produitService.getRevenuBrutProduit(idProduit, startDate, endDate);
    }


}
