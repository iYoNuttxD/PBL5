package PBL5;

public class Podcast {
    private String nome;
    private float duracao;
    private int vizualizacoes;
    private String integrantes;
    private boolean play;

    public Podcast() {
        this.nome = "Podcast";
        this.duracao = 0;
        this.vizualizacoes = 0;
        this.integrantes = "Nenhum";
        this.play = false;
    }

    public Podcast(String nome, float duracao, int vizualizacoes, String integrantes){
        this.nome = nome;
        this.duracao = duracao;
        this.vizualizacoes = vizualizacoes;
        this.integrantes = integrantes;
        this.play = false;

    }

    public String getNome () {
        return nome;
    }

    public float getDuracao () {
        return duracao;
    }

    public int getVizualizacoes () {
        return vizualizacoes;
    }

    public String getIntegrantes () {
        return integrantes;
    }

    public boolean isPlay(){
        return play;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDuracao(float duracao) {
        if (duracao >= 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválido!!!");
        }
    }

    public void setVizualizacoes(int vizualizacoes) {
        if (vizualizacoes >= 0) {
            this.vizualizacoes = vizualizacoes;
        } else {
            System.out.println("Vizualizações inválido!!!");
        }
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }


    public void ouvir() {
        if (!play) {
            System.out.println("Você começou a ouvir o podcast!");
            play = true;
        } else {
            System.out.println("Você parou de ouvir o podcast!");
            play = false;
        }
    }
}