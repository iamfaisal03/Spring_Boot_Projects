package com.globallogic.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
