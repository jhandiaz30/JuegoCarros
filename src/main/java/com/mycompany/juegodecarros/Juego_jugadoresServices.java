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
public class Juego_jugadoresServices {
      public static void crearJuego_jugadores(int id_juego, int id_jugador, int posicion){
        Juego_jugadores juego = new Juego_jugadores();
       juego.setId_juego(id_juego);
       juego.setId_jugador(id_jugador);
       juego.setPosicion(posicion);
       Juego_jugadorDAO.CrearJuego_jugador(juego);
    }
       public static void actualizarJuego_jugadores(int id_juego, int id_jugador, int posicion){
        Juego_jugadores juego = new Juego_jugadores();
       juego.setId_juego(id_juego);
       juego.setId_jugador(id_jugador);
       juego.setPosicion(posicion);
       Juego_jugadorDAO.ActualizarJuego_jugador(juego);
    }

}
