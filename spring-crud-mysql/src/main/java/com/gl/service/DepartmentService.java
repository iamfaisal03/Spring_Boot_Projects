package com.gl.service;

import java.util.List;

import com.gl.Model.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);
	List<Department> fetchDepartments();
	Department updateDepartment(Department department,Long departmentId);
	void deletedepartmentById(Long departmentId);
	
}
