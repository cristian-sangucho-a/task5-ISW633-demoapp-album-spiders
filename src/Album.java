import java.util.ArrayList;
import java.util.Arrays;
/**
 * Esta clase representa a un Album que tiene una lista de canciones y artistas.
 */
public class Album {
    private String titulo;
    private  String anioDeanzamiento;
    private  String disquera;
    private ArrayList<String> artistas;
    private ArrayList<Cancion> canciones;
    /**
     * Constructor para la clase Album.
     * @param titulo El título del álbum.
     * @param anioDeanzamiento El año de lanzamiento del álbum.
     * @param disquera La disquera que publicó el álbum.
     * @param artistas Los artistas que contribuyeron al álbum.
     */
    public Album(String titulo, String anioDeanzamiento, String disquera, String[] artistas) {
        this.titulo = titulo;
        this.anioDeanzamiento = anioDeanzamiento;
        this.disquera = disquera;
        this.artistas = new ArrayList<String>();
        canciones = new ArrayList<Cancion>();
    }
    /**
     * Agrega una canción a la lista de canciones del álbum.
     * @param cancionAAgregar La canción a agregar.
     */
    public void agregarCancion(Cancion cancionAAgregar){
        canciones.add(cancionAAgregar);
    }
    /**
     * Verifica si una canción ya existe en la lista de canciones del álbum.
     * @param cancionAAgregar La canción a verificar.
     * @return true si la canción ya existe, false en caso contrario.
     */
    public boolean verificarCancionRepetida(Cancion cancionAAgregar) {
        if (estaCancionYaExiste(cancionAAgregar)) {
            return false;
        }
        return true;
    }
    /**
     * Verifica si una canción ya existe en la lista de canciones del álbum.
     * @param cancionAAgregar La canción a verificar.
     * @return true si la canción ya existe, false en caso contrario.
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

    public ArrayList<String> getArtistas() {
        return artistas;
    }

    public String getDisquera() {
        return disquera;
    }

    public String getAnioDeanzamiento() {
        return anioDeanzamiento;
    }

    public void setArtista(String artista) {
        artistas.add(artista);
    }

    @Override
    public String toString() {
        return "| Titulo del album: " + titulo + "| año: " + anioDeanzamiento + "| disquera: " + disquera + "| artistas: " + artistas + "\n| canciones: " + canciones +" |\n";
    }
}
