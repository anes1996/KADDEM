package tn.spring.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table( name = "Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contrat implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private boolean archive;
    private Integer montantContrat;
    private Specialite specialite;



}
