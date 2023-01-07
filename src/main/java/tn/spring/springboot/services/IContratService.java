package tn.spring.springboot.services;

import tn.spring.springboot.entity.Contrat;

import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat (Contrat contrat);

    Contrat updateContrat (Contrat contrat);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat (Integer idContrat);

}
