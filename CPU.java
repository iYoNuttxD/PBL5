package PBL5;

public class CPU extends Produto{
    private String tipo;
    private int velocidade;
    private int threads;
    private int tdp;
    private int codCpu;
    private String gpus;
    private int nucleos;
    private float frequencia;
    private String soquete;



    public CPU(String tipo, int velocidade, int threads, int tdp, int codCpu, String gpus, int nucleos,
               float frequencia,String soquete, String descricao, float preco, String marca, String modelo){
        super(descricao, marca, modelo, preco);
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.threads = threads;
        this.tdp = tdp;
        this.codCpu = codCpu;
        this.gpus = gpus;
        this.nucleos = nucleos;
        this.frequencia = frequencia;
        this.soquete = soquete;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(){
        this.velocidade = velocidade;
    }

    public int getThreads(){
        return threads;
    }

    public void setThreads(){
        this.threads = threads;
    }

    private int getTdp(){
        return tdp;
    }

    public void setTdp(){
        this.tdp = tdp;
    }

    private int getCodCpu(){
        return codCpu;
    }

    public void setCodCpu(){
        this.codCpu = codCpu;
    }

    public int getNucleos(){
        return nucleos;
    }

    public void setNucleos(){
        this.nucleos = nucleos;
    }

    public String getGpus(){
        return gpus;
    }

    public void setGpus(){
        this.gpus = gpus;
    }

    public String getSoquete(){
        return soquete;
    }

    public void setSoquete(){
        this.soquete = soquete;
    }
};

