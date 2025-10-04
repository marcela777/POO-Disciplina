package domain;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private List<Music> musics = new ArrayList<>();

    public Playlist(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void adicionarMusica(Music musica){
        this.musics.add(musica);
    }

    public void listarMusicas(){
        for(int i = 0; i < musics.size(); i++){
            System.out.println(musics.get(i).toString());
        }
    }

    public int calcularDuracaoTotal(){
        int soma = 0;
        int duracaoMusica = 0;

        for(int i = 0; i < musics.size(); i++){
           duracaoMusica = musics.get(i).getDuracao();
           soma += duracaoMusica;
        }
        return soma;
    }
}
