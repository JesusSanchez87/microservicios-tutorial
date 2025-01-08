package com.ProyectosBackend.primerProyectoBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PrimerProyectoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoBackendApplication.class, args);
	}

}
