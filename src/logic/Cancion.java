package logic;

import java.time.Duration;

/**
 * Esta clase representa a una logic.Cancion con un titulo, duracion y artista.
 */
public class Cancion {
    private final String titulo;
    private final Duration duracion;
    private final String artista;

    /**
     * Constructor para la clase logic.Cancion.
     * @param titulo El titulo de la cancion.
     * @param duracion La duracion de la cancion.
     * @param artista El artista de la cancion.
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
     * Compara esta cancion con otra cancion.
     * @param cancion La cancion a comparar.
     * @return true si los titulos de las canciones son iguales, false en caso contrario.
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
