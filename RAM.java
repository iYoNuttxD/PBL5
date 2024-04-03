public class RAM extends Produto {
    private int capacidade;
    private String tipo;

    public RAM(String nome, double preco, int capacidade, String tipo) {
        super(nome, preco, marca);
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

}
