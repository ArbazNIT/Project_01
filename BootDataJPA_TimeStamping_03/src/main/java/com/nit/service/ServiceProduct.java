package com.nit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Product;
import com.nit.repository.ProductRepository;

@Service
public class ServiceProduct {
	
	@Autowired
	private ProductRepository repo;
	
	public void findByRecord()
	{
		Optional<Product> find= repo.findById(202);
		if(find.isPresent())
		{
			Product  p = find.get();
			System.out.println(p);
		}else {
			System.out.println("Record not found");
		}
		
	}
	
	
	public void getAllRecord(List<Integer> pId)
	{
		List<Product> emp = repo.findAllById(pId);
		emp.forEach(x->System.out.println(x));
		
		
	}
	
	//get all records in console
	
	public void allRecordGet() {
		List<Product> find = repo.findAll();
		
		find.forEach(x->System.out.println(x));
		
	}
	
	
	
	public void insertData()
	{
		Product p1 = new Product(null, "Mouse", 80.0, null, null);
		Product p2 = new Product(null, "Moniter", 800.0, null, null);
		Product p3 = new Product(null, "Dell", 70000.0, null, null);
		Product p4 = new Product(null, "HP", 8000.0, null, null);
		Product p5 = new Product(null, "Mouse", 999.0, null, null);
		
		List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
		repo.saveAll(list);
	
		System.out.println("record inserted...");
		
	

	}
	

}
