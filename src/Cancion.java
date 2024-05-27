import java.time.Duration;

public class Cancion {
    private final String titulo;
    private final Duration duracion;
    private final String artista;

    public Cancion(String titulo, Duration duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public boolean equals(Object cancion) {
        return this.getTitulo() == cancion.getTitulo() ;
    }

    private String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo de la cancion='" + titulo + '\'' +
                "Duracion=" + duracion +
                "Artista='" + artista + '\'';
    }
}
