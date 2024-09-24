import java.util.ArrayList;
import java.util.Objects;

public class Playlist {

    private String nome;
    private String criador;
    private String albuns;
    private ArrayList<String> playlists = new ArrayList<>();

    public ArrayList<String> getPlaylists() {
        playlists.add("Músicas");
        playlists.add("Podcasts");
        playlists.add("Playlist");
        return null;
    }

    public Playlist() {
    }

    public Playlist(String nome, String criador, String albuns, ArrayList<String> playlists) {
        this.nome = nome;
        this.criador = criador;
        this.albuns = albuns;
        this.playlists = playlists;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getAlbuns() {
        return albuns;
    }

    public void setAlbuns(String albuns) {
        this.albuns = albuns;
    }

    public void setPlaylists(ArrayList<String> playlists) {
        this.playlists = playlists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(nome, playlist.nome) && Objects.equals(criador, playlist.criador) && Objects.equals(albuns, playlist.albuns) && Objects.equals(playlists, playlist.playlists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, criador, albuns, playlists);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", criador='" + criador + '\'' +
                ", albuns='" + albuns + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
