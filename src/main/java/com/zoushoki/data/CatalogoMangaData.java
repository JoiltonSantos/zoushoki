package com.zoushoki.data;

import com.zoushoki.entity.Manga;
import java.util.ArrayList;

public class CatalogoMangaData {

    public static ArrayList<Manga> inicializar() {
        ArrayList<Manga> catalogo = new ArrayList<>();

        catalogo.add(new Manga("20th Century Boys", "Naoki Urasawa", 1999, 22, "Mistério", "Concluído"));
        catalogo.add(new Manga("3-gatsu no Lion", "Chica Umino", 2007, 17, "Drama", "Em Lançamento"));
        catalogo.add(new Manga("Akatsuki no Yona", "Mizuho Kusanagi", 2009, 44, "Aventura", "Em Lançamento"));
        catalogo.add(new Manga("Ashita no Joe", "Asao Takamori", 1968, 20, "Esporte", "Concluído"));
        catalogo.add(new Manga("Berserk", "Kentaro Miura", 1989, 43, "Fantasia", "Em Lançamento"));
        catalogo.add(new Manga("Dungeon Meshi", "Ryoko Kui", 2014, 14, "Fantasia", "Concluído"));
        catalogo.add(new Manga("Fullmetal Alchemist", "Hiromu Arakawa", 2001, 27, "Aventura", "Concluído"));
        catalogo.add(new Manga("Grand Blue", "Kenji Inoue", 2014, 24, "Comédia", "Em Lançamento"));
        catalogo.add(new Manga("GTO", "Tohru Fujisawa", 1996, 25, "Comédia", "Concluído"));
        catalogo.add(new Manga("Haikyuu!!", "Haruichi Furudate", 2012, 45, "Esporte", "Concluído"));
        catalogo.add(new Manga("Hajime no Ippo", "George Morikawa", 1989, 141, "Esporte", "Em Lançamento"));
        catalogo.add(new Manga("Houseki no Kuni", "Haruko Ichikawa", 2012, 12, "Fantasia", "Hiato"));
        catalogo.add(new Manga("Hunter x Hunter", "Yoshihiro Togashi", 1998, 38, "Aventura", "Hiato"));
        catalogo.add(new Manga("Jumyou wo Kaitotte Moratta", "Sugaru Miaki", 2016, 3, "Drama", "Concluído"));
        catalogo.add(new Manga("Kaguya-sama wa Kokurasetai", "Aka Akasaka", 2015, 28, "Comédia", "Concluído"));
        catalogo.add(new Manga("Kaoru Hana wa Rin to Saku", "Miura Sagiri", 2021, 11, "Romance", "Em Lançamento"));
        catalogo.add(new Manga("Kaze no Tani no Nausicaä", "Hayao Miyazaki", 1982, 7, "Fantasia", "Concluído"));
        catalogo.add(new Manga("Kingdom", "Yasuhisa Hara", 2006, 73, "Ação", "Em Lançamento"));
        catalogo.add(new Manga("Koe no Katachi", "Yoshitoki Oima", 2013, 7, "Drama", "Concluído"));
        catalogo.add(new Manga("Kokou no Hito", "Shinichi Sakamoto", 2007, 17, "Drama", "Concluído"));
        catalogo.add(new Manga("Monster", "Naoki Urasawa", 1994, 18, "Suspense", "Concluído"));
        catalogo.add(new Manga("Nana", "Ai Yazawa", 2000, 21, "Drama", "Hiato"));
        catalogo.add(new Manga("One Piece", "Eiichiro Oda", 1997, 112, "Aventura", "Em Lançamento"));
        catalogo.add(new Manga("Oyasumi Punpun", "Inio Asano", 2007, 13, "Drama", "Concluído"));
        catalogo.add(new Manga("Real", "Takehiko Inoue", 1999, 15, "Esporte", "Hiato"));
        catalogo.add(new Manga("Sousou no Frieren", "Kanehito Yamada", 2020, 14, "Fantasia", "Em Lançamento"));
        catalogo.add(new Manga("Vagabond", "Takehiko Inoue", 1998, 37, "Ação", "Hiato"));
        catalogo.add(new Manga("Yotsuba to!", "Kiyohiko Azuma", 2003, 16, "Slice of Life", "Em Lançamento"));

        return catalogo;
    }
}