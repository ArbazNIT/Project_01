package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Employee;
import com.nit.service.IEmployeeService;

@RestController
public class EmployeeRestContoller {
	
	@Autowired
	private IEmployeeService empservice;
	
	@PostMapping("save")
	public ResponseEntity<String> showData(@RequestBody  Employee employee){
		
		String save = empservice.saveEmployee(employee);
		
		return new ResponseEntity<>(save,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployeeData(){
		List<Employee> employee= empservice.getEmployeeData();
		
	return new ResponseEntity<List<Employee>>(employee,HttpStatus.ACCEPTED);
		
		
	}
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<?> getEmpId(@PathVariable ("id")Integer id){
		
		Employee empId= empservice.getById(id);
		
		return new ResponseEntity<Employee>(empId,HttpStatus.OK);
		
		
	}
	
	
	@PutMapping("/update")
	public  ResponseEntity<String> updateEmp(@RequestBody Employee emp){
		
		String update= empservice.updateEployee(emp);
		return new ResponseEntity<String>(update,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String> deleteById(@PathVariable ("id") Integer id){
		String delete = empservice.deleteById(id);
		
		return new ResponseEntity<String>(delete,HttpStatus.OK);
	}
	

}
