package com.globallogic.service;

import java.rmi.StubNotFoundException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.globallogic.entity.Student;
import com.globallogic.repositary.Course;
import com.globallogic.repositary.StudentRepositary;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	
	@Autowired
	private StudentRepositary repositary;
	
	@Autowired
	private Course courserepo;
	
	@Override
	public Student addStudent(Student student) {
		return repositary.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		repositary.deleteById(id);
	}

	@Override
	public Student findById(int id) throws StubNotFoundException {
		Optional<Student> optional=repositary.findById(id);
		if (optional.isEmpty()) {
			throw new StubNotFoundException("Not Found");
		}
		return optional.get();
	}

	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courserepo.deleteById(id);
	}

}
