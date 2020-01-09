package garcon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication 
@ServletComponentScan
public class GarconRestAPI {

	public static void main(String[] args) {
		SpringApplication.run(GarconRestAPI.class, args);
	}
}
