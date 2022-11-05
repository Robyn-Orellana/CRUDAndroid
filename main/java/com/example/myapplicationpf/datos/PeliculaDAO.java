package com.example.myapplicationpf.datos;

import com.example.myapplicationpf.dominio.PeliculaDTO;

import java.sql.SQLException;
import java.util.List;

public interface PeliculaDAO {
    public List<PeliculaDTO> Select() throws SQLException;
    public int Insert(PeliculaDTO pelicula) throws SQLException;
    public int Update(PeliculaDTO pelicula) throws SQLException;
    public int Delete(PeliculaDTO pelicula) throws SQLException;
}
