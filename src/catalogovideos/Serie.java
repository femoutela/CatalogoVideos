
package catalogovideos;


public class Serie extends Video {

    int temporada;
    int episodio;
    String titEpisodio;

    public Serie(String titulo, Tema tema, int temporada, int episodio, String titEpisodio) {
        super(titulo, tema);
        this.temporada = temporada;
        this.episodio = episodio;
        this.titEpisodio = titEpisodio;
    }

}