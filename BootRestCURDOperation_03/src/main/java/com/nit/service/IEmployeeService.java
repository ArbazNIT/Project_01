package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeService {
	
	public String saveEmployee(Employee emp);
	public List<Employee> getEmployeeData();
	public  Employee getById (Integer id);
	public String updateEployee(Employee emp);
	public String deleteById(Integer id);

}
