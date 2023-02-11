package com.example.Yazan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.Yazan.model.entity.Employees;
import com.example.Yazan.repository.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	public Employees getUser(Integer id) {
		Optional<Employees> emp = this.empRepo.findById(id); // question
		if(emp.isPresent())
			return emp.get();
		return null;
		//or
		//return emp.orElse(null);
	}
	
	public List<Employees> getAll() {
		return empRepo.findAll();
	}
	
	@CrossOrigin
	public Employees save(Employees employee) {
		return this.empRepo.save(employee);
	}
}
