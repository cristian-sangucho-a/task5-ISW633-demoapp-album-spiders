import java.util.ArrayList;
import java.util.Arrays;

public class Album {
    private String titulo;
    private  String anioDeanzamiento;
    private final String disquera;
    private final String[] artistas;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, String anioDeanzamiento, String disquera, String[] artistas) {
        this.titulo = titulo;
        this.anioDeanzamiento = anioDeanzamiento;
        this.disquera = disquera;
        this.artistas = artistas;
    }


    public void agregarCancion(Cancion cancionAAgregar){
        canciones.add(cancionAAgregar);
    }


    public boolean verificarCancionRepetida(Cancion cancionAAgregar) {
        if (estaCancionYaExiste(cancionAAgregar)) {
            return false;
        }
        return true;
    }
    /*
    * Este método comprueba la existencia de una canción en un album
    *
    * */
    private boolean estaCancionYaExiste(Cancion cancionAAgregar) {
        for (Cancion cancion : canciones) {
            if (cancion.equals(cancionAAgregar)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Album[ titulo: " + titulo + "| anioDeanzamiento: " + anioDeanzamiento + "| disquera: " + disquera + "| artistas: " + Arrays.toString(artistas) + "| canciones: " + canciones +" ]";
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
        artistas[artista.length() - 1] = artista;
    }
}
