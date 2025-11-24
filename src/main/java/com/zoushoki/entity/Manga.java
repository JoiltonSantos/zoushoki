package com.zoushoki.entity;

import com.zoushoki.enums.GeneroManga;
import com.zoushoki.enums.StatusManga;

public class Manga {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int totalVolumes;
    private GeneroManga genero;
    private StatusManga statusManga;

    public Manga() {
    }

    public Manga(String titulo, String autor) {
        this();
        this.titulo = titulo;
        this.autor = autor;
    }

    public Manga(String titulo, String autor, int anoPublicacao) {
        this(titulo, autor);
        this.anoPublicacao = anoPublicacao;
    }

    public Manga(String titulo, String autor, int anoPublicacao, int totalVolumes, GeneroManga genero, StatusManga statusManga) {
        this(titulo, autor, anoPublicacao);
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

    public GeneroManga getGenero() {
        return genero;
    }

    public StatusManga getStatusManga() {
        return statusManga;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public void setTotalVolumes(int totalVolumes) {
        if (totalVolumes > 0) {
            this.totalVolumes = totalVolumes;
        }
    }

    public void setGenero(GeneroManga genero) {
        this.genero = genero;
    }

    public void setStatusManga(StatusManga statusManga) {
        this.statusManga = statusManga;
    }

    @Override
    public String toString() {
        return titulo + " | " + totalVolumes + " volumes | Status: " + statusManga;
    }
}