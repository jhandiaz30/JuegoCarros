/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jhanm
 */
public class Juego_jugadorDAO {
    public static void CrearJuego_jugador(Juego_jugadores juego) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO `juego_jugadores` (`id_juego`,`id_jugador`,`posicion`) VALUES (?, ?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, juego.getId_juego());
                ps.setInt(2, juego.getId_jugador());
                ps.setInt(3, juego.getPosicion());

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println("No se pudo insertar los datos a la tabla juego_jugadores");
            }

        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la db");
        }

    }
    
      public static void ActualizarJuego_jugador(Juego_jugadores juego) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "UPDATE juego_jugadores SET posicion=? WHERE id_juego=? AND id_jugador=?;";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, juego.getPosicion());
                ps.setInt(2, juego.getId_juego());
                ps.setInt(3, juego.getId_jugador());

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e + "No se actualizo");
            }

        } catch (SQLException e) {
            System.out.println(e + "No se pudo conectat a la db");
        }

    }
}

