package PBL5;


import PBL3.Artista;
import PBL3.*;

public class Main {
    public static void main (String [] args){
        System.out.println("Equipe: Daniel Ganz Musse, João Vitor de Souza Hernandes, " +
                "Pedro Henrique Silva Cabral, Fabio Augusto Gortz");
        Playlist playlist = new Playlist();
        System.out.println("----- PLAYLIST SEM PARAMETROS -----");
        System.out.println("Nome da playlist: " + playlist.getNomedaPlaylist());
        System.out.println("Nome do autor: " + playlist.getNomedoAutor());
        System.out.println("Número de músicas: " + playlist.getNumdeMusica());
        System.out.println("Número de horas: " + playlist.getNumdeHoras());
        System.out.println("Número de curtidas: " + playlist.getNumdeCurtida());
        System.out.println("Privacidade: " + playlist.getPrivacidade());
        System.out.println("Curtido? " + playlist.isCurtida());
        System.out.println("Baixado? " + playlist.isDownload());
        System.out.println("Ordem aleátoria? " + playlist.isOrdem());
        System.out.println("Tocando? " + playlist.isPlay());
        System.out.println("-----------------------------------");

        playlist.setNomedaPlaylist("Playlist POO");
        playlist.setNomedoAutor("Daniel");
        playlist.setNumdeMusica(300);
        playlist.setNumdeHoras(20);
        playlist.setNumdeCurtida(5);
        playlist.setPrivacidade("Privado");
        playlist.baixar();
        playlist.tocar();
        playlist.ordenar();
        playlist.curtir();
        System.out.println("-----------------------------------");

        System.out.println("----- PLAYLIST SEM PARAMETROS APÓS SETTER -----");
        System.out.println("Nome da playlist: " + playlist.getNomedaPlaylist());
        System.out.println("Nome do autor: " + playlist.getNomedoAutor());
        System.out.println("Número de músicas: " + playlist.getNumdeMusica());
        System.out.println("Número de horas: " + playlist.getNumdeHoras());
        System.out.println("Número de curtidas: " + playlist.getNumdeCurtida());
        System.out.println("Privacidade: " + playlist.getPrivacidade());
        System.out.println("Curtido? " + playlist.isCurtida());
        System.out.println("Baixado? " + playlist.isDownload());
        System.out.println("Ordem aleátoria? " + playlist.isOrdem());
        System.out.println("Tocando? " + playlist.isPlay());
        System.out.println("-----------------------------------");

        Playlist playlist1 = new Playlist("New Era", "Daniel",336,
                20, 2, "Público");
        System.out.println("----- PLAYLIST COM PARAMETROS -----");
        System.out.println("Nome da playlist: " + playlist1.getNomedaPlaylist());
        System.out.println("Nome do autor: " + playlist1.getNomedoAutor());
        System.out.println("Número de músicas: " + playlist1.getNumdeMusica());
        System.out.println("Número de horas: " + playlist1.getNumdeHoras());
        System.out.println("Número de curtidas: " + playlist1.getNumdeCurtida());
        System.out.println("Privacidade: " + playlist1.getPrivacidade());
        System.out.println("Curtido? " + playlist1.isCurtida());
        System.out.println("Baixado? " + playlist1.isDownload());
        System.out.println("Ordem aleátoria? " + playlist1.isOrdem());
        System.out.println("Tocando? " + playlist1.isPlay());
        System.out.println("-----------------------------------");

        PBL3.Artista artista = new PBL3.Artista();
        System.out.println("----- ARTISTA SEM PARAMETROS -----");
        System.out.println("Nome do artista: " + artista.getNomeDoArtista());
        System.out.println("Número de álbuns: " + artista.getNumeroDeAlbum());
        System.out.println("Número de ouvintes: " + artista.getNumeroDeOuvinte());
        System.out.println("Número de músicas: " + artista.getNumeroDeMusica());
        System.out.println("Música mais famosa: " + artista.getMusicaMaisFamosa());
        System.out.println("Curtido? " + artista.iscurtirArtista());
        System.out.println("Seguindo? " + artista.isseguirArtista());
        System.out.println("Ouvindo? " + artista.isouvirArtista());
        System.out.println("Música favorita do artista: " + artista.getMusicaFavoritaDOArtista());
        System.out.println("Rank do artista: " + artista.getRankDoArtista());
        System.out.println("-----------------------------------");

        artista.setNomeDoArtista("Kanye West");
        artista.setNumeroDeAlbum(13);
        artista.setNumeroDeOuvinte(74144569);
        artista.setNumeroDeMusica(419);
        artista.setRankDoArtista(7);
        artista.setMusicaMaisFamosa("Heartless");
        artista.setMusicaFavoritaDOArtista("CARNIVAL");
        artista.curtir();
        artista.seguir();
        artista.musicaFavorita();
        artista.ouvirArtista();
        System.out.println("-----------------------------------");

        System.out.println("----- ARTISTA SEM PARAMETROS APÓS SETTER -----");
        System.out.println("Nome do artista: " + artista.getNomeDoArtista());
        System.out.println("Número de álbuns: " + artista.getNumeroDeAlbum());
        System.out.println("Número de ouvintes: " + artista.getNumeroDeOuvinte());
        System.out.println("Número de músicas: " + artista.getNumeroDeMusica());
        System.out.println("Música mais famosa: " + artista.getMusicaMaisFamosa());
        System.out.println("Curtido? " + artista.iscurtirArtista());
        System.out.println("Seguindo? " + artista.isseguirArtista());
        System.out.println("Ouvindo? " + artista.isouvirArtista());
        System.out.println("Música favorita do artista: " + artista.getMusicaFavoritaDOArtista());
        System.out.println("Rank do artista: " + artista.getRankDoArtista());
        System.out.println("-----------------------------------");

        PBL3.Artista artista1 = new Artista("¥$", 1,
                28373945, 28, "CARNIVAL",
                "CARNIVAL", 0);

        System.out.println("----- ARTISTA COM PARAMETROS -----");
        System.out.println("Nome do artista: " + artista1.getNomeDoArtista());
        System.out.println("Número de álbuns: " + artista1.getNumeroDeAlbum());
        System.out.println("Número de ouvintes: " + artista1.getNumeroDeOuvinte());
        System.out.println("Número de músicas: " + artista1.getNumeroDeMusica());
        System.out.println("Música mais famosa: " + artista1.getMusicaMaisFamosa());
        System.out.println("Curtido? " + artista1.iscurtirArtista());
        System.out.println("Seguindo? " + artista1.isseguirArtista());
        System.out.println("Ouvindo? " + artista1.isouvirArtista());
        System.out.println("Música favorita do artista: " + artista1.getMusicaFavoritaDOArtista());
        System.out.println("Rank do artista: " + artista1.getRankDoArtista());
        System.out.println("-----------------------------------");

        Podcast podcast = new Podcast();
        System.out.println("----- PODCAST SEM PARAMETROS -----");
        System.out.println("Nome do podcast: " + podcast.getNome());
        System.out.println("Duração do podcast: " + podcast.getDuracao());
        System.out.println("Vizualizações do podcast " + podcast.getVizualizacoes());
        System.out.println("Integrantes do podcast: " + podcast.getIntegrantes());
        System.out.println("Ouvindo? " + podcast.isPlay());
        System.out.println("-----------------------------------");

        podcast.setNome("Rubens Barrichello - Flow #339");
        podcast.setDuracao(2.36f);
        podcast.setVizualizacoes(119000);
        podcast.setIntegrantes("Igor3k e Rubens Barrichello");
        podcast.ouvir();
        System.out.println("-----------------------------------");

        System.out.println("----- PODCAST SEM PARAMETROS APÓS SETTER -----");
        System.out.println("Nome do podcast: " + podcast.getNome());
        System.out.println("Duração do podcast: " + podcast.getDuracao());
        System.out.println("Vizualizações do podcast " + podcast.getVizualizacoes());
        System.out.println("Integrantes do podcast: " + podcast.getIntegrantes());
        System.out.println("Ouvindo? " + podcast.isPlay());
        System.out.println("-----------------------------------");

        Podcast podcast1 = new Podcast("MC NEGO BLUE - Podpah #738", 1.48f, 100000,
                "Igão, Mítico e MC NEGO BLUE");

        System.out.println("----- PODCAST COM PARAMETROS -----");
        System.out.println("Nome do podcast: " + podcast1.getNome());
        System.out.println("Duração do podcast: " + podcast1.getDuracao());
        System.out.println("Vizualizações do podcast " + podcast1.getVizualizacoes());
        System.out.println("Integrantes do podcast: " + podcast1.getIntegrantes());
        System.out.println("Ouvindo? " + podcast1.isPlay());
        System.out.println("-----------------------------------");

        Musica musica = new Musica();
        System.out.println("----- MUSICA SEM PARAMETROS -----");
        System.out.println("Nome da música: " + musica.getNome());
        System.out.println("Nome da álbum: " + musica.getAlbum());
        System.out.println("Duração da música: " + musica.getDuracao());
        System.out.println("Nome do artista: " + musica.getNomeArtista());
        System.out.println("Vizualizações: " + musica.getVizualizacoes());
        System.out.println("Data de lançamento: " + musica.getDataLancamento());
        System.out.println("É explicito? " + musica.isExplicito());
        System.out.println("Tocando? " + musica.isPlay());
        System.out.println("-----------------------------------");

        musica.setNome("CARNIVAL");
        musica.setAlbum("VULTURES 1");
        musica.setDuracao(4.24f);
        musica.setNomeArtista("¥$");
        musica.setVizualizacoes(148427021);
        musica.setDataLancamento("10/02/2024");
        musica.tocar();
        musica.explicitar();
        System.out.println("-----------------------------------");

        System.out.println("----- MUSICA SEM PARAMETROS APÓS SETTER -----");
        System.out.println("Nome da música: " + musica.getNome());
        System.out.println("Nome da álbum: " + musica.getAlbum());
        System.out.println("Duração da música: " + musica.getDuracao());
        System.out.println("Nome do artista: " + musica.getNomeArtista());
        System.out.println("Vizualizações: " + musica.getVizualizacoes());
        System.out.println("Data de lançamento: " + musica.getDataLancamento());
        System.out.println("É explicito? " + musica.isExplicito());
        System.out.println("Tocando? " + musica.isPlay());
        System.out.println("-----------------------------------");

        Musica musica1 = new Musica("BACK TO ME", "VULTURES 1", 4.55f,
                "¥$", 44574821, "10/02/2024");

        System.out.println("----- MUSICA COM PARAMETROS -----");
        System.out.println("Nome da música: " + musica1.getNome());
        System.out.println("Nome da álbum: " + musica1.getAlbum());
        System.out.println("Duração da música: " + musica1.getDuracao());
        System.out.println("Nome do artista: " + musica1.getNomeArtista());
        System.out.println("Vizualizações: " + musica1.getVizualizacoes());
        System.out.println("Data de lançamento: " + musica1.getDataLancamento());
        System.out.println("É explicito? " + musica1.isExplicito());
        System.out.println("Tocando? " + musica1.isPlay());
        System.out.println("-----------------------------------");

        Usuario usuario = new Usuario();
        System.out.println("----- USUÁRIO SEM PARAMETROS -----");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Data de nascimento: " + usuario.getDataNascimento());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("Premium? " + usuario.isPremium());
        System.out.println("País: " + usuario.getCountry());
        System.out.println("-----------------------------------");
        usuario.setNome("Daniel");
        usuario.setEmail("daniel@gmail.com");
        usuario.setDataNascimento("28/10/2005");
        usuario.setGenero("Homem");
        usuario.premiar();
        usuario.setCountry("Brasil");
        System.out.println("-----------------------------------");
        System.out.println("----- USUÁRIO SEM PARAMETROS APÓS SETTER -----");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Data de nascimento: " + usuario.getDataNascimento());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("Premium? " + usuario.isPremium());
        System.out.println("País: " + usuario.getCountry());
        System.out.println("-----------------------------------");
        Usuario usuario1 = new Usuario("Pedro", "pedro@gmail.com",
                "02/03/2005", "Homem", "Brasil");

        System.out.println("----- USUÁRIO COM PARAMETROS -----");
        System.out.println("Nome do usuário: " + usuario1.getNome());
        System.out.println("Email: " + usuario1.getEmail());
        System.out.println("Data de nascimento: " + usuario1.getDataNascimento());
        System.out.println("Gênero: " + usuario1.getGenero());
        System.out.println("Premium? " + usuario1.isPremium());
        System.out.println("País: " + usuario1.getCountry());
        System.out.println("-----------------------------------");

    }

}
