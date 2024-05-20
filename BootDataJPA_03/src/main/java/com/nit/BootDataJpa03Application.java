package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.service.ServiceStudent;

@SpringBootApplication
public class BootDataJpa03Application {

	public static void main(String[] args) {
	ApplicationContext ctx =	
				SpringApplication.run(BootDataJpa03Application.class, args);
	
	ServiceStudent bean = ctx.getBean("student",ServiceStudent.class);
	//bean.saveRecord();
	
	bean.findData();
	
//	bean.findByRecord();
	//bean.updateRecord();
	//bean.deleteRecord();
	
//	bean.deletebyId();
	
	}

}
