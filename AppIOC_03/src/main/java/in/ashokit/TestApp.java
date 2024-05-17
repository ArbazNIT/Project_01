package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
	Student st=	 (Student) ctx.getBean("id");
	
	System.out.println(st);
		
	}

}
