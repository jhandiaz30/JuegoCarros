/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import static com.mycompany.juegodecarros.JugadoresServices.sc;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jhanm
 */
public class Inicio {

    static Scanner sc = new Scanner(System.in);
        static ArrayList<Conductores> conductores;

    public static void main(String args[]) {
        Conexion conexion = new Conexion();
        System.out.println("¿Cuantos jugadores disputaran la partida?");
        int numeroJugadores = sc.nextInt();
        pedirDatosJugadores(numeroJugadores);
        System.out.println("Muy bien!! Ya fueron creados los jugadores y aaignados un conductor");
        System.out.println("Ahora debes eleigir una pista de juego");
        configuarJuego(numeroJugadores);
    }

    public static void pedirDatosJugadores(int numeroJugadores) {
        int valor = numeroJugadores;
        do {
            valor--;
            System.out.println("Ingresa el nombre");
            Scanner sc2 = new Scanner(System.in);

            String mensaje = sc2.nextLine();
             conductores=ConductoresServices.leerConductor();
            JugadoresServices.crearJugador(mensaje, conductores.get(0).id_conductor);
            System.out.println(numeroJugadores);

        } while (valor > 0);

    }

    public static void configuarJuego(int numeroJugadores) {
       Calendar fecha = new GregorianCalendar();

        int id_pista = PistasServices.leerPistas();
        String date=fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH)+1) + "/" + fecha.get(Calendar.YEAR);
        System.out.println(id_pista);        
        JuegosServices.crearJuego(date,id_pista);
        
        ArrayList <Jugadores> jugadores=JugadoresServices.leerJugadores(numeroJugadores);
        int id_juego=JuegoDAO.leerJuego();
posicion(jugadores,id_juego);
    }

    public static void posicion(ArrayList<Jugadores> jugadores,int id_juego) {
           Random rnd = new Random();
 int carril=1;
        do{
       int randomNumber = rnd.nextInt(jugadores.size());
       Juego_jugadoresServices.crearJuego_jugadores(id_juego, jugadores.get(randomNumber).id_jugador, carril);
carril++;
jugadores.remove(randomNumber);
}
while(jugadores.size()>0);

    }
    

}
