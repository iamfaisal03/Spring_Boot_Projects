package com.globallogic.service;

import java.rmi.StubNotFoundException;

import com.globallogic.entity.Student;

public interface Service {

	public Student addStudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student findById(int id) throws StubNotFoundException;
	
	public void deleteCourse(int id);
}
