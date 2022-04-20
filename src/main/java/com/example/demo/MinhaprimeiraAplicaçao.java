package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MinhaprimeiraAplicaçao {

    static String valor;

    public static void main(String[] args) {

        valor =args[0];
        SpringApplication.run(MinhaprimeiraAplicaçao.class, args);

    }

    @Bean
            PessoaService getPessoaService()
    {

    PessoaService p = new PessoaServiceImp();
    p.setNome("bean");
    return p;
    }
}
