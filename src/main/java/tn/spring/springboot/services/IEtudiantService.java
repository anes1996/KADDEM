package tn.spring.springboot.services;



import tn.spring.springboot.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant etudiant);

    Etudiant updateEtudiant (Etudiant etudiant);

    Etudiant retrieveEtudiant (Integer idEtudiant);


    void removeEtudiant (Integer idEtudiant);
}
