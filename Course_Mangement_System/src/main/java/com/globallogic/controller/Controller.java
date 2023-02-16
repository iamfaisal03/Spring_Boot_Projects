package com.globallogic.controller;

import java.rmi.StubNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.entity.Student;
import com.globallogic.service.Service;

@RequestMapping(name = "/students")
@RestController
public class Controller {

	private final Service service;
	
	@Autowired
	public Controller (Service service) {
		this.service=service;
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		
	}
	
	@GetMapping("/findById/{id}")
	public Student findById(@PathVariable int id) throws StubNotFoundException {
		return service.findById(id);
	}
	
	@DeleteMapping("deleteCourse/{id}")
	public void deleteCourse(@PathVariable int id) {
		service.deleteCourse(id);
	}
}
