package com.aluracursos.apidni.api_dni;

import com.aluracursos.apidni.api_dni.model.DatosDni;
import com.aluracursos.apidni.api_dni.service.ConsumoDni;
import com.aluracursos.apidni.api_dni.service.ConvierteDatosDni;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ApiDniApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiDniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el DNI del Cliente:");
		String dni = scanner.next();

		var consumoDni = new ConsumoDni();
		var json = consumoDni.obtenerDatosDni("https://api.apis.net.pe/v2/reniec/dni?numero="+dni);
//		System.out.println(json);

		ConvierteDatosDni conversor = new ConvierteDatosDni();
		var datos = conversor.ontenerDatosDni(json, DatosDni.class);
		System.out.println(datos);

	}
}
