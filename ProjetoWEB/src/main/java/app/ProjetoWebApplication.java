package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("src/main")
public class ProjetoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoWebApplication.class, args);
	}

}
