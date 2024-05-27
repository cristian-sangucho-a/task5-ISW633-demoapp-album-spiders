public class Album {
    private String titulo;
    private  String anioDeanzamiento;
    private final String disquera;
    private final String[] artistas;

    public Album(String titulo, String anioDeanzamiento, String disquera, String[] artistas) {
        this.titulo = titulo;
        this.anioDeanzamiento = anioDeanzamiento;
        this.disquera = disquera;
        this.artistas = artistas;
    }
}
