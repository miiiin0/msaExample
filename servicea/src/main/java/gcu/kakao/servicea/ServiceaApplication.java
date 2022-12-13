package gcu.kakao.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ServiceaApplication {

	@RequestMapping("/")
	public String helloa() {
		return "Hello Servicea";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceaApplication.class, args);
	}

}
