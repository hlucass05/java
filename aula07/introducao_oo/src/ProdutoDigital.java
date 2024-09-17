import java.util.Objects;

public class ProdutoDigital extends Produto {
    private String linkDowload;
    private String formatoArquivo;

//PRIMEIRO COLOCAR CONSTRUTOR VAZIO
    public ProdutoDigital() {
    }

   //DEPOIS COLOCAR CONSTUTORES CHEIO COM A CLASSE PAI
    public ProdutoDigital(String nome, double preco, String descricao, int quantidade, String linkDowload, String formatoArquivo) {
        super(nome, preco, descricao, quantidade);
        this.linkDowload = linkDowload;
        this.formatoArquivo = formatoArquivo;
    }

    //GETTER AND SETTERS - SELECIONAR TODOS
    public String getLinkDowload() {
        return linkDowload;
    }

    public void setLinkDowload(String linkDowload) {
        this.linkDowload = linkDowload;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    //EQUALLS - NEXT NEXT NEXT
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoDigital that = (ProdutoDigital) o;
        return Objects.equals(getLinkDowload(), that.getLinkDowload()) && Objects.equals(getFormatoArquivo(), that.getFormatoArquivo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLinkDowload(), getFormatoArquivo());
    }

    //TO STRING - OK
    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "linkDowload='" + linkDowload + '\'' +
                ", formatoArquivo='" + formatoArquivo + '\'' +
                '}';
    }
}
