package com.example.myapplicationpf.datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class conexion extends SQLiteOpenHelper{

    private final String CRATE_TABLE = "CREATE TABLE usuarios (\n" +
            "\tID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"user\" TEXT(40),\n" +
            "\tpassword TEXT(30)\n" +
            ");";
    private final String CREATE_TABLE2 = "CREATE TABLE series (\n" +
            "\tID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\tnombre_s TEXT(70),\n" +
            "\ttemporadas INTEGER,\n" +
            "\tcalificacion_s INTEGER\n" +
            ");";
    private final String CREATE_TABLE3 = "CREATE TABLE peliculas (\n" +
            "\tID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\tnombre_p TEXT(50),\n" +
            "\tf_produccion INTEGER,\n" +
            "\tcalificacion INTEGER\n" +
            ");";

    private static final String DB_name = "PF.sqlite";
    private static final int DB_Version = 1;

    public conexion(Context context) {
        super(context, DB_name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CRATE_TABLE);
        db.execSQL(CREATE_TABLE2);
        db.execSQL(CREATE_TABLE3);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(CREATE_TABLE2);
        db.execSQL(CREATE_TABLE3);
        onCreate(db);
    }
}
