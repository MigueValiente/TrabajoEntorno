import java.util.ArrayList;

public class VideoclubOnline {
    ArrayList<Pelicula>peliculas = new ArrayList<Pelicula>();
    String nombre;

    public VideoclubOnline(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pelicula> tituloLargo(){
        ArrayList<Pelicula> pelisConTituloLargo = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (p.getTitulo().length()>10 && p.getTitulo().length()<15){
                pelisConTituloLargo.add(p);
            }
        }
        return pelisConTituloLargo;
    }

    public boolean peliculasIguales(Pelicula p){
        if(this.equals(p))
            return true;
        return false;
    }

    public boolean hayVariedad(){
        ArrayList<Genero> generos = new ArrayList<>();
        for (Pelicula p:peliculas) {
            if (!generos.contains(p.getGenero())){
                generos.add(p.getGenero());
            }
        }
        if (generos.size()>=10)
            return true;
        return false;
    }

    public Pelicula otraPeliDelDirector(Director director){
        return director.otraPelicula();
    }
}
