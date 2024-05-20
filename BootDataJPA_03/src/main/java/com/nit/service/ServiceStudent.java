package com.nit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repository.RepoStudent;

@Service("student")
public class ServiceStudent {
	
	@Autowired
	private RepoStudent repo;
	
	
	public  void saveRecord()
	{
		Student st1 = new Student(1, "rahul", "bikram", 89898l);
		Student st2 = new Student(2, "Anshika", "Noubatpur", 90989l);
		Student st3 = new Student(3, "Nabi", "Bihta", 39898l);
		Student st4 = new Student(4, "Bheem", "	Kanpa", 3898l);
		Student st5 = new Student(5, "Tahir", "Mojakka", 89898l);
		Student st6 = new Student(6, "rahul", "khan", 89898l);
		
		List<Student> asList = Arrays.asList(st1,st2,st3,st4,st5,st6);
	//	repo.save(st);
	//	System.out.println(st);
		List<Student> saveAll = repo.saveAll(asList);
		saveAll.forEach(x->{
			System.out.println(x);
		});
		
	}
	
	public void findData()
	{
			List<Student> findAll = repo.findAll();
		//	System.out.println(findAll);
			findAll.forEach(x-> System.out.println(x));
			
	}
	
	public void findByRecord()
	{
		Optional<Student> find = repo.findById(4);
		if(find.isPresent())
		{
			Student s = find.get();
			System.out.println(s);
		}else {
			System.out.println("record is not found");
		}
	}
	
	public void updateRecord()
	{
		Student st1 = new Student(1, "Khan", "Patna", 898989090l);
		Student st2 = new Student(2, "Anshika Kumari", "Noubatpur", 9098900l);
		Student st3 = new Student(3, "Nabi Alam", "Bhagalpur", 309898l);
		Student st4 = new Student(4, "Ekramullah", "Dehli", 389008l);

		List<Student> asList = Arrays.asList(st1,st2,st3,st4);
		
		List<Student> save = repo.saveAll(asList);
		save.forEach(x->System.out.println(x));
	}
	
	//Delete all record in database table
	public void deleteRecord()
	{
		repo.deleteAll();
		
	}
	
	//Delete by Specific id
	public void deletebyId()
	{
		repo.deleteById(10);
		
	}
	

}
