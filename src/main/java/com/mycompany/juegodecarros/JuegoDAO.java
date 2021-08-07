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
public class JuegoDAO {
   public static void CrearJuego(Juego juego) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO `juego` (`fecha`,`id_pista`) VALUES (?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, juego.getFecha());
                ps.setInt(2, juego.getId_pista());
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
