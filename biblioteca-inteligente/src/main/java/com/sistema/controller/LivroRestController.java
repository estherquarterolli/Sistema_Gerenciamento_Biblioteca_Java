package com.sistema.controller;

import com.sistema.model.Livro;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/livros")
@CrossOrigin(origins = "*")
public class LivroRestController {

    @GetMapping
    public List<Livro> obterTodosOsLivros() {

        /*
         * construção dos objetos Livro migrada do construtor com 7 parâmetros
         * para o Padrão Builder. Cada campo nomeado torna o código autodocumentado —
         * fica claro o que cada valor representa, sem depender da ordem dos argumentos.
         */
        return Arrays.asList(

                new Livro.Builder(1, "Clean Code: Código Limpo", "Robert C. Martin")
                        .formato("Físico")
                        .capaUrl("src/main/resources/clean_code.jpg")
                        .descricao("Um clássico essencial para aprender a escrever códigos robustos e fáceis de dar manutenção em Java.")
                        .tags(Arrays.asList("Java", "Desenvolvimento", "Tecnologia"))
                        .build(),

                new Livro.Builder(2, "A Química dos Bolos", "Joyce Galvão")
                        .formato("Físico")
                        .capaUrl("src/main/resources/quimica_bolos.jpg")
                        .descricao("Aprenda como a temperatura, os ovos, a farinha e o açúcar interagem para criar a textura perfeita de bolos para a sua confeitaria.")
                        .tags(Arrays.asList("Confeitaria", "Gastronomia", "Empreendedorismo"))
                        .build(),

                new Livro.Builder(3, "Glúteos e Pernas", "Bret Contreras")
                        .formato("Digital")
                        .capaUrl("src/main/resources/gluteos_pernas.jpg")
                        .descricao("O guia definitivo focado no desenvolvimento muscular dos membros inferiores. Protocolos detalhados para quem deseja emagrecer com saúde e aumentar a força.")
                        .tags(Arrays.asList("Musculação", "Saúde", "Fitness"))
                        .build(),

                new Livro.Builder(4, "Preparatório CAP Marinha", "Editora Concursos")
                        .formato("Digital")
                        .capaUrl("src/main/resources/marinha-cap-adm.png")
                        .descricao("Material focado no Corpo Auxiliar de Praças da Marinha, cobrindo tópicos de TI e Processamento de Dados.")
                        .tags(Arrays.asList("Marinha", "Concurso", "Estudos", "Tecnologia"))
                        .build(),

                new Livro.Builder(5, "Minecraft: Guia de Exploração", "Mojang")
                        .formato("Físico")
                        .capaUrl("src/main/resources/minecraft.jpg")
                        .descricao("Aprenda a explorar biomas complexos, construir refúgios seguros, entender mods e dominar o jogo.")
                        .tags(Arrays.asList("Games", "Criatividade", "Minecraft"))
                        .build(),

                new Livro.Builder(6, "Hábitos Atômicos", "James Clear")
                        .formato("Digital")
                        .capaUrl("src/main/resources/habitos_atomicos.jpg")
                        .descricao("Um método fácil e comprovado de criar bons hábitos, seja para estudar focado ou manter a rotina de treinos.")
                        .tags(Arrays.asList("Produtividade", "Desenvolvimento Pessoal"))
                        .build(),

                new Livro.Builder(7, "O Senhor dos Anéis", "J.R.R. Tolkien")
                        .formato("Físico")
                        .capaUrl("src/main/resources/senhor_dos_aneis.jpg")
                        .descricao("Uma jornada épica pela Terra Média para destruir o Um Anel.")
                        .tags(Arrays.asList("Fantasia", "Aventura", "Ficção"))
                        .build(),

                new Livro.Builder(8, "1984", "George Orwell")
                        .formato("Digital")
                        .capaUrl("src/main/resources/1984.jpg")
                        .descricao("Uma distopia arrepiante sobre vigilância governamental e totalitarismo.")
                        .tags(Arrays.asList("Distopia", "Ficção", "Clássico"))
                        .build(),

                new Livro.Builder(9, "Pai Rico, Pai Pobre", "Robert T. Kiyosaki")
                        .formato("Físico")
                        .capaUrl("src/main/resources/pai_rico_pai_pobre.jpg")
                        .descricao("O que os ricos ensinam a seus filhos sobre dinheiro.")
                        .tags(Arrays.asList("Finanças", "Educação Financeira", "Empreendedorismo"))
                        .build(),

                new Livro.Builder(10, "A Arte da Guerra", "Sun Tzu")
                        .formato("Digital")
                        .capaUrl("src/main/resources/arte_da_guerra.jpg")
                        .descricao("Tratado militar clássico que se aplica perfeitamente à estratégia de negócios e liderança.")
                        .tags(Arrays.asList("Estratégia", "Liderança", "Negócios", "História"))
                        .build(),

                new Livro.Builder(11, "Design Patterns", "Erich Gamma")
                        .formato("Físico")
                        .capaUrl("src/main/resources/design_patterns.jpg")
                        .descricao("O livro original (GoF) que catalogou as melhores práticas e padrões de projetos orientados a objetos.")
                        .tags(Arrays.asList("Java", "Desenvolvimento", "Tecnologia", "Padrões de Projeto"))
                        .build(),

                new Livro.Builder(12, "O Poder do Hábito", "Charles Duhigg")
                        .formato("Digital")
                        .capaUrl("src/main/resources/poder_do_habito.jpg")
                        .descricao("Por que fazemos o que fazemos na vida e nos negócios.")
                        .tags(Arrays.asList("Produtividade", "Psicologia", "Desenvolvimento Pessoal"))
                        .build()
        );
    }
}