package tn.spring.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.Contrat;

public interface ContratRepository extends PagingAndSortingRepository<Contrat,Integer> {

}
