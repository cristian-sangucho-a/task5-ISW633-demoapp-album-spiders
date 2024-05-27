import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Album> albumes;
    public Usuario(String nombre) {
        this.nombre = nombre;
        albumes = new ArrayList<Album>();
    }

    public void agregarCancionAAlbumExistente(String albumDestino, Cancion cancionAAgregar) {
        int index = obtenerIndexAlbumDeListaPorNombre(albumDestino);
        if (albumes.get(index) == null || albumes.get(index).verificarCancionRepetida(cancionAAgregar)){
            return;
        }
        albumes.get(index).agregarCancion(cancionAAgregar);
        albumes.get(index).setArtista(cancionAAgregar.getArtista());

    }

    public int obtenerIndexAlbumDeListaPorNombre(String nombreAlbum){
        for (int i = 0; i < albumes.size(); i++) {
            if (albumes.get(i).getTitulo().equals(nombreAlbum)){
                return i;
            }
        }
        return -1;
    }

    public void agregarAlbum(Album album) {
        albumes.add(album);
    }

    public void verListaDeCancionesDelAlbum(Album album) {
        album.getCanciones();
    }
}
