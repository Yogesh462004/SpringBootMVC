package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Doctor;
import com.nt.repo.DocRepo;

@Service
public class Service1 {
	@Autowired
	private DocRepo repo;
public Iterable<Doctor> getall(){
	return repo.findAll();
}
public String edit(Doctor doc) {
	repo.save(doc);
	return "Updated SuccessFully";
}
public String delete(Integer id) {
	repo.deleteById(id);
	return "Delted SuccessFully";
	
}
public String edit1(Doctor doc) {
	edit(doc);
	return "Added SuccessFully";
}
}
