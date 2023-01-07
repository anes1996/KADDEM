package tn.spring.springboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entity.Universite;
import tn.spring.springboot.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        universiteRepository.save(u);
        return u ;
    }

    @Override
    public Universite updateUniversite(Universite u) {
      universiteRepository.save(u);
        return u;
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
        //universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
