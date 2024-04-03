package PBL5;

import PBL3.Usuario;

public class Playlist extends Usuario {
    private String nomedaPlaylist;
    private String nomedoAutor;
    private int numdeMusica;
    private float numdeHoras;
    private int numdeCurtida;
    private String privacidade;
    private boolean download;
    private boolean curtida;
    private boolean play;
    private boolean ordem;

    public Playlist() {
        this.nomedaPlaylist = "Minha Playlist";
        this.nomedoAutor = "Usuário";
        this.numdeMusica = 0;
        this.numdeHoras = 0;
        this.numdeCurtida = 0;
        this.privacidade = "Público";
        this.download = false;
        this.curtida = false;
        this.play = false;
        this.ordem = false;
    }

    public Playlist(String nomedaPlaylist, String nomedoAutor, int numdeMusica, int numdeHoras, int numdeCurtida,
                    String privacidade) {
        this.nomedaPlaylist = nomedaPlaylist;
        this.nomedoAutor = nomedoAutor;
        this.numdeMusica = numdeMusica;
        this.numdeHoras = numdeHoras;
        this.numdeCurtida = numdeCurtida;
        this.privacidade = privacidade;
        this.download = false;
        this.curtida = false;
        this.play = false;
        this.ordem = false;
    }

    public String getNomedaPlaylist() {
        return nomedaPlaylist;
    }

    public String getNomedoAutor() {
        return nomedoAutor;
    }

    public int getNumdeMusica() {
        return numdeMusica;
    }

    public float getNumdeHoras() {
        return numdeHoras;
    }

    public int getNumdeCurtida() {
        return numdeCurtida;
    }

    public String getPrivacidade() {
        return privacidade;
    }

    public boolean isCurtida() {
        return curtida;
    }

    public boolean isDownload() {
        return download;
    }

    public boolean isOrdem() {
        return ordem;
    }

    public boolean isPlay() {
        return play;
    }

    public void setNomedaPlaylist(String nomedaPlaylist) {
        this.nomedaPlaylist = nomedaPlaylist;
    }

    public void setNomedoAutor(String nomedoAutor) {
        this.nomedoAutor = nomedoAutor;
    }

    public void setNumdeMusica(int numdeMusica) {
        if (numdeMusica >= 0) {
            this.numdeMusica = numdeMusica;
        } else {
            System.out.println("Número de músicas inválido!!!");
        }
    }

    public void setNumdeHoras(float numdeHoras) {
        if (numdeHoras >= 0) {
            this.numdeHoras = numdeHoras;
        } else {
            System.out.println("Número de horas inválido!!!");
        }
    }

    public void setNumdeCurtida(int numdeCurtida) {
        if (numdeCurtida >= 0) {
            this.numdeCurtida = numdeCurtida;
        } else {
            System.out.println("Número de curtidas inválido!!!");
        }
    }

    public void setPrivacidade(String privacidade) {
        if (privacidade.equals("Público") || privacidade.equals("Privado")) {
            this.privacidade = privacidade;
        } else {
            System.out.println("Privacidade inválida!!!");
        }
    }

    public void baixar() {
        if (!download) {
            System.out.println("Você está baixando está playlist!");
            download = true;
        } else {
            System.out.println("Você está desbaixando está playlist!");
            download = false;
        }
    }

    public void curtir() {
        if (!curtida) {
            System.out.println("Você curtiu está playlist!");
            curtida = true;
            numdeCurtida += 1;
        } else {
            System.out.println("Você descurtiu está playlist!");
            curtida = false;
            numdeCurtida -= 1;
        }
    }

    public void tocar() {
        if (!play) {
            System.out.println("Você está escutando essa playlist!");
            play = true;
        } else {
            System.out.println("Você parou de escutar essa playlist!");
            play = false;
        }
    }

    public void ordenar() {
        if (!ordem) {
            System.out.println("Você ativou a ordem aleátoria!");
            ordem = true;
        } else {
            System.out.println("Você desativou a ordem aleátoria!");
            ordem = false;
        }
    }
}


