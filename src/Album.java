import java.util.ArrayList;
import java.util.Arrays;

public class Album {
    private String titulo;
    private  String anioDeanzamiento;
    private  String disquera;
    private ArrayList<String> artistas;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, String anioDeanzamiento, String disquera, String[] artistas) {
        this.titulo = titulo;
        this.anioDeanzamiento = anioDeanzamiento;
        this.disquera = disquera;
        this.artistas = new ArrayList<String>();
        canciones = new ArrayList<Cancion>();
    }

    public void agregarCancion(Cancion cancionAAgregar){
        canciones.add(cancionAAgregar);
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

    public boolean verificarCancionRepetida(Cancion cancionAAgregar) {
        if (estaCancionYaExiste(cancionAAgregar)) {
            return false;
        }
        return true;
    }

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

    @Override
    public String toString() {
        return "Album[ titulo: " + titulo + "| año: " + anioDeanzamiento + "| disquera: " + disquera + "| artistas: " + artistas + "| canciones: " + canciones +" ]\n";
    }
}
