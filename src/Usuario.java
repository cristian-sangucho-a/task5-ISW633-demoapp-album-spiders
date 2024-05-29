import java.time.Duration;
import java.util.ArrayList;
/**
 * Esta clase representa a un Usuario que tiene una lista de álbumes.
 */
public class Usuario {

    private String nombre;
    private ArrayList<Album> albumes;
    /**
     * Constructor para la clase Usuario.
     * @param nombre El nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        albumes = new ArrayList<Album>();
    }

    /**
     * Agrega un álbum a la lista de álbumes del usuario.
     * @param album El álbum a agregar.
     */
    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
    /**
     * Agrega una canción a un álbum existente en la lista de álbumes del usuario.
     * @param albumDestino El nombre del álbum al que se agregará la canción.
     * @param cancionAAgregar La canción a agregar.
     */
    public void agregarCancionAAlbumExistente(String albumDestino, Cancion cancionAAgregar) {
        int index = obtenerIndexAlbumDeListaPorNombre(albumDestino);
        if (albumes.isEmpty() || albumes.get(index).verificarCancionRepetida(cancionAAgregar)){
            return;
        }
        albumes.get(index).agregarCancion(cancionAAgregar);
        albumes.get(index).setArtista(cancionAAgregar.getArtista());

    }

    /**
     * Obtiene el índice de un álbum en la lista de álbumes del usuario por su nombre.
     * @param nombreAlbum El nombre del álbum.
     * @return El índice del álbum en la lista, o -1 si no se encuentra el álbum.
     */
    public int obtenerIndexAlbumDeListaPorNombre(String nombreAlbum){
        for (int i = 0; i < albumes.size(); i++) {
            if (albumes.get(i).getTitulo().equals(nombreAlbum)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Busca álbumes en la lista de álbumes del usuario por su año de lanzamiento.
     * @param anio El año de lanzamiento de los álbumes a buscar.
     * @return Una lista de álbumes que coinciden con el año de lanzamiento proporcionado.
     */
    public ArrayList<Album> buscarAlbumesPorAnio(String anio) {
        ArrayList<Album> resultadoBusquedaPorAnio = new ArrayList<Album>();
        for (Album album: albumes){
            if (album.getAnioDeanzamiento().equals(anio)) {
                resultadoBusquedaPorAnio.add(album);
            }
        }
        return resultadoBusquedaPorAnio;
    }
    /**
     * Obtiene la lista de canciones de un álbum en la lista de álbumes del usuario.
     * @param titulo El título del álbum.
     * @return La lista de canciones del álbum.
     */
    public ArrayList<Cancion> verListaDeCancionesDelAlbum(String titulo) {
        return albumes.get(obtenerIndexAlbumDeListaPorNombre(titulo)).getCanciones();
    }
    /**
     * Obtiene la lista de álbumes del usuario.
     * @return La lista de álbumes del usuario.
     */
    public ArrayList<Album> getAlbumes(){
        return albumes;
    }
}


