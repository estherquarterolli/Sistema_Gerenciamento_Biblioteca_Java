package com.sistema.strategy;

import com.sistema.model.Livro;
import com.sistema.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * NOVO: Estratégia concreta 2 — recomenda livros com base na profissão do usuário.
 *
 * Regra de negócio: um livro é recomendado se QUALQUER uma das suas tags
 * coincidir (ignorando maiúsculas/minúsculas) com a profissão do usuário.
 * Isso favorece leituras técnicas e de carreira.
 *
 * Implementa RecomendacaoStrategy (Padrão Strategy).
 */
public class RecomendacaoPorProfissao implements RecomendacaoStrategy {

    @Override
    public List<Livro> recomendar(Usuario usuario, List<Livro> bancoDeDadosLivros) {
        List<Livro> recomendados = new ArrayList<>();

        for (Livro livro : bancoDeDadosLivros) {
            // Verifica se alguma tag do livro bate com a profissão do usuário
            boolean profissaoEhRelevante = livro.getTags().stream()
                    .anyMatch(tag -> tag.equalsIgnoreCase(usuario.getProfissao()));

            if (profissaoEhRelevante) {
                recomendados.add(livro);
            }
        }
        return recomendados;
    }
}
