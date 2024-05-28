import java.time.Duration;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Album> albumes;
    public Usuario(String nombre) {
        this.nombre = nombre;
        albumes = new ArrayList<Album>();
    }

    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
    /*
    * Método para visualizar las canciones que disponemos en un album que ya ha sido creado
    * */

    /*
    * A través del indice del album, haciendo uso del metodo obtenerIndexAlbumDeListaPorNombre(), se agregará una canción.
    * */

    public void agregarCancionAAlbumExistente(String albumDestino, Cancion cancionAAgregar) {
        int index = obtenerIndexAlbumDeListaPorNombre(albumDestino);
        if (albumes.isEmpty() || albumes.get(index).verificarCancionRepetida(cancionAAgregar)){
            return;
        }
        albumes.get(index).agregarCancion(cancionAAgregar);
        albumes.get(index).setArtista(cancionAAgregar.getArtista());

    }

    /*
    * Este método me devuelve el índice de un album existente en la lista de albumes.
    * De esta manera, se garantizza que se está trabajando sobre el mismo objeto creado (album)
    * */
    public int obtenerIndexAlbumDeListaPorNombre(String nombreAlbum){
        for (int i = 0; i < albumes.size(); i++) {
            if (albumes.get(i).getTitulo().equals(nombreAlbum)){
                return i;
            }
        }
        return -1;
    }

    /*
    * Este método presentará los albumes que el usuario haya filtrado según el año escogido.
    * */
    public ArrayList<Album> buscarAlbumesPorAnio(String anio) {
        ArrayList<Album> resultadoBusquedaPorAnio = new ArrayList<Album>();
        for (Album album: albumes){
            if (album.getAnioDeanzamiento().equals(anio)) {
                resultadoBusquedaPorAnio.add(album);
            }
        }
        return resultadoBusquedaPorAnio;
    }

    public ArrayList<Cancion> verListaDeCancionesDelAlbum(String titulo) {
        return albumes.get(obtenerIndexAlbumDeListaPorNombre(titulo)).getCanciones();
    }

    public ArrayList<Album> getAlbumes(){
        return albumes;
    }
}


