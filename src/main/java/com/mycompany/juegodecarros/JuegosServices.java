/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhanm
 */
public class JuegosServices {

    public static void crearJuego(String fecha, int id_Pista){
        Juego juego = new Juego();
       juego.setFecha(fecha);
       juego.setId_pista(id_Pista);
       JuegoDAO.CrearJuego(juego);
    }
    
    
        
}
