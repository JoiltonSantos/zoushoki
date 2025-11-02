package com.zoushoki;

import com.zoushoki.entity.MangaLista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZoushokiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoushokiApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        MangaLista mangaLista;

        System.out.println("\n=== CADASTRO DE MANGÁ ===\n");

        System.out.print("Digite o título: ");
        String titulo = scanner.nextLine();

        System.out.println("\nEscolha o status:");
        System.out.println("1 - Pretendo Ler");
        System.out.println("2 - Lendo");
        System.out.println("3 - Completo");
        System.out.println("4 - Em Espera");
        System.out.println("5 - Abandonado");
        System.out.print("Digite o código do status: ");
        int codigoStatus = scanner.nextInt();

        int quantidadeVolumesLidos = 0;
        double nota = 0.0;
        boolean favorito = false;

        if (codigoStatus == 2 || codigoStatus == 3 || codigoStatus == 4 || codigoStatus == 5) {
            System.out.print("Digite a quantidade de volumes lidos: ");
            quantidadeVolumesLidos = scanner.nextInt();
        }

        if (codigoStatus == 2 || codigoStatus == 3 || codigoStatus == 4 || codigoStatus == 5) {
            System.out.print("Digite a nota (0.0 a 10.0): ");
            nota = scanner.nextDouble();
        }

        if (codigoStatus == 2 || codigoStatus == 3 || codigoStatus == 4) {
            System.out.print("É favorito? (true/false): ");
            favorito = scanner.nextBoolean();
        }

        mangaLista = new MangaLista(titulo, codigoStatus, quantidadeVolumesLidos, favorito, nota);

        mangaLista.exibirInformacoes();

        scanner.close();
    }

}
