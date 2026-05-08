package com.sistema.strategy;

import com.sistema.model.Livro;
import com.sistema.model.Usuario;

import java.util.List;

/**
 * NOVO: Interface do Padrão Strategy (GoF - Comportamental).
 *
 * Define o contrato que toda estratégia de recomendação deve cumprir.
 * O BibliotecaController depende apenas desta interface, nunca de uma
 * implementação concreta — o que respeita o Princípio da Inversão de
 * Dependência (DIP) do SOLID.
 */
public interface RecomendacaoStrategy {

    /**
     * Filtra e retorna a lista de livros recomendados para o usuário,
     * de acordo com a regra de negócio de cada estratégia concreta.
     *
     * @param usuario           perfil do usuário que receberá a recomendação
     * @param bancoDeDadosLivros catálogo completo de livros disponíveis
     * @return lista de livros recomendados (pode ser vazia, nunca null)
     */
    List<Livro> recomendar(Usuario usuario, List<Livro> bancoDeDadosLivros);
}
