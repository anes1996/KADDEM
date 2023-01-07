package tn.spring.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    public class Etudiant implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idEtudiant")
        private Integer idEtudiant; // Clé primaire
        private String prenomE;
        private String nomE;
        @Enumerated(EnumType.STRING)
       private Option op;
// Constructeur et accesseurs (getters) et mutateurs (setters)

    @ManyToOne
    private Departement departement;

    @ManyToMany
    private Set<Equipe> equipes;

    }

