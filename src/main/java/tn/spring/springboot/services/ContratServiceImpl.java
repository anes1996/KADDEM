package tn.spring.springboot.services;

import tn.spring.springboot.entity.Contrat;
import tn.spring.springboot.repositories.ContratRepository;

import java.util.List;

public class ContratServiceImpl implements IContratService{

    ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        contratRepository.save(contrat);
        return contrat ;
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        contratRepository.save(contrat);
        return contrat ;
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);

    }
}
