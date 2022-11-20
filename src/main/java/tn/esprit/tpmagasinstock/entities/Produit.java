package tn.esprit.tpmagasinstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoduit ;
    private String codeProduit;
    private String libelleProduit ;
    private Float prixUnitaire ;
    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
    @OneToOne
    public DetailProduit detailProduit;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Stock stock;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Rayon rayon;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    @JoinColumn(name = "idProduit")
    private List<Fournisseur> fournisseurs;

}
