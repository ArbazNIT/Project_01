package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee001;
import com.nit.repository.IRepositoryEmp;

@Service("emp")
public class EmployeeService {
	@Autowired
private	IRepositoryEmp repo;
	
//	public EmployeeService (IRepositoryEmp repo)
//	{
//		this.repo=repo;
//	}
//	
//	
//	public void showEmp()
//	{
//		Employee001 emp = new Employee001();
//		emp.setEmpId(102);
//		emp.setEmpName(" Ansari");
//		emp.setEmpAddrs("Masouri");
//		emp.setSalary(50000.0);
//		 
//		repo.save(emp);
//		System.out.println("record save......");
//		
//	}


}
