package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MinhaprimeiraAplicaĆ§ao {

    static String valor;

    public static void main(String[] args) {

        valor =args[0];
        SpringApplication.run(MinhaprimeiraAplicaĆ§ao.class, args);

    }

    @Bean
            PessoaService getPessoaService()
    {

    PessoaService p = new PessoaServiceImp();
    p.setNome("bean");
    return p;
    }
}
