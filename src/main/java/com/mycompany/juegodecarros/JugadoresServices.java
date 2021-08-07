/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import static com.mycompany.juegodecarros.ConductoresServices.sc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jhanm
 */
public class JugadoresServices {
     static Scanner sc = new Scanner(System.in);

    public static void crearJugador(String nombre, int id_conductor){
        Jugadores registro = new Jugadores();
       registro.setNombre(nombre);
       registro.setId_condu(id_conductor);
       JugadorDAO.CrearJugador(registro);
    }
    
        public static ArrayList<Jugadores> leerJugadores(int numeroDeJugadores){
        ArrayList<Jugadores>jugador=new ArrayList<Jugadores>();
        jugador=JugadorDAO.leerJugadores(numeroDeJugadores);
        for (int i=0;i<jugador.size();i++) {
         System.out.println(i+1+" "+jugador.get(i).nombre);
     }
return jugador;
    }  
}
