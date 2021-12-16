package com.resttowebclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resttowebclient.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{

	List<Student> findByStudentName(String StudentName);
	
}
