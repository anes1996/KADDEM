package tn.spring.springboot.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.Etudiant;

import java.util.List;

public interface EtudiantRepository extends PagingAndSortingRepository <Etudiant,Integer> {

    //List<Etudiant>
    //findByDepartementnomDepart(String nom);

}
