package domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String name;
    private List<Playlist> playlists = new ArrayList<>();

    public Usuario(String name, List<Playlist> playlists) {
        this.name = name;
        this.playlists = playlists;
    }

    public void criarPlaylist(String name){
        Playlist playlist = new Playlist (name);
        this.playlists.add(playlist);
    }

    public void adicionarMusicaPlaylist(String nomePlaylist, Music musica){
        int count = 0;

        for(int i = 0; i < playlists.size(); i++){
            if (nomePlaylist == playlists.get(i).getName()){
                playlists.get(i).adicionarMusica(musica);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Nenhuma playlist com este nome encontrada na lista de playlists do usuário.");
        }

    }


    public void listarPlaylists(){
        for(int i = 0; i < playlists.size(); i++){
            System.out.println(playlists.get(i).getName());
            playlists.get(i).listarMusicas();
        }
    }

}
