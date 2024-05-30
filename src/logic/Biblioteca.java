package logic;

import java.util.ArrayList;
/**
 * Esta clase representa a un logic.Biblioteca que tiene una lista de albumes.
 */
public class Biblioteca {
    private ArrayList<Album> albumes;
    /**
     * Constructor para la clase logic.Biblioteca.
     */
    public Biblioteca() {
        albumes = new ArrayList<Album>();
    }

    /**
     * Agrega un album a la lista de albumes de la biblioteca perteneciente al usuario que ejecute la aplicacion.
     * @param album El album a agregar.
     */
    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
    /**
     * Agrega una cancion a un album existente en la lista de albumes de la biblioteca perteneciente al usuario que ejecute la aplicacion.
     * @param tituloAlbumDestino El nombre del album al que se agregara la cancion.
     * @param cancionAAgregar La cancion a agregar.
     */
    public void agregarCancionAAlbumExistente(String tituloAlbumDestino, Cancion cancionAAgregar) {
        int index = obtenerIndexAlbumDeListaPorNombre(tituloAlbumDestino);
        if (albumes.isEmpty() || albumes.get(index).verificarCancionRepetida(cancionAAgregar)){
            return;
        }
        albumes.get(index).agregarCancion(cancionAAgregar);
        albumes.get(index).setArtista(cancionAAgregar.getArtista());
    }

    /**
     * Obtiene el indice de un album en la lista de albumes de la biblioteca del usuario del sistema por su nombre.
     * @param tituloAlbum El nombre del album.
     * @return El indice del album en la lista, o -1 si no se encuentra el album.
     */
    public int obtenerIndexAlbumDeListaPorNombre(String tituloAlbum){
        for (int i = 0; i < albumes.size(); i++) {
            if (albumes.get(i).getTitulo().equals(tituloAlbum)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Busca albumes en la lista de albumes de la biblioteca del usuario de la aplicacion por su anio de lanzamiento.
     * @param anio El anio de lanzamiento de los albumes a buscar.
     * @return Una lista de albumes que coinciden con el anio de lanzamiento proporcionado.
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
     * Obtiene la lista de canciones de un album en la lista de albumes de la biblioteca perteneciente al usuario que ejecute la aplicacion.
     * @param tituloAlbum El tituloAlbum del album.
     * @return La lista de canciones del album.
     */
    public ArrayList<Cancion> verListaDeCancionesDelAlbum(String tituloAlbum) {
        return albumes.get(obtenerIndexAlbumDeListaPorNombre(tituloAlbum)).getCanciones();
    }
    /**
     * Obtiene la lista de albumes de la biblioteca que es del usuario del sistema.
     * @return La lista de albumes de la biblioteca que es del usuario del sistema.
     */
    public ArrayList<Album> getAlbumes(){
        return albumes;
    }

    public void getAlbumesEnumerados(ArrayList<Album> albumes) {
        for (int i = 0; i < albumes.size(); i++) {
            System.out.println( i +"."+ albumes.get(i));
        }
    }
}


