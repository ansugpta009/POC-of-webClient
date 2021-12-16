package com.resttowebclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.resttowebclient.entity.Student;
import com.resttowebclient.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudents(String studentName) {
			return studentRepository.findByStudentName(studentName);				
	}			

	public Student addStudents(@RequestBody Student student) {
		return studentRepository.save(student);
	}
}
