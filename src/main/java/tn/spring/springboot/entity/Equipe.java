package tn.spring.springboot.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Equipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")


    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany
    private Set<Etudiant> etudiants;

}
