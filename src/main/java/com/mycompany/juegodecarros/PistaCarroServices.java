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
public class PistaCarroServices {
    public static void crearPista_Carro(int id_carro, int id_pista, int carri){
        Pista_carro  pista_carro = new Pista_carro();
       pista_carro.setId_carro(id_carro);     
       pista_carro.setId_pista(id_pista);     
       pista_carro.setCarril(carri);     

       PistaCarroDAO.CrearPista_carro(pista_carro);
    }
}
