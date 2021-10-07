package fr.projet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EsiCertifApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		
		SpringApplication.run(EsiCertifApplication.class, args);
		System.out.println("************************                               ************************\n************************  ---___ESICCERTIF EST LANCÉ___--- ************************\n************************                               ************************".toUpperCase());

		}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("************************                               ************************\n************************ ---___Debut Instruction Perso___--- ******************\n************************                               ************************".toUpperCase());	

		
		

	}

}
