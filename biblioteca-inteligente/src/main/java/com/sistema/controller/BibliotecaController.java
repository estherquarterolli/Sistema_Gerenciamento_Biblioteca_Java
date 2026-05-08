package com.sistema.controller;

import com.sistema.model.Livro;
import com.sistema.model.Usuario;
import com.sistema.strategy.RecomendacaoStrategy;
import com.sistema.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

/**
 * MUDANÇA: A lógica de recomendação foi extraída para fora desta classe.
 *
 * Antes: o controller possuía um algoritmo de recomendação embutido (hardcoded)
 * que verificava profissão E gostos juntos, sem flexibilidade.
 *
 * Depois: o controller recebe qualquer objeto que implemente RecomendacaoStrategy
 * (Padrão Strategy). Ele não sabe — nem precisa saber — qual regra está sendo
 * executada. Para trocar o algoritmo, basta injetar uma estratégia diferente.
 */
public class BibliotecaController {

    private final List<Livro> bancoDeDadosLivros;
    private final List<Livro> bibliotecaDoUsuario;
    private final ConsoleView view;

    // MUDANÇA: o controller agora tem uma dependência na interface, não na implementação
    private RecomendacaoStrategy estrategiaDeRecomendacao;

    public BibliotecaController(ConsoleView view, RecomendacaoStrategy estrategiaDeRecomendacao) {
        this.view = view;
        this.estrategiaDeRecomendacao = estrategiaDeRecomendacao;
        this.bancoDeDadosLivros = new ArrayList<>();
        this.bibliotecaDoUsuario = new ArrayList<>();
    }

    /**
     * NOVO: permite trocar a estratégia em tempo de execução
     * (comportamento clássico do Padrão Strategy — contexto mutável).
     */
    public void setEstrategiaDeRecomendacao(RecomendacaoStrategy estrategia) {
        this.estrategiaDeRecomendacao = estrategia;
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

    /**
     * MUDANÇA: o método recomendar() não contém mais nenhuma lógica de filtragem.
     * Ele delega inteiramente para a estratégia configurada.
     * Princípio de Responsabilidade Única (SRP) respeitado.
     */
    public void recomendar(Usuario usuario) {
        // Delega a lógica para a estratégia — o controller não precisa saber o "como"
        List<Livro> recomendados = estrategiaDeRecomendacao.recomendar(usuario, bancoDeDadosLivros);
        view.exibirRecomendacoes(recomendados);
    }
}