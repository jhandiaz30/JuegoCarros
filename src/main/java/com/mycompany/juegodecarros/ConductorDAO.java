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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jhanm
 */
public class ConductorDAO {
    
     public static ArrayList<Conductores>  leerConductoresDb() {
        Conexion db_connect = new Conexion();

ArrayList<Conductores>ma=new ArrayList<Conductores>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM conductores";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

           while(rs.next()){
        ma.add(new Conductores(rs.getInt("id_conductor"),rs.getString("nombre"),rs.getInt("vecesGanadas"),rs.getInt("id_carro")));
       
           }
        } catch (SQLException e) {
            System.out.println("no se pudieron reoccorer los mensajes");

            System.out.println(e + "hola");
        }
return ma;
    }
}
