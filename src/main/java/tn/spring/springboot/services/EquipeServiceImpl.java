package tn.spring.springboot.services;
import tn.spring.springboot.entity.Equipe;
import tn.spring.springboot.repositories.EquipeRepository;

import java.util.List;

public class EquipeServiceImpl  implements IEquipeService{

EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
       return (List<Equipe>) equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe equipe) {
         equipeRepository.save(equipe);
        return equipe;
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        equipeRepository.save(equipe);
        return equipe;
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public void removeEquipe(Integer idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }
}
