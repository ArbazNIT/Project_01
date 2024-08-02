package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_005")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studId;
	private String studName;
	private Integer studRoll;
	private String studAddrs;
	
	public Student() {
		System.out.println("Student.Student()");
	}

	public Student(Integer studId, String studName, Integer studRoll, String studAddrs) {
		
		this.studId = studId;
		this.studName = studName;
		this.studRoll = studRoll;
		this.studAddrs = studAddrs;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Integer getStudRoll() {
		return studRoll;
	}

	public void setStudRoll(Integer studRoll) {
		this.studRoll = studRoll;
	}

	public String getStudAddrs() {
		return studAddrs;
	}

	public void setStudAddrs(String studAddrs) {
		this.studAddrs = studAddrs;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studRoll=" + studRoll + ", studAddrs="
				+ studAddrs + "]";
	}
	
	
	
	

}
