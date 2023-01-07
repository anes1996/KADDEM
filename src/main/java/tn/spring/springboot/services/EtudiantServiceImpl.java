package tn.spring.springboot.services;

import tn.spring.springboot.entity.Etudiant;
import tn.spring.springboot.entity.Universite;
import tn.spring.springboot.repositories.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
        return etudiant ;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {

    }

}
