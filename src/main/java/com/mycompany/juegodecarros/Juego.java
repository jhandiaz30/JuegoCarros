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
public class Juego {
    int id_juego;
    String fecha;
    int id_pista;

    public Juego(int id_juego, String fecha, int id_pista) {
        this.id_juego = id_juego;
        this.fecha = fecha;
        this.id_pista = id_pista;
    }

    public Juego() {
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_pista() {
        return id_pista;
    }

    public void setId_pista(int id_pista) {
        this.id_pista = id_pista;
    }
    
}
