
package catalogovideos;

import java.util.ArrayList;
import java.util.List;

public class Video {
    String titulo;
    Tema tema;
    List<Artista> artista;

    public Video(String titulo, Tema tema) {
        this.artista = new ArrayList<Artista>();
        this.titulo = titulo;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tema getTema() {
        return tema;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void adicionaArtista(Artista a) {
        artista.add(a);
    }

    public String toString() {
        return "Titulo: " + titulo + ", Tema: " + tema;

    }
}
