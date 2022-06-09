
package catalogovideos;



public class Teste {

    public static void main(String[] args) {
    
        Filme mp = new Filme("Medida Provisoria", new Tema("Ficcao"));
        Filme cd = new Filme("Cidade de Deus", new Tema("Drama"));
        Filme ac = new Filme("Auto da Compadecida", new Tema("Aventura"));
        Serie ir = new Serie("Irmandade", new Tema("Drama"), 1, 1, "O Certo e o Certo");
        Artista tais = new Artista("Tais Araujo");
        Artista jorge = new Artista("Seu Jorge");
        Artista selton = new Artista("Selton Mello");
        mp.adicionaArtista(tais);
        mp.adicionaArtista(jorge);
        ac.adicionaArtista(selton);
        cd.adicionaArtista(jorge);
        ir.adicionaArtista(jorge);
        Catalogo catalogo = new Catalogo();
        catalogo.adiciona(mp).adiciona(cd).adiciona(ac).adiciona(ir);
        System.out.println("Catalogo completo:");
        System.out.println(catalogo);
        System.out.println("Filmes e Series com Seu Jorge:");
        System.out.println(catalogo.filtra("Jorge"));
        System.out.println("Dramas:");
        System.out.println(catalogo.filtra("Drama"));
        System.out.println("Filmes e Series com Tais Araujo e Selton Mello juntos:");
        System.out.println(catalogo.filtra("Tais").filtra("Mello"));
        System.out.println("Filmes e Series com Tais Araujo unidos com osdo Selton Mello:");
        System.out.println(catalogo.filtra("Tais").uniao(catalogo.filtra("Mello")));
    }

}


    

