import java.util.ArrayList;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCancionAAlbumExistente(String albumDestino, Cancion cancionAAgregar) {
        if (obtenerAlbumDeListaPorNombre(albumDestino) != null){
            obtenerAlbumDeListaPorNombre(albumDestino).agregarCancion(cancionAAgregar);
        }

    }

    public Album obtenerAlbumDeListaPorNombre(String nombreAlbum){
        for (Album album : albumes) {
            if (album.getTitulo().equals(nombreAlbum)){
                return album;
            }
        }
        return null;
    }
}
