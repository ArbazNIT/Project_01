package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Employee001{
	
	@Id
	private Integer empId;
	private String empName;
	private String empAddrs;
	private Double salary;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddrs() {
		return empAddrs;
	}
	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddrs=" + empAddrs + ", salary=" + salary
				+ "]";
	}
	
	
	
	

}
