package com.example.myapplicationpf.dominio;

public class UsuarioDTO {

    private int ID_usuario;
    private String User;
    private String Password;

    public UsuarioDTO(int ID_usuario, String User, String Password) {
        this.ID_usuario = ID_usuario;
        this.User = User;
        this.Password = Password;
    }

    public UsuarioDTO() {
    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "ID_usuario=" + ID_usuario +
                ", User='" + User + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
