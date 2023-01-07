package tn.spring.springboot.services;

import tn.spring.springboot.entity.Equipe;

import java.util.List;

public interface IEquipeService {

    List <Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe (Equipe equipe);

    Equipe retrieveEquipe (Integer idEquipe);

    void removeEquipe (Integer idEquipe);


}
