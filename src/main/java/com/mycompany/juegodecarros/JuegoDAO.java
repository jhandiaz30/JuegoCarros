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

            } catch (SQLException e) {
                System.out.println(e + "no se insertaron los datos a la tabla juego");
            }

        } catch (SQLException e) {
            System.out.println(e + "no se pudo conectar a la db ");
        }

    }  
        public static int  leerJuego() {
        Conexion db_connect = new Conexion();
 int  id_juego=0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT id_juego FROM juego ORDER BY id_juego DESC LIMIT 1";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
           while(rs.next()){
            id_juego=rs.getInt("id_juego");
           }
  
        } catch (SQLException e) {
            System.out.println("no se pudo reoccorer la tabla juego");
        }
        
return id_juego;
    }
}
