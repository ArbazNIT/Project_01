package com.nit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.ServiceProduct;

@SpringBootApplication
public class BootDataJpa03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = 
						SpringApplication.run(BootDataJpa03Application.class, args);
		
		ServiceProduct bean = run.getBean(ServiceProduct.class);
		bean.insertData();
		
	//	bean.findByRecord();
	//	bean.getAllRecord(Arrays.asList(502,503,504));
		
	//	bean.allRecordGet();
		
	}

}
