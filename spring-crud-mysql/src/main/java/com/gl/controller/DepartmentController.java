package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.Model.Department;
import com.gl.service.DepartmentService;
@RestController
public class DepartmentController {

	
	@Autowired
	 private DepartmentService service;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return service.saveDepartment(department);
	}
	
	@GetMapping("/departments/{id}")
		public List<Department> fetchDepartmentsliList(){
			return service.fetchDepartments();
		}
	@PutMapping("/departments/{id}")
		public Department updateDepartment(@RequestBody Department department,@PathVariable ("id") Long departmentId) {
			return service.updateDepartment(department, departmentId);
			
	}
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable ("id") Long departmentId) {
		service.deletedepartmentById(departmentId);
		return "Deleted Successfully";
	}
	
}
	
	
	

