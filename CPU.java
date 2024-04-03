public class CPU{
    private String tipo;
    private int velocidade;
    private int threads;
    private int tdp;
    private int codCpu;
    private String gpus;
    private int nucleos;
    private float frequencia;
    private String soquete;



    public CPU(String tipo, int velocidade, int threads, int tdp, int codCpu,
               String gpus, int nucleos, float frequencia,String soquete) {
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.threads = threads;
        this.tdp = tdp;
        this.codCpu = codCpu;
        this.gpus = gpus;
        this.nucleos = nucleos;
        this.frequencia = frequencia;
        this.soquete = soquete;

        super(String descricao, float preco, String marca, String modelo)
    }
};

