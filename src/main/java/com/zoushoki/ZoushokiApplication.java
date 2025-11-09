package com.zoushoki;

import com.zoushoki.data.CatalogoMangaData;
import com.zoushoki.entity.Manga;
import com.zoushoki.entity.MangaLista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class ZoushokiApplication {

    private static ArrayList<Manga> catalogo = new ArrayList<>();
    private static ArrayList<MangaLista> minhaLista = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(ZoushokiApplication.class, args);

        catalogo = CatalogoMangaData.inicializar();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarMangaLista();
                    break;
                case 2:
                    listarMangasLista();
                    break;
                case 3:
                    exibirEstatisticas();
                    break;
                case 0:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n========== ZOUSHOKI ==========");
        System.out.println("1 - Adicionar mangá à lista");
        System.out.println("2 - Listar meus mangás");
        System.out.println("3 - Ver estatísticas");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarMangaLista() {
        System.out.println("\n=== CATÁLOGO DE MANGÁS ===");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println((i + 1) + ". " + catalogo.get(i));
        }

        System.out.print("\nDigite o número do mangá: ");
        int numeroManga = scanner.nextInt();
        scanner.nextLine();

        if (numeroManga < 1 || numeroManga > catalogo.size()) {
            System.out.println("\nNúmero inválido!");
            return;
        }

        Manga mangaSelecionado = catalogo.get(numeroManga - 1);

        MangaLista mangaExistente = null;
        int indiceMangaExistente = -1;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getManga().getTitulo().equals(mangaSelecionado.getTitulo())) {
                mangaExistente = minhaLista.get(i);
                indiceMangaExistente = i;
                break;
            }
        }

        System.out.println("\nEscolha o status:");
        System.out.println("1 - Pretendo Ler");
        System.out.println("2 - Lendo");
        System.out.println("3 - Completo");
        System.out.println("4 - Em Espera");
        System.out.println("5 - Abandonado");
        System.out.print("Digite o código do status: ");
        int codigoStatus = scanner.nextInt();

        if (codigoStatus < 1 || codigoStatus > 5) {
            System.out.println("\nCódigo de status inválido!");
            return;
        }

        if (codigoStatus == 3) {
            String statusManga = mangaSelecionado.getStatusManga();
            if (statusManga.equals("Em Lançamento") || statusManga.equals("Hiato")) {
                System.out.println("\nEste mangá está em " + statusManga + " e não pode ser marcado como Completo!");
                return;
            }
        }

        int quantidadeVolumesLidos = 0;
        double nota = 0.0;
        boolean favorito = false;

        if (codigoStatus == 3) {
            quantidadeVolumesLidos = mangaSelecionado.getTotalVolumes();
        } else if (codigoStatus == 2 || codigoStatus == 4 || codigoStatus == 5) {
            boolean volumesValido = false;
            do {
                System.out.print("Digite a quantidade de volumes lidos: ");
                quantidadeVolumesLidos = scanner.nextInt();

                if (quantidadeVolumesLidos < 0) {
                    System.out.println("A quantidade não pode ser negativa!");
                } else if (quantidadeVolumesLidos > mangaSelecionado.getTotalVolumes()) {
                    System.out.println("A quantidade não pode ser maior que o total de volumes (" + mangaSelecionado.getTotalVolumes() + ")!");
                } else {
                    volumesValido = true;
                }
            } while (!volumesValido);
        }

        if (codigoStatus == 2 || codigoStatus == 3 || codigoStatus == 4 || codigoStatus == 5) {
            boolean notaValida = false;
            do {
                System.out.print("Digite a nota (0.0 a 10.0): ");
                nota = scanner.nextDouble();

                if (nota < 0.0 || nota > 10.0) {
                    System.out.println("A nota deve estar entre 0.0 e 10.0!");
                } else {
                    notaValida = true;
                }
            } while (!notaValida);
        }

        if (codigoStatus == 2 || codigoStatus == 3 || codigoStatus == 4) {
            boolean favoritoValido = false;
            do {
                try {
                    System.out.print("É favorito? (true/false): ");
                    favorito = scanner.nextBoolean();
                    favoritoValido = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("\nDigite 'true' ou 'false'.");
                    scanner.nextLine();
                }
            } while (!favoritoValido);
        }

        if (codigoStatus == 1 && (quantidadeVolumesLidos > 0 || nota > 0.0)) {
            System.out.println("\nStatus 'Pretendo Ler' não pode ter volumes lidos ou nota!");
            return;
        }

        if (codigoStatus == 5 && favorito) {
            System.out.println("\nMangás abandonados não podem ser favoritos!");
            return;
        }

        MangaLista mangaLista = new MangaLista(mangaSelecionado, codigoStatus, quantidadeVolumesLidos, favorito, nota);

        if (mangaExistente != null) {
            minhaLista.set(indiceMangaExistente, mangaLista);
            System.out.println("\n" + mangaSelecionado.getTitulo() + " atualizado na lista!");
        } else {
            minhaLista.add(mangaLista);
            System.out.println("\n" + mangaSelecionado.getTitulo() + " adicionado à lista!");
        }

        mangaLista.exibirInformacoes();
    }

    private static void listarMangasLista() {
        if (minhaLista.size() == 0) {
            System.out.println("\nSua lista está vazia!");
            return;
        }

        System.out.println("\n=== MINHA LISTA DE MANGÁS ===");
        for (int i = 0; i < minhaLista.size(); i++) {
            System.out.println("\n--- Mangá " + (i + 1) + " ---");
            minhaLista.get(i).exibirInformacoes();
        }
    }

    private static void exibirEstatisticas() {
        if (minhaLista.size() == 0) {
            System.out.println("\nSua lista está vazia!");
            return;
        }

        int totalPretendoLer = 0;
        int totalLendo = 0;
        int totalCompleto = 0;
        int totalEmEspera = 0;
        int totalAbandonado = 0;
        int totalFavoritos = 0;
        int totalVolumesLidos = 0;
        double somaNotas = 0.0;
        int totalAvaliados = 0;

        for (int i = 0; i < minhaLista.size(); i++) {
            MangaLista ml = minhaLista.get(i);

            if (ml.getCodigoStatus() == 1) {
                totalPretendoLer++;
            } else if (ml.getCodigoStatus() == 2) {
                totalLendo++;
            } else if (ml.getCodigoStatus() == 3) {
                totalCompleto++;
            } else if (ml.getCodigoStatus() == 4) {
                totalEmEspera++;
            } else if (ml.getCodigoStatus() == 5) {
                totalAbandonado++;
            }

            if (ml.isFavorito()) {
                totalFavoritos++;
            }

            totalVolumesLidos += ml.getQuantidadeVolumesLidos();

            if (ml.getNota() > 0.0) {
                somaNotas += ml.getNota();
                totalAvaliados++;
            }
        }

        double mediaNotas = totalAvaliados > 0 ? somaNotas / totalAvaliados : 0.0;
        double percentualFavoritos = (totalFavoritos * 100.0) / minhaLista.size();

        System.out.println("\n========== ESTATÍSTICAS ==========");
        System.out.println("Total de mangás na lista: " + minhaLista.size());
        System.out.println("\nStatus:");
        System.out.println("  Pretendo Ler: " + totalPretendoLer);
        System.out.println("  Lendo: " + totalLendo);
        System.out.println("  Completo: " + totalCompleto);
        System.out.println("  Em Espera: " + totalEmEspera);
        System.out.println("  Abandonado: " + totalAbandonado);
        System.out.println("\nTotal de volumes lidos: " + totalVolumesLidos);
        System.out.println("Média de notas: " + String.format("%.2f", mediaNotas));
        System.out.println("Total de favoritos: " + totalFavoritos + " (" + String.format("%.1f", percentualFavoritos) + "%)");
        System.out.println("==================================");
    }
}