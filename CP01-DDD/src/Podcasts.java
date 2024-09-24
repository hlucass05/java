import java.util.Objects;

public class Podcasts {
    private String titulo;
    private String apresentador;
    private String descricao;
    private Double duracao;
    private Double numeroEP;

    public Podcasts() {
    }

    public Podcasts(String titulo, String apresentador, String descricao, Double duracao, Double numeroEP) {
        this.titulo = titulo;
        this.apresentador = apresentador;
        this.descricao = descricao;
        this.duracao = duracao;
        this.numeroEP = numeroEP;
    }

    public static String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Double getNumeroEP() {
        return numeroEP;
    }

    public void setNumeroEP(Double numeroEP) {
        this.numeroEP = numeroEP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Podcasts podcasts = (Podcasts) o;
        return Objects.equals(titulo, podcasts.titulo) && Objects.equals(apresentador, podcasts.apresentador) && Objects.equals(descricao, podcasts.descricao) && Objects.equals(duracao, podcasts.duracao) && Objects.equals(numeroEP, podcasts.numeroEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, apresentador, descricao, duracao, numeroEP);
    }

    @Override
    public String toString() {
        return "Podcasts{" +
                "titulo='" + titulo + '\'' +
                ", apresentador='" + apresentador + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", numeroEP=" + numeroEP +
                '}';
    }
}
