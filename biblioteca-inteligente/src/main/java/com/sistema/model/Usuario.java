package com.sistema.model;

import java.util.List;

public class Usuario {
    private String nome;
    private String profissao;
    private List<String> gostosPessoais;

    public Usuario(String nome, String profissao, List<String> gostosPessoais) {
        this.nome = nome;
        this.profissao = profissao;
        this.gostosPessoais = gostosPessoais;
    }

    public String getNome() { return nome; }
    public String getProfissao() { return profissao; }
    public List<String> getGostosPessoais() { return gostosPessoais; }
}