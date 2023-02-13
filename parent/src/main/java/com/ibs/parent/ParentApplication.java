package com.ibs.parent;

import com.ibs.utility.converters.DateTimeConverters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ParentApplication {

	public static void main(String[] args) {
		System.out.println("application started .....");
		SpringApplication.run(ParentApplication.class, args);
		System.out.println("application stopped .....");
		DateTimeConverters converters = new DateTimeConverters();
		System.out.println(converters.dateTimeToLocalTime(LocalDateTime.now()));
	}
}
