package tn.spring.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Departement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Departement implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart;
    private String nomDepart;

    @OneToMany (mappedBy = "departement")
    private Set<Etudiant> etudiantSet;
}
