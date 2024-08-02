package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public String saveEmployee(Employee emp) {
		repo.save(emp);
		
		System.out.println(emp);
		return "saved Employee Record";	
	}
	
	@Override
	public List<Employee> getEmployeeData() {
		List<Employee> find = repo.findAll();
		return find;
	}

	@Override
	public Employee getById(Integer id) {
		//return  repo.findById(id).orElseThrow();
		
		Optional<Employee> find = repo.findById(id);
		
		if(find.isPresent()) {
			 find.get();
			
		}
		return null;
	}

	@Override
	public String updateEployee(Employee emp) {
		repo.save(emp);
		return "Record Updated";
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Delete Seccussful";
		}

		return "Delete Not Succuss";
	}

}
