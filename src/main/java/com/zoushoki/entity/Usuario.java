package com.zoushoki.entity;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<MangaLista> minhaLista;

    public Usuario() {
        this.minhaLista = new ArrayList<>();
    }

    public Usuario(String nome) {
        this();
        this.nome = nome;
    }

    public Usuario(String nome, String email) {
        this(nome);
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<MangaLista> getMinhaLista() {
        return minhaLista;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMinhaLista(ArrayList<MangaLista> minhaLista) {
        this.minhaLista = minhaLista;
    }

    public void adicionarManga(MangaLista mangaLista) {
        minhaLista.add(mangaLista);
    }

    public void removerManga(MangaLista mangaLista) {
        minhaLista.remove(mangaLista);
    }

    public int getTotalMangasNaLista() {
        return minhaLista.size();
    }

    @Override
    public String toString() {
        return nome + " | " + minhaLista.size() + " mangás na lista";
    }
}