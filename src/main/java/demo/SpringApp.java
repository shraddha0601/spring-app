package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApp {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
