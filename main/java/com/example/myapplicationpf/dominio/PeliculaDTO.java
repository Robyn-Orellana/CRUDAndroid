package com.example.myapplicationpf.dominio;

public class PeliculaDTO {
    private int ID_pelicula;
    private String Nombre_p;
    private int F_produccion;
    private int calificacion_p;

    @Override
    public String toString() {
        return "PeliculaDTO{" +
                "ID_pelicula=" + ID_pelicula +
                ", Nombre_p='" + Nombre_p + '\'' +
                ", F_produccion=" + F_produccion +
                ", calificacion_p=" + calificacion_p +
                '}';
    }

    public PeliculaDTO(int ID_pelicula, String Nombre_p, int F_produccion, int calificacion_p) {
        this.ID_pelicula = ID_pelicula;
        this.Nombre_p = Nombre_p;
        this.F_produccion = F_produccion;
        this.calificacion_p = calificacion_p;
    }

    public PeliculaDTO() {
    }

    public int getCalificacion_p() {
        return calificacion_p;
    }

    public void setCalificacion_p(int calificacion_p) {
        this.calificacion_p = calificacion_p;
    }

    public int getF_produccion() {
        return F_produccion;
    }

    public void setF_produccion(int f_produccion) {
        F_produccion = f_produccion;
    }

    public String getNombre_p() {
        return Nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        Nombre_p = nombre_p;
    }

    public int getID_pelicula() {
        return ID_pelicula;
    }

    public void setID_pelicula(int ID_pelicula) {
        this.ID_pelicula = ID_pelicula;
    }
}
