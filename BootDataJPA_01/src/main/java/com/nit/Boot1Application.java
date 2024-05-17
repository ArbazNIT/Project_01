package com.nit;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.entity.Person;
import com.nit.repository.IRepositoryEmp;
import com.nit.service.EmployeeService;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
		
	ApplicationContext ctx = SpringApplication.run(Boot1Application.class, args);
	
	  IRepositoryEmp repo= ctx.getBean(IRepositoryEmp.class);
//	  Person save = repo.save(new Person(121, "asdf", List.of("patna","goa"), Set.of(898897878l,8788099l)));
//	  System.out.println(save);
	  Optional<Person> findById = repo.findById(121);
	  System.out.println(findById.get());
	}

}
