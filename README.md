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