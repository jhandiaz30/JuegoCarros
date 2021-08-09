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
public class PistaCarroDAO {
     public static void CrearPista_carro(Pista_carro pista_carro) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "INSERT INTO `pista_carro` (`id_carro`,`id_pista`,`carril`) VALUES (?, ?, ?);";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, pista_carro.getId_carro());
                ps.setInt(2, pista_carro.getId_pista());
                ps.setInt(3, pista_carro.getCarril());

                ps.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e + "no se subieron los datos a la tabla pista carro");
            }

        } catch (SQLException e) {
            System.out.println(e + "No se pudo conectar a la tabla pista");
        }

    }  
}
