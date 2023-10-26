package pe.edu.cibertec.veterinariasw2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VeterinariaSw2Application {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaSw2Application.class, args);
	}
	@Bean
	public CommandLineRunner ejecutar(){
		return args ->{
			System.out.println("Hola mundo");
		};
	}
}
