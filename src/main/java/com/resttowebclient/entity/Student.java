package com.resttowebclient.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class Student implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roll_no")
	private Long rollNo;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "fav_subject")
	private String favSubject;


	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFavSubject() {
		return favSubject;
	}

	public void setFavSubject(String favSubject) {
		this.favSubject = favSubject;
	}
	
}
