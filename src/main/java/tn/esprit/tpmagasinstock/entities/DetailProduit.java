package tn.esprit.tpmagasinstock.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit ;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation ;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDerniereModification ;
    @Enumerated(EnumType.STRING)
    private CategoriProduit categoriProduit ;
    @OneToOne(mappedBy = "detailProduit")
    public Produit produit;

    public DetailProduit(Date dateCreation, Date dateDerniereModification, CategoriProduit categoriProduit) {
        this.dateCreation = new Date();
        this.dateDerniereModification = dateDerniereModification;
        this.categoriProduit = categoriProduit;
    }
}
