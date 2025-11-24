# Zoushoki

Zoushoki é um gerenciador de lista de mangás desenvolvido como um projeto de estudo em Java. É uma aplicação de console construída com Spring Boot que permite ao usuário catalogar, listar e ver estatísticas sobre sua coleção de mangás.

## Feature 1: Entidade e Interação Básica

Nesta etapa inicial, a estrutura do projeto foi configurada e a interação básica com o usuário foi estabelecida.

* **Entidade Principal:** Foi definida a classe `MangaLista` para representar um mangá na lista do usuário. Esta classe utiliza atributos com tipos variados para armazenar os dados.
* **Coleta de Dados:** Utilização da classe `Scanner` para coletar dados do usuário via console.
* **Métodos:** A entidade possui um método público (`exibirInformacoes`) que chama um método privado (`calcularStatus`) para processar e exibir os dados de forma organizada.

## Feature 2: Controle de Fluxo

A segunda etapa evoluiu o projeto para uma aplicação interativa, implementando lógicas de controle de fluxo para gerenciar as ações do usuário.

* **Menu Interativo:** O loop principal da aplicação foi reescrito usando `do-while` para manter o programa em execução. Uma estrutura `switch-case` foi usada para criar o menu principal, e o `break` é usado para finalizar cada caso.
* **Tomada de Decisão:** Foram usadas estruturas `if`, `else if` e operadores lógicos (`||`, `&&`) para criar às validações necessárias.
* **Laços de Repetição:** Loops `for` são usados para iterar sobre o catálogo de mangás e a lista do usuário. Loops `do-while` garantem que o usuário forneça entradas válidas antes de continuar.

## Feature 3: Programação Orientada a Objetos

Na terceira etapa, o projeto foi reestruturado seguindo os pilares da Programação Orientada a Objetos.

* **Enums:** Foram criados três enums: `StatusLeitura` (com códigos numéricos 1-5), `StatusManga` (EM_LANCAMENTO, HIATO, CONCLUIDO) e `GeneroManga` (ACAO, AVENTURA, COMEDIA, DRAMA, etc.). O enum `StatusLeitura` possui um método `fromCodigo()` para conversão direta de int para enum.
* **Nova Classe e Relacionamentos:** Foi criada a classe `Usuario` que possui um relacionamento um-para-muitos com `MangaLista` através de um `ArrayList`.
* **Construtores Sobrecarregados:** Todas as classes principais possuem múltiplos construtores, demonstrando sobrecarga de métodos.
* **Encapsulamento:** Todos os atributos são privados, com getters e setters implementados. Os setters contêm validações de regras de negócio, como impedir volumes negativos, notas fora da faixa 0-10, e regras específicas como mangás abandonados não poderem ser favoritos.
* **Método toString():** Implementado em todas as classes seguindo um padrão consistente.