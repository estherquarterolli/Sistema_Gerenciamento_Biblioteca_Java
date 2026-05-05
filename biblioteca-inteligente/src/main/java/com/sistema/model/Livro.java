package com.sistema.model;

import java.util.List;

public class Livro {
    private int id; // Identificador único
    private String titulo;
    private String autor;
    private String formato;
    private String capaUrl;
    private String descricao; // Texto longo para a página do livro
    private List<String> tags;

    public Livro(int id, String titulo, String autor, String formato, String capaUrl, String descricao, List<String> tags) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.capaUrl = capaUrl;
        this.descricao = descricao;
        this.tags = tags;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getFormato() { return formato; }
    public String getCapaUrl() { return capaUrl; }
    public String getDescricao() { return descricao; }
    public List<String> getTags() { return tags; }
}