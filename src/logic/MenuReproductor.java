package logic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuReproductor {
    Biblioteca biblioteca = new Biblioteca();

    public void ejecutarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.printf("BIENVENIDO \n" +
                    "1. Agregar un nuevo album \n" +
                    "2. Agregar una cancion a un album \n" +
                    "3. Ver las canciones que tiene un album \n" +
                    "4. Buscar un album por anio \n" +
                    "5. Salir \n" +
                    "Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Ingrese el titulo del album: \n");
                    sc.nextLine();  // Consumir la nueva linea
                    String titulo = sc.nextLine();
                    System.out.printf("Ingrese el anio de lanzamiento del album: \n");
                    String anioLanzamiento = sc.nextLine();
                    System.out.printf("Ingrese el nombre de la disquera: \n");
                    String disquera = sc.nextLine();
                    Album albumNuevo = new Album(titulo, anioLanzamiento, disquera, new String[]{""});
                    biblioteca.agregarAlbum(albumNuevo);
                    System.out.println("album agregado exitosamente.");
                    break;
                case 2:
                    System.out.printf("==========ALBUMES DISPONIBLES=========== \n");
                    biblioteca.getAlbumesEnumerados(biblioteca.getAlbumes());
                    System.out.println("Escribe el titulo de un album al que quieras agregar una cancion:");
                    sc.nextLine();
                    String tituloAlbum = sc.nextLine();
                    System.out.println("Nombre de la cancion:");
                    String nombreCancion = sc.nextLine();
                    System.out.printf("Introduce los minutos de duracion: ");
                    int minutos = sc.nextInt();
                    System.out.printf("Introduce los segundos adicionales de duracion: ");
                    int segundos = sc.nextInt();
                    System.out.printf("Artista de la cancion: ");
                    sc.nextLine();
                    String artista = sc.nextLine();
                    Cancion cancionNueva = new Cancion(nombreCancion, Duration.ofMinutes(minutos).plusSeconds(segundos), artista);
                    biblioteca.agregarCancionAAlbumExistente(tituloAlbum, cancionNueva);
                    System.out.println("logic.Cancion agregada exitosamente.");
                    break;
                case 3:
                    ArrayList<Album> albumes = biblioteca.getAlbumes();
                    biblioteca.getAlbumesEnumerados(albumes);
                    System.out.printf("Escoge el numero del album desplegado para ver sus canciones (ejemplo: 0): ");
                    int index = sc.nextInt();
                    System.out.println(biblioteca.verListaDeCancionesDelAlbum(albumes.get(index).getTitulo()));;
                    break;
                case 4:
                    System.out.printf("Introduce el anio a buscar: ");
                    sc.nextLine();
                    String anio = sc.nextLine();
                    System.out.println(biblioteca.buscarAlbumesPorAnio(anio));;
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
