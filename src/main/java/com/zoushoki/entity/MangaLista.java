package com.zoushoki.entity;

public class MangaLista {
    private String titulo;
    private int codigoStatus;
    private int quantidadeVolumesLidos;
    private boolean favorito;
    private double nota;

    public MangaLista(String titulo, int codigoStatus, int quantidadeVolumesLidos, boolean favorito, double nota) {
        this.titulo = titulo;
        this.codigoStatus = codigoStatus;
        this.quantidadeVolumesLidos = quantidadeVolumesLidos;
        this.favorito = favorito;
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DO MANGÁ ===");
        System.out.println("Título: " + titulo);
        System.out.println("Status: " + calcularStatus());
        System.out.println("Quantidade de Volumes Lidos: " + quantidadeVolumesLidos);
        System.out.println("Nota: " + nota);
        System.out.println("Favorito: " + (favorito ? "Sim" : "Não"));
        System.out.println("============================\n");
    }

    private String calcularStatus() {
        switch (codigoStatus) {
            case 1:
                return "Pretendo Ler";
            case 2:
                return "Lendo";
            case 3:
                return "Completo";
            case 4:
                return "Em Espera";
            case 5:
                return "Abandonado";
            default:
                return "Status Desconhecido";
        }
    }
}