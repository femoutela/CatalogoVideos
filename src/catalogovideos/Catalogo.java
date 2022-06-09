
package catalogovideos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Catalogo {
   List<Video> videos;

    public Catalogo() {
        this.videos = new ArrayList<Video>();
    }

    public Catalogo(List<Video> videos) {
        this.videos = videos;
    }

    Catalogo adiciona(Video f) {
        videos.add(f);
        return this;

    }

    public String toString() {
        String retorno = "";
        for (Video v : videos) {
            retorno += v.toString() + "\n";
        }
        return retorno;
    }

    Catalogo filtra(String f) {
        Catalogo resultado = new Catalogo();
        for (Video v : videos) {

            for (Artista a : v.getArtista()) {
                if ((v.getTitulo().contains(f)) || (v.getTema().getTema().contains(f)) || a.getNomeArt().contains(f)) {
                    resultado.adiciona(v);

                }
            }
        }

        return resultado;

    }

    Catalogo uniao(Catalogo f) {
        Set<Video> set = new HashSet<Video>();
        set.addAll(videos);
        set.addAll(f.videos);
        return new Catalogo(new ArrayList<Video>(set));
        
    }
      
}
