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
public class Pista_carro {
    int id_pistacarro;
    int id_carro;
    int id_pista;
    int carril;

    public Pista_carro(int id_pistacarro, int id_carro, int id_pista, int carril) {
        this.id_pistacarro = id_pistacarro;
        this.id_carro = id_carro;
        this.id_pista = id_pista;
        this.carril = carril;
    }

    public Pista_carro() {
    }

    public int getId_pistacarro() {
        return id_pistacarro;
    }

    public void setId_pistacarro(int id_pistacarro) {
        this.id_pistacarro = id_pistacarro;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public int getId_pista() {
        return id_pista;
    }

    public void setId_pista(int id_pista) {
        this.id_pista = id_pista;
    }

    public int getCarril() {
        return carril;
    }

    public void setCarril(int carril) {
        this.carril = carril;
    }
}
