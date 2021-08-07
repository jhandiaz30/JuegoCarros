/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

/**
 *
 * @author jhanm
 */
public class Pistas {
    int id_pista;
    String nombre;
    String ubicacion;
    int limite_Distancia;

    public Pistas(int id_pista, String nombre, String ubicacion, int limite_Distancia) {
        this.id_pista = id_pista;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.limite_Distancia = limite_Distancia;
    }

    public Pistas() {
    }

    public int getId_pista() {
        return id_pista;
    }

    public void setId_pista(int id_pista) {
        this.id_pista = id_pista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getLimite_Distancia() {
        return limite_Distancia;
    }

    public void setLimite_Distancia(int limite_Distancia) {
        this.limite_Distancia = limite_Distancia;
    }

}
