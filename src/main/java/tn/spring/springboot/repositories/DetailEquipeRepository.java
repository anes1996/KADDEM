package tn.spring.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.DetailEquipe;

public interface DetailEquipeRepository extends PagingAndSortingRepository<DetailEquipe,Integer> {
}
