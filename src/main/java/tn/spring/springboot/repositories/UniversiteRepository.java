package tn.spring.springboot.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tn.spring.springboot.entity.Universite;

public interface UniversiteRepository  extends PagingAndSortingRepository <Universite,Integer> {
}

