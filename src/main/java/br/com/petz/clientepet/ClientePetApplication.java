package br.com.petz.clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClientePetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientePetApplication.class, args);
    }
    @GetMapping("/")
    public String home() {
        return "cliente pet api - home";
    }

}