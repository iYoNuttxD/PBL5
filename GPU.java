package PBL5;

public class GPU extends Produto {
    private int cod_Gpu;
    private String pcie;
    private int nucleos;
    private int tam_Mem;
    private int vel_Mem;
    private int tipo_Mem;
    private int tdp;
    private int slot;
    private int tamanho;
    private String conector;

    public GPU(String marca, String modelo, String descricao, float preco, int cod_Gpu, String pcie, int nucleos,
               int tam_Mem, int vel_Mem, int tipo_Mem, int tdp, int slot, int tamanho, String conector){
        super(marca, modelo, descricao, preco);
        this.cod_Gpu = cod_Gpu;
        this.pcie = pcie;
        this.nucleos = nucleos;
        this.tam_Mem = tam_Mem;
        this.vel_Mem = vel_Mem;
        this.tipo_Mem = tipo_Mem;
        this.tdp = tdp;
        this.slot = slot;
        this.tamanho = tamanho;
        this.conector = conector;

    }

}
