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

    static ArrayList<Conductores> conductores;
    static ArrayList<Carro> carro;
    static ArrayList<Carro> carrosJugando = new ArrayList<Carro>();
    static ArrayList<jugadoresDistancias> ganadores = new ArrayList<>();

    public static void main(String args[]) {
                Conexion conexion = new Conexion();
Scanner sc = new Scanner (System.in);
     int opcion=0;

do{
      System.out.println("Seleccione una opcón");
      System.out.println("1. Crear carrera");
      System.out.println("2. Consultar las veces ganadas de los Conductores");
     opcion = sc.nextInt();
     if(opcion==1){
         jugar();
     }else if(opcion==2){
         consultarVecesGanadas();
     }else{
    System.out.println("Ingrese una opcion valida");
     }
}
while(opcion!=1 ||opcion!=2);
    }
public static void consultarVecesGanadas(){
    
  conductores = ConductorDAO.leerConductoresDb();
    for (Conductores conductore : conductores) {
        System.out.println("conductor "+conductore.getNombre()+" ha ganado "+conductore.vecesGanadas +" veces");
    }
}

public static void jugar(){
    Scanner sc = new Scanner(System.in);
System.out.println("¿Cuantos jugadores disputaran la partida?");
        int numeroJugadores = sc.nextInt();
        
        pedirDatosJugadores(numeroJugadores);
        System.out.println("Muy bien!! Ya fueron creados los jugadores y aaignados un conductor");
        System.out.println("Ahora debes eleigir una pista de juego");
        configuarJuego(numeroJugadores);
        ganador();
}
    public static void pedirDatosJugadores(int numeroJugadores) {
        int valor = numeroJugadores;
        do {
            valor--;
            System.out.println("Ingresa el nombre");
            Scanner sc2 = new Scanner(System.in);

            String mensaje = sc2.nextLine();
            conductores = ConductoresServices.leerConductores(mensaje);
            JugadoresServices.crearJugador(mensaje, conductores.get(0).id_conductor);
            carro(conductores.get(0).id_carro);

        } while (valor > 0);
    }

    public static void configuarJuego(int numeroJugadores) {
        Calendar fecha = new GregorianCalendar();

        ArrayList<Pistas> pist = PistasServices.leerPistas();
        String date = fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR);
        JuegosServices.crearJuego(date, pist.get(0).id_pista);

        ArrayList<Jugadores> jugadores;
        int id_juego = JuegoDAO.leerJuego();
        jugadores = JugadoresServices.leerJugadores(numeroJugadores);

        posicion(jugadores, id_juego, pist.get(0).id_pista, carrosJugando);
        jugadores = JugadoresServices.leerJugadores(numeroJugadores);
        iniciarJuego(jugadores, pist.get(0).limite_Distancia);

    }

    public static void posicion(ArrayList<Jugadores> jugador, int id_juego, int id_pista, ArrayList<Carro> carrosJugando) {
        Random rnd = new Random();
        int carril = 1;
        do {
            int randomNumber = rnd.nextInt(jugador.size());
            Juego_jugadoresServices.crearJuego_jugadores(id_juego, jugador.get(randomNumber).id_jugador, 0);
            PistaCarroServices.crearPista_Carro(carrosJugando.get(randomNumber).id_carro, id_pista, carril);
            
            System.out.println("En el carril " + carril + " se encuentra " + carrosJugando.get(randomNumber).nombre);
            carril++;
            jugador.remove(randomNumber);
            carrosJugando.remove(randomNumber);
        } while (jugador.size() > 0);

    }

    public static void iniciarJuego(ArrayList<Jugadores> jugador, int kilometros) {
        ArrayList<jugadoresDistancias> jugadoresDistancias = new ArrayList<jugadoresDistancias>();

        for (Jugadores jugado : jugador) {
            jugadoresDistancias.add(new jugadoresDistancias(jugado.getId_jugador(), jugado.getNombre(), jugado.getId_condu(), 0));
        }
        ArrayList<jugadoresDistancias> lista;
        int dista = 0;
        do {
            for (int i = 0; i < jugadoresDistancias.size(); i++) {
                ArrayList<jugadoresDistancias> list = new ArrayList<jugadoresDistancias>();
                list.add(new jugadoresDistancias(jugadoresDistancias.get(i).getId_jugador(), jugadoresDistancias.get(i).getNombre(), jugadoresDistancias.get(i).getId_condu(), jugadoresDistancias.get(i).getDistancia()));
                System.out.println("Lanza el dado " + jugadoresDistancias.get(i).getNombre() + ", pulsa una tecla y dale enter");
                Scanner sc2 = new Scanner(System.in);
                String leer = sc2.nextLine();
                dista = sumaDistancia(list, kilometros);
                System.out.println(jugadoresDistancias.get(i).getNombre() + " Recorriste " + dista +" de "+kilometros*1000);

                jugadoresDistancias.get(i).setDistancia(dista);
                if (jugadoresDistancias.get(i).getDistancia() >= kilometros * 1000) {
                    ganadores.add(new jugadoresDistancias(jugadoresDistancias.get(i).getId_jugador(), jugadoresDistancias.get(i).getNombre(), jugadoresDistancias.get(i).getId_condu(), jugadoresDistancias.get(i).getDistancia()));

                }

            }
            for (int i = jugadoresDistancias.size() - 1; i >= 0; i--) {

                if (jugadoresDistancias.get(i).getDistancia() >= kilometros * 1000) {

                    jugadoresDistancias.remove(jugadoresDistancias.get(i));


                }
            }
        } while (jugadoresDistancias.size() > 0);

        System.out.println("Juego Terminado");
    }

    public static int lanzarDados() {
        int min = 1;
        int max = 5;

        Random random = new Random();

        int valor = random.nextInt(max + min) + min;
        return valor;
    }

    public static int sumaDistancia(ArrayList<jugadoresDistancias> lista, int distancia) {
        Scanner sc = new Scanner(System.in);

        int numero = lanzarDados() * 100;

        return numero + lista.get(0).distancia;

    }

    public static void ganador() {
        int id_juego = JuegoDAO.leerJuego();
        ArrayList<Conductores> conductor = ConductoresServices.leerConductor(ganadores.get(0).getId_condu());
        int id_conductor = conductor.get(0).getId_conductor();
        int veces_ganadas = conductor.get(0).getVecesGanadas() + 1;

        ConductoresServices.actualizarConductor(id_conductor, veces_ganadas);
        for (int i = 0; i < ganadores.size(); i++) {
            System.out.println("en el puesto " + (i + 1) + " se encuentra "+ganadores.get(i).getNombre());
            Juego_jugadoresServices.actualizarJuego_jugadores(id_juego, ganadores.get(i).getId_jugador(), (i + 1));
        }
        conductores.clear();
        carro.clear();
        carrosJugando.clear();
        ganadores.clear();

    }

    public static void carro(int id_carro) {
        carro = CarroServices.leerCarros(id_carro);
        carrosJugando.add(new Carro(carro.get(0).id_carro, carro.get(0).nombre, carro.get(0).color));
    }

}
