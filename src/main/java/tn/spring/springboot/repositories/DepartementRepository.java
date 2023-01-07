package tn.spring.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.Departement;

public interface DepartementRepository extends PagingAndSortingRepository <Departement,Integer> {
}
