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
public class jugadoresDistancias {
     int id_jugador;
    String nombre;
   
 int id_condu;
    int distancia;

    public jugadoresDistancias(int id_jugador, String nombre, int id_condu, int distancia) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.id_condu = id_condu;
        this.distancia = distancia;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public int getId_condu() {
        return id_condu;
    }

    public void setId_condu(int id_condu) {
        this.id_condu = id_condu;
    }

   

    public jugadoresDistancias() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
}
