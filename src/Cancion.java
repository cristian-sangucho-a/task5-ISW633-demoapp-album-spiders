import java.time.Duration;

/**
 * Esta clase representa a una Cancion con un título, duración y artista.
 */
public class Cancion {
    private final String titulo;
    private final Duration duracion;
    private final String artista;

    /**
     * Constructor para la clase Cancion.
     * @param titulo El título de la canción.
     * @param duracion La duración de la canción.
     * @param artista El artista de la canción.
     */
    public Cancion(String titulo, Duration duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    /**
     * Compara esta canción con otra canción.
     * @param cancion La canción a comparar.
     * @return true si los títulos de las canciones son iguales, false en caso contrario.
     */
    public boolean equals(Cancion cancion) {
        return this.getTitulo().equals(cancion.getTitulo()) ;
    }

    private String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "| Titulo de la cancion: " + titulo + "| Duracion=" + duracion + "| Artista=" + artista + "\n";
    }
}
