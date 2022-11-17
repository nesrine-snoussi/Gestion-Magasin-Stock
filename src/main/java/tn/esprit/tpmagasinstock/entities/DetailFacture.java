package tn.esprit.tpmagasinstock.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFActure ;
    private int qte ;
    private  Float prixTotal ;
    private int pourcentageRemise ;
    private int montantRemise ;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Facture facture;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Produit produit;
}
