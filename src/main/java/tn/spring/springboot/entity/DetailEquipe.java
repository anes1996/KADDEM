package tn.spring.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailEquipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailEquipe  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe;
    private Integer salle;
    private String thematique;

    @OneToOne (mappedBy = "detailEquipe")
    private Equipe equipe;


}
