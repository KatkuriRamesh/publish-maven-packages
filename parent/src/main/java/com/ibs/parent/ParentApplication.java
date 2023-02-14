package com.ibs.parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentApplication {

	public static void main(String[] args) {
		System.out.println("application started .....");
		SpringApplication.run(ParentApplication.class, args);
		System.out.println("application stopped .....");
	
	}
}
