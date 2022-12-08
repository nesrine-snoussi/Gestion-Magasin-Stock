package tn.esprit.tpmagasinstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iStock ;
    private int qteStock;
    private int qteMin ;
    private String libelleStock ;
    @OneToMany(mappedBy = "stock")
    @JsonIgnoreProperties
    private List<Produit> produits;

}
