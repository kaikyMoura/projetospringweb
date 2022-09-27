package com.testespring.application;

import com.testespring.application.entities.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.http.HttpRequest;

@SpringBootApplication
public class TestespringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestespringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Aplicação rodando!");
    }
}
