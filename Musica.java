package PBL5;

public class Musica {
    private String nome;
    private String album;
    private float duracao;
    private String nomeArtista;
    private int vizualizacoes;
    private String dataLancamento;
    private boolean explicito;
    private boolean play;

    public Musica() {
        this.nome = "Música";
        this.album = "Álbum";
        this.duracao = 0f;
        this.nomeArtista = "Artista";
        this.vizualizacoes = 0;
        this.dataLancamento = "00/00/0000";
        this.explicito = false;
        this.play = false;
    }

    public Musica(String nome, String album, float duracao, String nomeArtista,
                  int vizualizacoes, String dataLancamento) {
        this.nome = nome;
        this.album = album;
        this.duracao = duracao;
        this.nomeArtista = nomeArtista;
        this.vizualizacoes = vizualizacoes;
        this.dataLancamento = dataLancamento;
        this.explicito = false;
        this.play = false;

    }

    public String getNome() {
        return nome;
    }

    public String getAlbum() {
        return album;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public int getVizualizacoes() {
        return vizualizacoes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public boolean isExplicito() {
        return explicito;
    }

    public boolean isPlay() {
        return play;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setDuracao(float duracao){
        if (duracao >= 0){
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválida!!!");
        }
    }

    public void setNomeArtista(String nomeArtista){
        this.nomeArtista = nomeArtista;
    }

    public void setVizualizacoes(int vizualizacoes){
        if (vizualizacoes >= 0){
            this.vizualizacoes = vizualizacoes;
        } else {
            System.out.println("Vizualização inválida!!!");
        }
    }

    public void setDataLancamento(String dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    public void tocar(){
        if (!play) {
            System.out.println("Você começou a tocar está música!");
            play = true;
        } else {
            System.out.println("Você parou de tocar está música!");
            play = false;
        }
    }


    public void explicitar(){
        if (!explicito){
            System.out.println("Está música é explicita!");
            explicito = true;
        } else {
            System.out.println("Está música não é explicita.");
        }
    }
}
