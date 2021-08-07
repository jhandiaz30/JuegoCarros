/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jhanm
 */
public class JugadorDAO {
   public static void CrearJugador(Jugadores jugador) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO `jugadores` (`nombre`,`id_condu`) VALUES (?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, jugador.getNombre());
                ps.setInt(2, jugador.getId_condu());
                ps.executeUpdate();

                System.out.println("Mensaje Creado");
            } catch (SQLException e) {
                System.out.println(e + "hola");
            }

        } catch (SQLException e) {
            System.out.println(e + "hola");
        }

    } 
   
     public static ArrayList<Jugadores>  leerJugadores(int numeroJugadores) {
        Conexion db_connect = new Conexion();

ArrayList<Jugadores>ma=new ArrayList<Jugadores>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM jugadores ORDER BY id_jugador DESC LIMIT ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,numeroJugadores);
            rs = ps.executeQuery();

            

           while(rs.next()){
        ma.add(new Jugadores(rs.getInt("id_jugador"),rs.getString("nombre"),rs.getInt("id_condu")));
           }
        } catch (SQLException e) {
            System.out.println("no se pudo recorrer en la tabla jugadores");
            System.out.println(e + "hola");
        }
return ma;
    }

}
