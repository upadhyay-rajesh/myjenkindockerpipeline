package com.jenkinsgithub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkinsgithub.entity.Employee;

@RestController
public class MyController {
	
	//fgd
	
	@GetMapping("displayAll")
	public List<Employee> all(){
		List<Employee> eList=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setName("Arun");
		e1.setEmail("arun@gmail.com");
		
		Employee e2=new Employee();
		e2.setName("Sadik");
		e2.setEmail("sadik@gmail.com");
		
		Employee e3=new Employee();
		e3.setName("Donald");
		e3.setEmail("donald@gmail.com");
		
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		
		return eList;
	}

}
