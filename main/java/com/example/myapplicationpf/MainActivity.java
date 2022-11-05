package com.example.myapplicationpf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationpf.datos.UsuarioDAOJDBC;
import com.example.myapplicationpf.dominio.UsuarioDTO;

import java.sql.SQLException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtUser;
    EditText txtPassword;
    Button btnAceptar;

    public void limpiar(){
        txtUser.setText("");
        txtPassword.setText("");
    }
    public void insertar() {
        UsuarioDAOJDBC usuarioJdbc = new UsuarioDAOJDBC();
        UsuarioDTO usuario = new UsuarioDTO();

        txtUser = findViewById(R.id.txtUser);
        txtPassword = findViewById(R.id.txtPass);

        try {
            usuario.setUser(String.valueOf(txtUser.getText()));
            usuario.setPassword(String.valueOf(txtPassword.getText()));
            usuarioJdbc.Insert(usuario);

            if (usuarioJdbc.Insert(usuario)==1){
                Toast.makeText(MainActivity.this, "Insertado Correctamente " , Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Hay un problema maje " , Toast.LENGTH_SHORT).show();
            }

        } catch (SQLException e) {
            Toast.makeText(MainActivity.this, "hay un error "+e , Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAceptar = findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                insertar();

            }
        });
    }
}