package com.gl.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.Model.Department;
import com.gl.repositary.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepo repo;
	
	@Override
	public Department saveDepartment(Department department) {
		return  repo.save(department);
	}

	@Override
	public List<Department> fetchDepartments() {
		return (List<Department>)repo.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		Department departDB=repo.findById(departmentId).get();
		if (Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName())){
			departDB.setDepartmentName(department.getDepartmentName());
		}
		if (Objects.nonNull(department.getDepartmentAddress())&& !"".equalsIgnoreCase(department.getDepartmentAddress())){
			departDB.setDepartmentAddress(department.getDepartmentAddress());
			
		}
		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
			departDB.setDepartmentAddress(department.getDepartmentCode());
			
			
		}
		return repo.save(departDB) ;
	}

	@Override
	public void deletedepartmentById(Long departmentId) {
		repo.deleteById(departmentId);
	}
	

}
