public class ProdutoFisico extends Produto {
    private double peso;
    private Dimensao dimensao;

    public ProdutoFisico() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    public ProdutoFisico(String nome, double preco, String descricao, int quantidade, double peso, Dimensao dimensao) {
        super(nome, preco, descricao, quantidade);
        this.peso = peso;
        this.dimensao = dimensao;


    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
