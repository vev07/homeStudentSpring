package com.homeStudent.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentSingleton studentSingleton = (StudentSingleton) context.getBean("studentSingle");
		StudentSingleton studentSingleton2 = (StudentSingleton) context.getBean("studentSingle");
		System.out.println(studentSingleton.getName());
		System.out.println(studentSingleton.getAge());
		System.out.println(studentSingleton + " " + studentSingleton2);

		System.out.println(studentSingleton == studentSingleton2);

		StudentPrototype studentPrototype = (StudentPrototype) context.getBean("studentAnother");
		StudentPrototype studentPrototype2 = (StudentPrototype) context.getBean("studentAnother");
		System.out.println(studentPrototype + " " + studentPrototype2);
		System.out.println(studentPrototype == studentPrototype2);



	}

}
