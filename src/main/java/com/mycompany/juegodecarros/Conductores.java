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
public class Conductores {

 int id_conductor;
 String nombre;
 int vecesGanadas;
 int id_carro;

    public Conductores(int id_conductor, String nombre, int vecesGanadas, int id_carro) {
        this.id_conductor = id_conductor;
        this.nombre = nombre;
        this.vecesGanadas = vecesGanadas;
        this.id_carro = id_carro;
    }

    public Conductores() {
    }

   

    

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVecesGanadas() {
        return vecesGanadas;
    }

    public void setVecesGanadas(int vecesGanadas) {
        this.vecesGanadas = vecesGanadas;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }
 
 
}
