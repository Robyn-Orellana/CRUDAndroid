package com.example.myapplicationpf.datos;

import com.example.myapplicationpf.dominio.UsuarioDTO;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    public List<UsuarioDTO> Select() throws SQLException;
    public int Insert(UsuarioDTO usuario) throws SQLException;
    public int Update(UsuarioDTO usuario) throws SQLException;
    public int Delete(UsuarioDTO usuario) throws SQLException;
}
