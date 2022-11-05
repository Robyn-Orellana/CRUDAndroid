package com.example.myapplicationpf.datos;

import com.example.myapplicationpf.dominio.SerieDTO;

import java.sql.SQLException;
import java.util.List;

public interface SerieDAO {
    public List<SerieDTO> Select() throws SQLException;
    public int Insert(SerieDTO serie) throws SQLException;
    public int Update(SerieDTO serie) throws SQLException;
    public int Delete(SerieDTO serie) throws SQLException;
}
