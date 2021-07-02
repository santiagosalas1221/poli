package com.nube.poli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int contraseña;
    private int usuario;
    private int IdDispositivo;
    private String TokenPush;

    public User(int contraseña, int usuario, int idDispositivo, String tokenPush) {
        this.contraseña = contraseña;
        this.usuario = usuario;
        IdDispositivo = idDispositivo;
        TokenPush = tokenPush;
    }

    public User() {
        super();
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getIdDispositivo() {
        return IdDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        IdDispositivo = idDispositivo;
    }

    public String getTokenPush() {
        return TokenPush;
    }

    public void setTokenPush(String tokenPush) {
        TokenPush = tokenPush;
    }

    @Override
    public String toString() {
        return "User{" +
                "contraseña=" + contraseña +
                ", usuario=" + usuario +
                ", IdDispositivo=" + IdDispositivo +
                ", TokenPush='" + TokenPush + '\'' +
                '}';
    }
}
