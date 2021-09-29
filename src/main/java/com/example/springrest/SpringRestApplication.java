package com.example.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class SpringRestApplication {
	
	@RequestMapping(value="/details")
	String giveDetails() {
		Person p=new Person("Siddhesh","Jadhav","Pune" ,"SD");
		System.out.println("Hi");
		return p.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
