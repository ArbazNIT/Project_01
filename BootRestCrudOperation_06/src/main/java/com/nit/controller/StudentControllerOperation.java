package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Student;
import com.nit.service.IStudentService;

@RestController
public class StudentControllerOperation {
	
	@Autowired
	private IStudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> showData(@RequestBody  Student student){
		
		String insert= service.inserStudent(student);
		return new ResponseEntity<String>(insert,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Student>> getAllData(){
		List<Student> all= service.getAllStudent();
		return new ResponseEntity<List<Student>>(all,HttpStatus.OK);
	}
	
	@GetMapping("/findById/{sid}")
	public ResponseEntity<Student> findById(@PathVariable("sid") Integer sid){
		Student std = service.getById(sid);
		return new ResponseEntity<Student>(std,HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateData(@RequestBody  Student student){
		
		String insert= service.updateStudent(student);
		return new ResponseEntity<String>(insert,HttpStatus.CREATED);
		
	}

	
	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<String> deleteById(@PathVariable ("sid") Integer sid){
		String delete= service.deleteById(sid);
		return new ResponseEntity<String>(delete,HttpStatus.OK);
		
	}

}
