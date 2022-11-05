package com.example.myapplicationpf.datos;

import com.example.myapplicationpf.dominio.SerieDTO;

import java.sql.SQLException;
import java.util.List;

public class SerieDAOJDBC implements SerieDAO{
    @Override
    public List<SerieDTO> Select() throws SQLException {
        return null;
    }

    @Override
    public int Insert(SerieDTO serie) throws SQLException {
        return 0;
    }

    @Override
    public int Update(SerieDTO serie) throws SQLException {
        return 0;
    }

    @Override
    public int Delete(SerieDTO serie) throws SQLException {
        return 0;
    }
}
