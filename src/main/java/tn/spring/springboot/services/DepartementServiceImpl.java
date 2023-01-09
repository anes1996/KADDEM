package tn.spring.springboot.services;

import tn.spring.springboot.entity.Departement;
import tn.spring.springboot.repositories.DepartementRepository;

import java.util.List;

public class DepartementServiceImpl  implements IDepartementService{

    DepartementRepository departementRepository;

    @Override
    public List<Departement> RetrieveAllDepartements() {
       return (List<Departement>) departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement departement) {
       departementRepository.save(departement);
       return (departement);
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        departementRepository.save(departement);
        return (departement);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepartement) {
        return departementRepository.findById(idDepartement).get();
    }

    @Override
    public void removeDepartement(Integer idDepartement) {
        departementRepository.deleteById(idDepartement);

    }
}
