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
                ps.setInt(2, juego.getPosicion());

                ps.executeUpdate();

                System.out.println("Mensaje Creado");
            } catch (SQLException e) {
                System.out.println(e + "hola");
            }

        } catch (SQLException e) {
            System.out.println(e + "hola");
        }

    }           
}

