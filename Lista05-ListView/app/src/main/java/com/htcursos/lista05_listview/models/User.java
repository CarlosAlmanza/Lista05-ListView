package com.htcursos.lista05_listview.models;

/**
 * Created by carlos on 03/11/2016.
 */

public class User {

    private String nome ;
    private String cargo ;

    public User(){}

    public User(String nome , String cargo){
        this.nome = nome ;
        this.cargo = cargo ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
