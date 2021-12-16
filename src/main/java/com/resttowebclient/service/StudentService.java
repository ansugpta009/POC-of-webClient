package com.resttowebclient.service;

import java.util.List;

import com.resttowebclient.entity.Student;

public interface StudentService {

	List<Student> getStudents(String Student_name);
	
	Student addStudents(Student student);
	
}
