package com.zoushoki.data;

import com.zoushoki.entity.Manga;
import com.zoushoki.enums.GeneroManga;
import com.zoushoki.enums.StatusManga;
import java.util.ArrayList;

public class CatalogoMangaData {

    public static ArrayList<Manga> inicializar() {
        ArrayList<Manga> catalogo = new ArrayList<>();

        catalogo.add(new Manga("20th Century Boys", "Naoki Urasawa", 1999, 22, GeneroManga.MISTERIO, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("3-gatsu no Lion", "Chica Umino", 2007, 17, GeneroManga.DRAMA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Akatsuki no Yona", "Mizuho Kusanagi", 2009, 44, GeneroManga.AVENTURA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Ashita no Joe", "Asao Takamori", 1968, 20, GeneroManga.ESPORTE, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Berserk", "Kentaro Miura", 1989, 43, GeneroManga.FANTASIA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Dungeon Meshi", "Ryoko Kui", 2014, 14, GeneroManga.FANTASIA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Fullmetal Alchemist", "Hiromu Arakawa", 2001, 27, GeneroManga.AVENTURA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Grand Blue", "Kenji Inoue", 2014, 24, GeneroManga.COMEDIA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("GTO", "Tohru Fujisawa", 1996, 25, GeneroManga.COMEDIA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Haikyuu!!", "Haruichi Furudate", 2012, 45, GeneroManga.ESPORTE, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Hajime no Ippo", "George Morikawa", 1989, 141, GeneroManga.ESPORTE, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Houseki no Kuni", "Haruko Ichikawa", 2012, 12, GeneroManga.FANTASIA, StatusManga.HIATO));
        catalogo.add(new Manga("Hunter x Hunter", "Yoshihiro Togashi", 1998, 38, GeneroManga.AVENTURA, StatusManga.HIATO));
        catalogo.add(new Manga("Jumyou wo Kaitotte Moratta", "Sugaru Miaki", 2016, 3, GeneroManga.DRAMA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Kaguya-sama wa Kokurasetai", "Aka Akasaka", 2015, 28, GeneroManga.COMEDIA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Kaoru Hana wa Rin to Saku", "Miura Sagiri", 2021, 11, GeneroManga.ROMANCE, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Kaze no Tani no Nausicaä", "Hayao Miyazaki", 1982, 7, GeneroManga.FANTASIA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Kingdom", "Yasuhisa Hara", 2006, 73, GeneroManga.ACAO, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Koe no Katachi", "Yoshitoki Oima", 2013, 7, GeneroManga.DRAMA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Kokou no Hito", "Shinichi Sakamoto", 2007, 17, GeneroManga.DRAMA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Monster", "Naoki Urasawa", 1994, 18, GeneroManga.SUSPENSE, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Nana", "Ai Yazawa", 2000, 21, GeneroManga.DRAMA, StatusManga.HIATO));
        catalogo.add(new Manga("One Piece", "Eiichiro Oda", 1997, 112, GeneroManga.AVENTURA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Oyasumi Punpun", "Inio Asano", 2007, 13, GeneroManga.DRAMA, StatusManga.CONCLUIDO));
        catalogo.add(new Manga("Real", "Takehiko Inoue", 1999, 15, GeneroManga.ESPORTE, StatusManga.HIATO));
        catalogo.add(new Manga("Sousou no Frieren", "Kanehito Yamada", 2020, 14, GeneroManga.FANTASIA, StatusManga.EM_LANCAMENTO));
        catalogo.add(new Manga("Vagabond", "Takehiko Inoue", 1998, 37, GeneroManga.ACAO, StatusManga.HIATO));
        catalogo.add(new Manga("Yotsuba to!", "Kiyohiko Azuma", 2003, 16, GeneroManga.SLICE_OF_LIFE, StatusManga.EM_LANCAMENTO));

        return catalogo;
    }
}