package com.sistema.controller;

import com.sistema.model.Livro;
import com.sistema.model.Usuario;
import com.sistema.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private List<Livro> bancoDeDadosLivros;
    private List<Livro> bibliotecaDoUsuario;
    private ConsoleView view;

    public BibliotecaController(ConsoleView view) {
        this.view = view;
        this.bancoDeDadosLivros = new ArrayList<>();
        this.bibliotecaDoUsuario = new ArrayList<>();
    }

    // Alimenta o sistema com os livros disponíveis no mundo
    public void adicionarAoBancoDeDados(Livro livro) {
        bancoDeDadosLivros.add(livro);
    }

    // O usuário compra ou adquire um livro para a biblioteca dele
    public void salvarNaBibliotecaPessoal(Livro livro) {
        bibliotecaDoUsuario.add(livro);
        view.exibirMensagem("✅ Adicionado à sua estante: " + livro.getTitulo());
    }

    public void listarMinhaBiblioteca() {
        view.exibirSuaBiblioteca(bibliotecaDoUsuario);
    }

    // O cérebro da recomendação: cruza os dados do livro com o usuário
    public void recomendar(Usuario usuario) {
        List<Livro> recomendados = new ArrayList<>();

        for (Livro livro : bancoDeDadosLivros) {
            boolean temConexao = false;

            for (String tag : livro.getTags()) {
                // Checa se a tag bate com a profissão ou com os gostos
                if (tag.equalsIgnoreCase(usuario.getProfissao()) ||
                        usuario.getGostosPessoais().contains(tag)) {
                    temConexao = true;
                    break;
                }
            }
            if (temConexao) {
                recomendados.add(livro);
            }
        }
        view.exibirRecomendacoes(recomendados);
    }
}