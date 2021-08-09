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
public class PistaDAO {
    public static ArrayList<Pistas>  leerPistas() {
        Conexion db_connect = new Conexion();

ArrayList<Pistas>pista=new ArrayList<Pistas>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM pista";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

           while(rs.next()){
        pista.add(new Pistas(rs.getInt("id_pista"),rs.getString("nombre"),rs.getString("ubicacion"),rs.getInt("limite_distancia")));
       
           }
        } catch (SQLException e) {
            System.out.println("no se pudo recorrer la tabla pista");

            System.out.println(e + "No se conecto a la db");
        }
return pista;
    }

}
