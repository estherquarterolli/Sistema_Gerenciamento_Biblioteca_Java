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
        return Arrays.asList(
                new Livro(1, "Clean Code: Código Limpo", "Robert C. Martin", "Físico",
                        "https://m.media-amazon.com/images/I/41xShlnTZTL.jpg",
                        "Um clássico essencial para aprender a escrever códigos robustos e fáceis de dar manutenção em Java.",
                        Arrays.asList("Java", "Desenvolvimento", "Tecnologia")),

                new Livro(2, "A Química dos Bolos", "Joyce Galvão", "Físico",
                        "https://photos.enjoei.com.br/livro-a-quimica-do-bolo-joyce-galvao-106758072/800x800/czM6Ly9waG90b3MuZW5qb2VpLmNvbS5ici9wcm9kdWN0cy8xODYxNjczMS8zMzk3OWMyZDAxMGFkNDY2N2QwODA4YjlmMmNkMGYwYy5qcGc",
                        "Aprenda como a temperatura, os ovos, a farinha e o açúcar interagem para criar a textura perfeita de bolos para a sua confeitaria.",
                        Arrays.asList("Confeitaria", "Gastronomia", "Empreendedorismo")),

                new Livro(3, "Glúteos e Pernas", "Bret Contreras", "Digital",
                        "https://m.media-amazon.com/images/I/41b+E1QW7bL.jpg",
                        "O guia definitivo focado no desenvolvimento muscular dos membros inferiores. Protocolos detalhados para quem deseja emagrecer com saúde e aumentar a força.",
                        Arrays.asList("Musculação", "Saúde", "Fitness")),

                new Livro(4, "Preparatório CAP Marinha", "Editora Concursos", "Digital",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwVPEu9stQxlY7WZwLdZowbt1aHadk8jXN9w&s",
                        "Material focado no Corpo Auxiliar de Praças da Marinha, cobrindo tópicos de TI e Processamento de Dados.",
                        Arrays.asList("Marinha", "Concurso", "Estudos", "Tecnologia")),

                new Livro(5, "Minecraft: Guia de Exploração", "Mojang", "Físico",
                        "https://m.media-amazon.com/images/I/81EQhsDsn5L._AC_UF1000,1000_QL80_.jpg",
                        "Aprenda a explorar biomas complexos, construir refúgios seguros, entender mods e dominar o jogo.",
                        Arrays.asList("Games", "Criatividade", "Minecraft")),

                new Livro(6, "Hábitos Atômicos", "James Clear", "Digital",
                        "https://m.media-amazon.com/images/I/81eT2pjx4jL.jpg",
                        "Um método fácil e comprovado de criar bons hábitos, seja para estudar focado ou manter a rotina de treinos.",
                        Arrays.asList("Produtividade", "Desenvolvimento Pessoal"))
        );
    }
}