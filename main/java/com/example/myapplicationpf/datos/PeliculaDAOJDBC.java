package com.example.myapplicationpf.datos;

import com.example.myapplicationpf.dominio.PeliculaDTO;

import java.sql.SQLException;
import java.util.List;

public class PeliculaDAOJDBC implements PeliculaDAO{
    @Override
    public List<PeliculaDTO> Select() throws SQLException {
        return null;
    }

    @Override
    public int Insert(PeliculaDTO pelicula) throws SQLException {
        return 0;
    }

    @Override
    public int Update(PeliculaDTO pelicula) throws SQLException {
        return 0;
    }

    @Override
    public int Delete(PeliculaDTO pelicula) throws SQLException {
        return 0;
    }
}
