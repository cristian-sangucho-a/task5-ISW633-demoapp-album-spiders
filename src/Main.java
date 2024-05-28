import java.time.Duration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioTest = new Usuario("Nombre de prueba");
        //Album album = new Album("album1", "2000", "disquera1", new String[]{""});
        Cancion cancion = new Cancion("pompas de jabon", Duration.ofMinutes(5).plusSeconds(30), "Ricardo Arjona");

        //usuarioTest.agregarAlbum(album);
        //usuarioTest.agregarCancionAAlbumExistente("album1", "pompas de jabon", Duration.ofMinutes(5).plusSeconds(30), "Ricardo Arjona");

        //usuarioTest.verListaDeCancionesDelAlbum("album1");
        //System.out.println(usuarioTest.buscarAlbumesPorAnio("2000"));;

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("BIENVENIDO \n" +
                    "1. Agregar un nuevo álbum \n" +
                    "2. Agregar una canción a un álbum \n" +
                    "3. Ver las canciones que tiene un álbum \n" +
                    "4. Buscar un álbum por año \n" +
                    "5. Salir \n" +
                    "Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Ingrese el titulo del album: \n");
                    sc.nextLine();  // Consumir la nueva línea
                    String titulo = sc.nextLine();
                    System.out.printf("Ingrese el año de lanzamiento del álbum: \n");
                    String anioLanzamiento = sc.nextLine();
                    System.out.printf("Ingrese el nombre de la disquera: \n");
                    String disquera = sc.nextLine();
                    Album albumNuevo = new Album(titulo, anioLanzamiento, disquera, new String[]{""});
                    usuarioTest.agregarAlbum(albumNuevo);
                    System.out.println("Álbum agregado exitosamente.");
                    break;
                case 2:
                    System.out.printf("==========ALBUMES DISPONIBLES=========== \n");
                    usuarioTest.mostrarAlbumes();
                    System.out.println("Escribe el título de un álbum al que quieras agregar una canción:");
                    sc.nextLine();  // Consumir la nueva línea
                    String tituloAlbum = sc.nextLine();
                    System.out.println("Nombre de la canción:");
                    String nombreCancion = sc.nextLine();
                    System.out.printf("Duración en minutos: ");
                    int minutos = sc.nextInt();
                    System.out.printf("Duración en segundos: ");
                    int segundos = sc.nextInt();
                    System.out.printf("Artista de la canción: ");
                    sc.nextLine();  // Consumir la nueva línea
                    String artista = sc.nextLine();
                    Cancion cancionNueva = new Cancion(nombreCancion, Duration.ofMinutes(minutos).plusSeconds(segundos), artista);
                    usuarioTest.agregarCancionAAlbumExistente(tituloAlbum, cancionNueva);
                    System.out.println("Canción agregada exitosamente.");
                    break;
                case 3:
                    // Lógica para ver las canciones que tiene un álbum
                    break;
                case 4:
                    // Lógica para buscar un álbum por año
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

    }
}

