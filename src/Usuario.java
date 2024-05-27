public class Usuario {
    private String nombre;
    private ArrayList<Album> albumes;
    public Usuario(String nombre) {
        this.nombre = nombre;
        albumes = new Arraylist<Album>();
    }

    public void agregarCancionAAlbumExistente(String albumDestino, Cancion cancionAAgregar) {
        if (obtenerAlbumDeListaPorNombre(albumDestino) != null){
            obtenerAlbumDeListaPorNombre(albumDestino).agregarCancion(cancionAAgregar);
        }

    }

    public Album obtenerAlbumDeListaPorNombre(String nombreAlbum){
        for (Album album : albumes) {
            if (album.getTitulo().equals(nombreAlbum)){
                return album;
            }
        }
        return null;
    }

    public void agregarAlbum(Album album) {
        albumes.add(album);
    }
}
