public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    //Métodos ou Funções
    public void AdicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void RemoverEstoque(int quantidade){
        if(this.quantidade - quantidade < 0)
            System.out.println("Quantidade Insuficiente no Estoque");
        else
            this.quantidade -= this.quantidade;
    }
}
