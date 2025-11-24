package com.zoushoki.entity;

import com.zoushoki.enums.StatusLeitura;

public class MangaLista {
    private Manga manga;
    private StatusLeitura statusLeitura;
    private int quantidadeVolumesLidos;
    private boolean favorito;
    private double nota;

    public MangaLista() {
    }

    public MangaLista(Manga manga) {
        this(manga, StatusLeitura.PRETENDO_LER, 0, false, 0.0);
    }

    public MangaLista(Manga manga, StatusLeitura statusLeitura) {
        this(manga, statusLeitura, 0, false, 0.0);
    }

    public MangaLista(Manga manga, StatusLeitura statusLeitura, int quantidadeVolumesLidos, boolean favorito, double nota) {
        this.manga = manga;
        this.statusLeitura = statusLeitura;
        this.quantidadeVolumesLidos = quantidadeVolumesLidos;
        this.favorito = favorito;
        this.nota = nota;
    }

    public Manga getManga() {
        return manga;
    }

    public StatusLeitura getStatusLeitura() {
        return statusLeitura;
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

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public void setStatusLeitura(StatusLeitura statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public void setQuantidadeVolumesLidos(int quantidadeVolumesLidos) {
        if (quantidadeVolumesLidos >= 0 && quantidadeVolumesLidos <= manga.getTotalVolumes()) {
            this.quantidadeVolumesLidos = quantidadeVolumesLidos;
        }
    }

    public void setFavorito(boolean favorito) {
        if (statusLeitura != StatusLeitura.ABANDONADO) {
            this.favorito = favorito;
        }
    }

    public void setNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0 && statusLeitura != StatusLeitura.PRETENDO_LER) {
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return manga.getTitulo() + " | " + statusLeitura + " | " + quantidadeVolumesLidos + "/" + manga.getTotalVolumes() + " volumes";
    }

    public void exibirInformacoes() {
        System.out.println("\n=== INFORMAÇÕES DO MANGÁ ===");
        System.out.println("Título: " + manga.getTitulo());
        System.out.println("Autor: " + manga.getAutor());
        System.out.println("Total de Volumes: " + manga.getTotalVolumes());
        System.out.println("Status: " + getStatusTexto());
        System.out.println("Quantidade de Volumes Lidos: " + quantidadeVolumesLidos);
        System.out.println("Nota: " + nota);
        System.out.println("Favorito: " + (favorito ? "Sim" : "Não"));
        System.out.println("============================\n");
    }

    private String getStatusTexto() {
        switch (statusLeitura) {
            case PRETENDO_LER:
                return "Pretendo Ler";
            case LENDO:
                return "Lendo";
            case COMPLETO:
                return "Completo";
            case EM_ESPERA:
                return "Em Espera";
            case ABANDONADO:
                return "Abandonado";
            default:
                return "Status Desconhecido";
        }
    }
}