package com.nit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.IEmployeeRepo;

@Service
public class EmployeeService {
	
	private IEmployeeRepo repo;
	
	public EmployeeService(IEmployeeRepo repo) {
		this.repo=repo;
		
	}

	/*
	 * public void getAllRecord() {
	 * 
	 * List<Employee> find = repo.findAll(); 
	 * find.forEach(x->System.out.println(x));
	 * 
	 * 
	 * }
	 */	
	public  void getAllSortRecord()
	{
		Sort  sort = Sort.by("salary").ascending();
		//Sort sort = Sort.by("salary").descending();
		
		List<Employee> find = repo.findAll(sort);
		find.forEach(x->System.out.println(x));
	}
	
	/*
	 * public void showAllData() { 
	 * Employee emp1 = new Employee(101, "Tahir",
	 * "Bikram", 5000.0); Employee emp2 = new Employee(102, "Rajik", "Patna",
	 * 7000.0); Employee emp3 = new Employee(103, "Arabz", "pune", 6000.0); Employee
	 * emp4 = new Employee(104, "Anshika", "Dehli", 8000.0); Employee emp5 = new
	 * Employee(105, "Rahul", "Kolkatta", 9000.0); Employee emp6 = new Employee(106,
	 * "Raja", "Bikram", 5000.0);
	 * 
	 * List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
	 * 
	 * 
	 * Iterable<Employee> list1 = repo.saveAll(list);
	 * list1.forEach(x->System.out.println(x));
	 * 
	 * System.out.println("Record saves.....");
	 * 
	 * 
	 * 
	 * }
	 */

}
