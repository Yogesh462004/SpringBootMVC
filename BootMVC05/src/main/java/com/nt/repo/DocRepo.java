package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Doctor;

public interface DocRepo extends JpaRepository<Doctor, Integer>, CrudRepository<Doctor, Integer>, PagingAndSortingRepository<Doctor, Integer> {
    	  
}
