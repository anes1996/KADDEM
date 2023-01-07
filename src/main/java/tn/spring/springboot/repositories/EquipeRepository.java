package tn.spring.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.Equipe;

public interface EquipeRepository extends PagingAndSortingRepository <Equipe,Integer> {

}
