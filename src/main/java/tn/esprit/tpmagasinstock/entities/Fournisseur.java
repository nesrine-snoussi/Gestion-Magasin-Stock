package tn.esprit.tpmagasinstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String codeFournisseur ;
    private String libelleFournisseur ;

    @ManyToMany
    @JoinColumn(name = "idFournisseur")
    @JoinColumn(name = "idProduit")
    private List<Produit> produits;

}
