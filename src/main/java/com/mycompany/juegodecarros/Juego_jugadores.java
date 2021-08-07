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
public class Juego_jugadores {
   int id_juego_jugadores;
   int id_juego;
   int id_jugador;
   int posicion;

    public int getId_juego_jugadores() {
        return id_juego_jugadores;
    }

    public void setId_juego_jugadores(int id_juego_jugadores) {
        this.id_juego_jugadores = id_juego_jugadores;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Juego_jugadores() {
    }

    public Juego_jugadores(int id_juego_jugadores, int id_juego, int id_jugador, int posicion) {
        this.id_juego_jugadores = id_juego_jugadores;
        this.id_juego = id_juego;
        this.id_jugador = id_jugador;
        this.posicion = posicion;
    }
}


