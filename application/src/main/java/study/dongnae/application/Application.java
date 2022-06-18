package study.dongnae.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.dongnae.domain.Test;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public ResponseEntity<Test> test() {
        Test test = new Test();
        test.setTitle("hi");
        test.setContent("test is good");
        return ResponseEntity.ok(test);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}