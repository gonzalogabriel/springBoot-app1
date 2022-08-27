package com.UdeA.Ciclo3;

import com.UdeA.Ciclo3.modelos.Empresa;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

//@RestController
public class Ciclo3Application {

	private static String emp;

	@GetMapping("/hello")
	public String hello(){
		return "Hola Ciclo3 .... Saldremos vivos de esto!";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp = new Empresa("SOLAR SAS", "Calle La geta",  "31212312233", "800123555");
		//emp.setNombre("SOLAR Punto NET");
		return emp.getNombre();
	}


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);

		System.out.println (emp);




	}

}
