import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioTest = new Usuario("Pepepicapapas");
        Album album = new Album("album1", "2000", "disquera1", new String[]{""});
        Cancion cancion = new Cancion("pompas de jabon", Duration.ofMinutes(5).plusSeconds(30), "Ricardo Arjona");

        usuarioTest.agregarAlbum(album);
        usuarioTest.agregarCancionAAlbumExistente("album1", cancion);
        usuarioTest.
    }
}

