package com.sistema.view;

import com.sistema.model.Livro;
import java.util.List;

public class ConsoleView {

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirRecomendacoes(List<Livro> livros) {
        System.out.println("\n=== 📚 Recomendações do Sistema para o seu Perfil ===");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o seu perfil.");
        } else {
            for (Livro livro : livros) {
                System.out.println("-> " + livro.toString() + " | Tags: " + livro.getTags());
            }
        }
        System.out.println("=====================================================\n");
    }

    public void exibirSuaBiblioteca(List<Livro> biblioteca) {
        System.out.println("\n=== 📖 Sua Biblioteca Organizada ===");
        for (Livro livro : biblioteca) {
            System.out.println("- [" + livro.getFormato().toUpperCase() + "] " + livro.getTitulo());
        }
        System.out.println("====================================\n");
    }
}