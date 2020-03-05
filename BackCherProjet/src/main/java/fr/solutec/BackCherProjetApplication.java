package fr.solutec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackCherProjetApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackCherProjetApplication.class, args);
		System.out.println("finishhhhhhhhhhhhhhhhhhhhhhhhhh");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		
	}

}
