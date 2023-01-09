package tn.spring.springboot.services;

import tn.spring.springboot.entity.Departement;

import java.util.List;

public interface IDepartementService {

    List <Departement> RetrieveAllDepartements();

    Departement addDepartement (Departement departement);

    Departement updateDepartement (Departement departement);

    Departement retrieveDepartement (Integer idDepartement);

    void removeDepartement (Integer idDepartement);
}
