package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class PessoaServiceImp extends PessoaService {

    @Autowired
    Pessoa pessoa;
    String getNome();

    {
        return pessoa.getNome();

    }
}

