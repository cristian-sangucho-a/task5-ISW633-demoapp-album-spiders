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

    public boolean equals(Cancion cancion) {
        return this.getTitulo().equals(cancion.getTitulo()) ;
    }

    private String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Cancion= { Titulo de la cancion: " + titulo + "| Duracion=" + duracion + "| Artista=" + artista + " }";
    }
}
