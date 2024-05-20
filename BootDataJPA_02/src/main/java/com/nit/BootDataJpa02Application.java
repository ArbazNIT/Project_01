package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.EmployeeService;

@SpringBootApplication
public class BootDataJpa02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
							SpringApplication.run(BootDataJpa02Application.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
	//	bean.showAllData();
		
	//	bean.getAllRecord();
		
		bean.getAllSortRecord();
		
	}

}
