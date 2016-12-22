package bestellung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("bestellung.api")
@ComponentScan("bestellung.service")
public class Application extends DatabaseConfig {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
