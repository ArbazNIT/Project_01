package com.nit.controller;

import java.util.Arrays;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Customer;

@RestController
public class CustomerController {
	
	
	@PutMapping("/customer")
	public ResponseEntity<String> updateData(@RequestBody Customer cust){
		
		 return new ResponseEntity<String>("update Custoemer",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteData( @PathVariable("cid") Integer cid)
	{
		return new ResponseEntity<String>("delete Customer",HttpStatus.OK);
		
	}
	
	
	@PostMapping("/customer")
	public ResponseEntity<String> insertData(@RequestBody Customer cust){
		System.out.println(cust);
	return	new ResponseEntity<>("product saved",HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/customer",produces = "application/Json")
	public ResponseEntity<Customer> customerGetData()
	{
		Customer cust = new Customer(101, "Rohan", "rohan@gmail.com");
		System.out.println(cust);
		return new ResponseEntity<>(cust,HttpStatus.OK);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getData()
	{
		Customer cust1 = new  Customer(102, "mohan", "mohan@gmail.com");
		Customer cust2 = new  Customer(103, "rahul", "rahul@gmail.com");
		Customer cust3 = new  Customer(104, "arbaz", "arbaz@gmail.com");
		Customer cust4 = new  Customer(105, "khan", "khan@gmail.com");
		List<Customer> list = Arrays.asList(cust1,cust2,cust3,cust4);
		list.forEach(x->System.out.println(x));
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}
