package com.zoushoki.entity;

public class Manga {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int totalVolumes;
    private String genero;
    private String statusManga;

    public Manga(String titulo, String autor, int anoPublicacao, int totalVolumes, String genero, String statusManga) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.totalVolumes = totalVolumes;
        this.genero = genero;
        this.statusManga = statusManga;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getTotalVolumes() {
        return totalVolumes;
    }

    public String getGenero() {
        return genero;
    }

    public String getStatusManga() {
        return statusManga;
    }

    @Override
    public String toString() {
        return titulo + " | " + totalVolumes + " volumes | Status: " + statusManga;
    }
}