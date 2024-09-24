import java.util.Objects;

public class Músicas {
    private String nome;
    private String artista;
    private String album;
    private Double duracao;
    private String genero;

    //adicionei primeiramente o construtor vazio
    public Músicas() {
    }

    //em seguida adicionei o construtor cheio, com todas as classes selecionadas
    public Músicas(String nome, String artista, String album, Double duracao, String genero) {
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
        this.genero = genero;
    }

    //agora selecionei getters and setters com todas as classes selecionadas
    public static String getNome() {
        return getNome();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   //agora equals e hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Músicas músicas = (Músicas) o;
        return Objects.equals(nome, músicas.nome) && Objects.equals(artista, músicas.artista) && Objects.equals(album, músicas.album) && Objects.equals(duracao, músicas.duracao) && Objects.equals(genero, músicas.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, artista, album, duracao, genero);
    }

    //e por fim, o to string
    @Override
    public String toString() {
        return "Músicas{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }
}
