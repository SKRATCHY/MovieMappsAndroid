package moviemapps.gr12.compumovil.udea.edu.co.moviemapps.model;

/**
 * Created by Camila on 11/04/2016.
 */
public class Pelicula {
    public String nombre;
    public String duracion;
    public String genero;
    public String poster;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
