package kz.ihlaslife.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class IhlasLifeSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhlasLifeSiteApplication.class, args);
	}
}
