import java.util.ArrayList;

public class Placa_Mae extends Produto{
    private String tipo;
    private int velocidade;
    private String pcie;
    private int m2;
    private int sata;
    private String tamanho;
    private String soquete;
    private String chipSet;
    private ArrayList<Placa_Mae> placaMaes = new ArrayList<Placa_Mae>();



    public Placa_Mae(String tipo, int velocidade, String pcie, int m2, int sata,
                     String tamanho, String soquete, String chipSet, String descricao, float preco, String marca,
                     String modelo, int cod_Produto) {
        super(marca, modelo, descricao, preco, cod_Produto);
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.pcie = pcie;
        this.m2 = m2;
        this.sata = sata;
        this.tamanho = tamanho;
        this.soquete = soquete;
        this.chipSet = chipSet;

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

    public int getM2(){
        return m2;
    }

    public void setM2(){
        this.m2 = m2;
    }

    public int getSata(){
        return sata;
    }

    public void setSata(){
        this.sata = sata;
    }

    public String getPcie(){
        return pcie;
    }

    public void setPcie(){
        this.pcie = pcie;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(){
        this.tamanho = tamanho;
    }

    public String getSoquete(){
        return soquete;
    }

    public void setSoquete(){
        this.soquete = soquete;
    }

    public String getChipSet(){
        return chipSet;
    }

    public void setChipSet(){
        this.chipSet = chipSet;
    }
};
