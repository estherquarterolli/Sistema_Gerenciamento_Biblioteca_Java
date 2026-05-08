package com.sistema.model;

import java.util.List;

/**
 * MUDANÇA: Construtor público de múltiplos parâmetros foi removido.
 * O objeto agora só pode ser criado através do Livro.Builder (Padrão Builder GoF).
 * Isso elimina a confusão da ordem dos parâmetros e torna a construção legível.
 */
public class Livro {

    // Campos imutáveis — só são atribuídos uma vez, pelo Builder
    private final int id;
    private final String titulo;
    private final String autor;
    private final String formato;
    private final String capaUrl;
    private final String descricao;
    private final List<String> tags;

    // MUDANÇA: construtor agora é privado; apenas o Builder interno tem acesso
    private Livro(Builder builder) {
        this.id       = builder.id;
        this.titulo   = builder.titulo;
        this.autor    = builder.autor;
        this.formato  = builder.formato;
        this.capaUrl  = builder.capaUrl;
        this.descricao = builder.descricao;
        this.tags     = builder.tags;
    }

    // -------------------------------------------------------------------------
    // NOVO: Classe Builder estática interna (GoF - Padrão Builder)
    // -------------------------------------------------------------------------
    public static class Builder {

        // Campos obrigatórios
        private final int id;
        private final String titulo;
        private final String autor;

        // Campos opcionais com valores padrão seguros
        private String formato  = "Físico";
        private String capaUrl  = "";
        private String descricao = "";
        private List<String> tags = List.of();

        /** Construtor do Builder recebe apenas os campos realmente obrigatórios. */
        public Builder(int id, String titulo, String autor) {
            this.id     = id;
            this.titulo = titulo;
            this.autor  = autor;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this; // retorna "this" para encadeamento fluente
        }

        public Builder capaUrl(String capaUrl) {
            this.capaUrl = capaUrl;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /** Passo final: constrói e retorna o objeto Livro imutável. */
        public Livro build() {
            return new Livro(this);
        }
    }

    // -------------------------------------------------------------------------
    // Getters (sem setters — o objeto é imutável após a construção)
    // -------------------------------------------------------------------------
    public int getId()              { return id; }
    public String getTitulo()       { return titulo; }
    public String getAutor()        { return autor; }
    public String getFormato()      { return formato; }
    public String getCapaUrl()      { return capaUrl; }
    public String getDescricao()    { return descricao; }
    public List<String> getTags()   { return tags; }

    @Override
    public String toString() {
        return "[" + id + "] \"" + titulo + "\" — " + autor;
    }
}