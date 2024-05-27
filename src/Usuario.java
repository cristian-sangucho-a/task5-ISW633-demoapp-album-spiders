import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Album> albumes;
    public Usuario(String nombre) {
        this.name = nombre;
        albumes = new Arraylist<Album>();

    }

    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
}
