package com.zoushoki.entity;

public class MangaLista {
    private Manga manga;
    private int codigoStatus;
    private int quantidadeVolumesLidos;
    private boolean favorito;
    private double nota;

    public MangaLista(Manga manga, int codigoStatus, int quantidadeVolumesLidos, boolean favorito, double nota) {
        this.manga = manga;
        this.codigoStatus = codigoStatus;
        this.quantidadeVolumesLidos = quantidadeVolumesLidos;
        this.favorito = favorito;
        this.nota = nota;
    }

    public Manga getManga() {
        return manga;
    }

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public int getQuantidadeVolumesLidos() {
        return quantidadeVolumesLidos;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public double getNota() {
        return nota;
    }

    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DO MANGÁ ===");
        System.out.println("Título: " + manga.getTitulo());
        System.out.println("Autor: " + manga.getAutor());
        System.out.println("Total de Volumes: " + manga.getTotalVolumes());
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