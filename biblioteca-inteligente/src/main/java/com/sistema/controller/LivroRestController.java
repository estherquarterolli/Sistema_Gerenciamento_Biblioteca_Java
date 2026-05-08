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
         * MUDANÇA: construção dos objetos Livro migrada do construtor com 7 parâmetros
         * para o Padrão Builder. Cada campo nomeado torna o código autodocumentado —
         * fica claro o que cada valor representa, sem depender da ordem dos argumentos.
         */
        return Arrays.asList(

                new Livro.Builder(1, "Clean Code: Código Limpo", "Robert C. Martin")
                        .formato("Físico")
                        .capaUrl("https://m.media-amazon.com/images/I/41xShlnTZTL.jpg")
                        .descricao("Um clássico essencial para aprender a escrever códigos robustos e fáceis de dar manutenção em Java.")
                        .tags(Arrays.asList("Java", "Desenvolvimento", "Tecnologia"))
                        .build(),

                new Livro.Builder(2, "A Química dos Bolos", "Joyce Galvão")
                        .formato("Físico")
                        .capaUrl("https://photos.enjoei.com.br/livro-a-quimica-do-bolo-joyce-galvao-106758072/800x800/czM6Ly9waG90b3MuZW5qb2VpLmNvbS5ici9wcm9kdWN0cy8xODYxNjczMS8zMzk3OWMyZDAxMGFkNDY2N2QwODA4YjlmMmNkMGYwYy5qcGc")
                        .descricao("Aprenda como a temperatura, os ovos, a farinha e o açúcar interagem para criar a textura perfeita de bolos para a sua confeitaria.")
                        .tags(Arrays.asList("Confeitaria", "Gastronomia", "Empreendedorismo"))
                        .build(),

                new Livro.Builder(3, "Glúteos e Pernas", "Bret Contreras")
                        .formato("Digital")
                        .capaUrl("https://m.media-amazon.com/images/I/41b+E1QW7bL.jpg")
                        .descricao("O guia definitivo focado no desenvolvimento muscular dos membros inferiores. Protocolos detalhados para quem deseja emagrecer com saúde e aumentar a força.")
                        .tags(Arrays.asList("Musculação", "Saúde", "Fitness"))
                        .build(),

                new Livro.Builder(4, "Preparatório CAP Marinha", "Editora Concursos")
                        .formato("Digital")
                        .capaUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwVPEu9stQxlY7WZwLdZowbt1aHadk8jXN9w&s")
                        .descricao("Material focado no Corpo Auxiliar de Praças da Marinha, cobrindo tópicos de TI e Processamento de Dados.")
                        .tags(Arrays.asList("Marinha", "Concurso", "Estudos", "Tecnologia"))
                        .build(),

                new Livro.Builder(5, "Minecraft: Guia de Exploração", "Mojang")
                        .formato("Físico")
                        .capaUrl("https://m.media-amazon.com/images/I/81EQhsDsn5L._AC_UF1000,1000_QL80_.jpg")
                        .descricao("Aprenda a explorar biomas complexos, construir refúgios seguros, entender mods e dominar o jogo.")
                        .tags(Arrays.asList("Games", "Criatividade", "Minecraft"))
                        .build(),

                new Livro.Builder(6, "Hábitos Atômicos", "James Clear")
                        .formato("Digital")
                        .capaUrl("https://m.media-amazon.com/images/I/81eT2pjx4jL.jpg")
                        .descricao("Um método fácil e comprovado de criar bons hábitos, seja para estudar focado ou manter a rotina de treinos.")
                        .tags(Arrays.asList("Produtividade", "Desenvolvimento Pessoal"))
                        .build()
        );
    }
}