package com.gl.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.Model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long>{

}
