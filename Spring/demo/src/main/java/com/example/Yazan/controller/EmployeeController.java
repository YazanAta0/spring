package com.example.Yazan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Yazan.model.entity.Employees;
import com.example.Yazan.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmpService empService;
	
	@GetMapping("/get-emp")
	public Employees getUser(@RequestParam Integer id) {
		return empService.getUser(id);
	}
	
	@GetMapping("/get-all")
	public List<Employees> getUser() {
		return empService.getAll();
	}
	
	@PostMapping("/save-emp")
	public Employees save(@RequestBody Employees employee) {
		return empService.save(employee);
	}
}
