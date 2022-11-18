package tn.esprit.tpmagasinstock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpmagasinstock.entities.DetailFacture;

import tn.esprit.tpmagasinstock.services.DetailFactureServiceImp;

import java.util.List;
@RestController
@RequestMapping("detailFacture")
public class DetailFactureController {
    @Autowired
    DetailFactureServiceImp detailFactureService;

    @GetMapping("/all")
    List<DetailFacture> getAllDetailFactures () {
        return   detailFactureService.getAll();
    }

    @PostMapping("/add")
    DetailFacture addDetailFacture(@RequestBody DetailFacture detailFacture){
        return detailFactureService.add(detailFacture);
    }

    @PutMapping("/update/{idDetailFacture}")
    DetailFacture updateDetailFacture(@RequestBody DetailFacture detailFacture , @PathVariable Long idDetailFacture) {
        return detailFactureService.update(detailFacture,idDetailFacture) ;
    }

    @DeleteMapping("/delete/{idDetailFacture}")
    void deleteDetailFacture(@PathVariable Long idDetailFacture) {
        detailFactureService.delete(idDetailFacture);
    }
}
