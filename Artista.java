package PBL5;
public class Artista {
    private String nomeDoArtista;
    private int numeroDeAlbum;
    private int numeroDeOuvinte;
    private int numeroDeMusica;
    private String musicaMaisFamosa;
    private boolean curtirArtista;
    private boolean seguirArtista;
    private boolean ouvirArtista;
    private String musicaFavoritaDOArtista;
    private int rankDoArtista;

    public Artista() {
        this.nomeDoArtista = "Artista";
        this.numeroDeAlbum = 0;
        this.numeroDeOuvinte = 0;
        this.numeroDeMusica = 0;
        this.musicaMaisFamosa = "Nenhuma";
        this.curtirArtista = false;
        this.seguirArtista = false;
        this.ouvirArtista = false;
        this.musicaFavoritaDOArtista = "Nenhuma";
        this.rankDoArtista = 0;
    }

    public Artista(String nomeDoArtista, int numeroDeAlbum, int numeroDeOuvinte, int numeroDeMusica,
                   String musicaMaisFamosa, String musicaFavoritaDOArtista, int rankDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
        this.numeroDeAlbum = numeroDeAlbum;
        this.numeroDeOuvinte = numeroDeOuvinte;
        this.numeroDeMusica = numeroDeMusica;
        this.musicaMaisFamosa = musicaMaisFamosa;
        this.curtirArtista = false;
        this.seguirArtista = false;
        this.ouvirArtista = false;
        this.musicaFavoritaDOArtista = musicaFavoritaDOArtista;
        this.rankDoArtista = rankDoArtista;
    }

    public String getNomeDoArtista(){return nomeDoArtista; }

    public int getNumeroDeAlbum(){return  numeroDeAlbum; }

    public int getNumeroDeOuvinte(){return numeroDeOuvinte; }

    public int getNumeroDeMusica(){return numeroDeMusica; }

    public String getMusicaMaisFamosa(){return musicaMaisFamosa; }

    public boolean iscurtirArtista(){return curtirArtista; }

    public boolean isseguirArtista(){return seguirArtista; }

    public boolean isouvirArtista(){return ouvirArtista; }

    public String getMusicaFavoritaDOArtista(){return musicaFavoritaDOArtista; }

    public int getRankDoArtista(){return rankDoArtista; }

    public void setNomeDoArtista(String nomeDoArtista){ this.nomeDoArtista = nomeDoArtista; }

    public void setNumeroDeAlbum(int numeroDeAlbum){
        if (numeroDeAlbum >= 0){
            this.numeroDeAlbum = numeroDeAlbum;
        } else {
            System.out.println("Número de álbuns inválido!!!");
        }
    }

    public void setNumeroDeOuvinte(int numeroDeOuvinte){
        if (numeroDeOuvinte >= 0){
            this.numeroDeOuvinte = numeroDeOuvinte;
        } else {
            System.out.println("Número de ouvintes inválido!!!");
        }
    }

    public void setNumeroDeMusica(int numeroDeMusica){
        if (numeroDeMusica >= 0){
            this.numeroDeMusica = numeroDeMusica;
        } else {
            System.out.println("Número de músicas inválido!!!");
        }
    }

    public void setRankDoArtista(int rankDoArtista){
        if (rankDoArtista>= 0){
            this.rankDoArtista = rankDoArtista;
        } else {
            System.out.println("Número de músicas inválido!!!");
        }
    }

    public void setMusicaMaisFamosa(String musicaMaisFamosa){
        this.musicaMaisFamosa = musicaMaisFamosa;
    }


    public void setMusicaFavoritaDOArtista(String musicaFavoritaDOArtista){
        this.musicaFavoritaDOArtista = musicaFavoritaDOArtista;
    }

    public void curtir(){
        if (!curtirArtista) {
            System.out.println("Você curtiu o " + nomeDoArtista);
            curtirArtista = true;
        } else {
            System.out.println("Você descurtiu o " + nomeDoArtista);
            curtirArtista = false;
        }
    }
    public void seguir() {
        if (!seguirArtista){
            System.out.println("Você seguiu o " + nomeDoArtista);
            seguirArtista = true;
        } else {
            System.out.println("Você desseguiu o " + nomeDoArtista);
            seguirArtista = false;
        }

    }
    public void musicaFavorita() {
        if (musicaFavoritaDOArtista.equals("Nenhuma")) {
            System.out.println(nomeDoArtista + " não tem nenhuma música favorita.");
        } else {
            System.out.println("A música favorita do " + nomeDoArtista + " é " + musicaFavoritaDOArtista);
        }
    }
    public void ouvirArtista() {
        if (!ouvirArtista) {
            System.out.println("Você começou a ouvir o " + nomeDoArtista);
            ouvirArtista = true;
        } else {
            System.out.println("Você parou a ouvir o " + nomeDoArtista);
            ouvirArtista = false;
        }
    }
}
