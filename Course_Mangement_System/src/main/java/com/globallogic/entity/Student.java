package com.globallogic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "std_id")
	private int student_id;

	private String studentName;

	private String course;
	private String studentAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_project_id")
	private Final_Project project;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_course_id", referencedColumnName = "std_id")
	private List<Course> courses;

}
