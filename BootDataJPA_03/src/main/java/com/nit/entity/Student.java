package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	private String stuName;
	private String studAddrs;
	private Long studRoll;
	
	public Student(Integer stuId, String stuName, String studAddrs, Long studRoll) {
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.studAddrs = studAddrs;
		this.studRoll = studRoll;
	}

	
	
	public Student() {
	System.out.println("Student.Student()");
	}



	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", studAddrs=" + studAddrs + ", studRoll="
				+ studRoll + "]";
	}
	
	
	

}
