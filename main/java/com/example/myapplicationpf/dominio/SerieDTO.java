package com.example.myapplicationpf.dominio;

public class SerieDTO {
    private int ID_series;
    private String Nombre_s;
    private int Temporadas;
    private int Calificacion_s;

    @Override
    public String toString() {
        return "SerieDTO{" +
                "ID_series=" + ID_series +
                ", Nombre_s='" + Nombre_s + '\'' +
                ", Temporadas=" + Temporadas +
                ", Calificacion_s=" + Calificacion_s +
                '}';
    }

    public SerieDTO() {
    }

    public SerieDTO(int ID_series, String Nombre_s, int Temporadas, int Calificacion_s) {
        this.ID_series = ID_series;
        this.Nombre_s = Nombre_s;
        this.Temporadas = Temporadas;
        this.Calificacion_s = Calificacion_s;
    }

    public int getCalificacion_s() {
        return Calificacion_s;
    }

    public void setCalificacion_s(int calificacion_s) {
        Calificacion_s = calificacion_s;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public String getNombre_s() {
        return Nombre_s;
    }

    public void setNombre_s(String nombre_s) {
        Nombre_s = nombre_s;
    }

    public int getID_series() {
        return ID_series;
    }

    public void setID_series(int ID_series) {
        this.ID_series = ID_series;
    }
}
