package br.com.ghduep.ProjetoApi;

import br.com.ghduep.ProjetoApi.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
