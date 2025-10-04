package domain;

public class Music {

    private String titulo;
    private String artista;
    private int duracao;

    public Music(String tittle, String artist, int length) {
        this.titulo = tittle;
        this.artista = artist;
        this.duracao = length;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public String toString() {
        return ("TÍTULO: " + this.titulo + " ARTISTA: " + this.artista + " DURAÇÃO: " + this.duracao);

    }
}
