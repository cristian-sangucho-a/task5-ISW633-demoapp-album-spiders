import java.util.ArrayList;

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

    public String getTitulo() {
        return titulo;
    }

    public String[] getArtistas() {
        return artistas;
    }

    public String getDisquera() {
        return disquera;
    }

    public String getAnioDeanzamiento() {
        return anioDeanzamiento;
    }
}
