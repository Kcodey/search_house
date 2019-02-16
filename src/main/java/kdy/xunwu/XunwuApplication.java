package kdy.xunwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class XunwuApplication {

    public static void main(String[] args) {

        SpringApplication.run(XunwuApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(){
        return "哈喽,kdy";
    }
}
