package com.sistema.strategy;

import com.sistema.model.Livro;
import com.sistema.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * NOVO: Estratégia concreta 1 — recomenda livros com base nos gostos pessoais do usuário.
 *
 * Regra de negócio: um livro é recomendado se QUALQUER uma das suas tags
 * coincidir com QUALQUER um dos gostos pessoais cadastrados no perfil do usuário.
 *
 * Implementa RecomendacaoStrategy (Padrão Strategy).
 */
public class RecomendacaoPorGostoPessoal implements RecomendacaoStrategy {

    @Override
    public List<Livro> recomendar(Usuario usuario, List<Livro> bancoDeDadosLivros) {
        List<Livro> recomendados = new ArrayList<>();

        for (Livro livro : bancoDeDadosLivros) {
            // Verifica se alguma tag do livro está nos gostos pessoais do usuário
            boolean temGostoEmComum = livro.getTags().stream()
                    .anyMatch(tag -> usuario.getGostosPessoais().contains(tag));

            if (temGostoEmComum) {
                recomendados.add(livro);
            }
        }
        return recomendados;
    }
}
