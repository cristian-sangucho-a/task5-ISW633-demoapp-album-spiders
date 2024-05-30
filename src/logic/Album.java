package logic;

import java.util.ArrayList;

/**
 * Esta clase representa a un logic.Album que tiene una lista de canciones y artistas.
 */
public class Album {
    private String titulo;
    private String anioDeanzamiento;
    private String disquera;
    private ArrayList<String> artistas;
    private ArrayList<Cancion> canciones;
    /**
     * Constructor para la clase logic.Album.
     * @param titulo El titulo del album.
     * @param anioDeanzamiento El anio de lanzamiento del album.
     * @param disquera La disquera que publico el album.
     * @param artistas Los artistas que contribuyeron al album.
     */
    public Album(String titulo, String anioDeanzamiento, String disquera, String[] artistas) {
        this.titulo = titulo;
        this.anioDeanzamiento = anioDeanzamiento;
        this.disquera = disquera;
        this.artistas = new ArrayList<String>();
        canciones = new ArrayList<Cancion>();
    }
    /**
     * Agrega una cancion a la lista de canciones del album.
     * @param cancionAAgregar La cancion a agregar.
     */
    public void agregarCancion(Cancion cancionAAgregar){
        canciones.add(cancionAAgregar);
    }
    /**
     * Verifica si una cancion ya existe en la lista de canciones del album.
     * @param cancionAAgregar La cancion a verificar.
     * @return true si la cancion ya existe, false en caso contrario.
     */
    public boolean verificarCancionRepetida(Cancion cancionAAgregar) {
        if (estaCancionYaExiste(cancionAAgregar)) {
            return false;
        }
        return true;
    }
    /**
     * Verifica si una cancion ya existe en la lista de canciones del album.
     * @param cancionAAgregar La cancion a verificar.
     * @return true si la cancion ya existe, false en caso contrario.
     */
    private boolean estaCancionYaExiste(Cancion cancionAAgregar) {
        for (Cancion cancion : canciones) {
            if (cancion.equals(cancionAAgregar)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioDeanzamiento() {
        return anioDeanzamiento;
    }

    public void setArtista(String artista) {
        artistas.add(artista);
    }

    @Override
    public String toString() {
        return "| Titulo del album: " + titulo + "| anio: " + anioDeanzamiento + "| disquera: " + disquera + "| artistas: " + artistas + "\n| canciones: " + canciones +" |\n";
    }
}
