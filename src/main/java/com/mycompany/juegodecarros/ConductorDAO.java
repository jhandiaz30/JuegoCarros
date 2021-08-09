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
            System.out.println("no se pudo recorrer la tabla conductor");

        }
return ma;
    }
     
      public static void ActualizarConductor(Conductores conductor) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {

                String query = "UPDATE conductores SET vecesGanadas=? WHERE id_conductor=?;";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, conductor.getVecesGanadas());
                ps.setInt(2, conductor.id_conductor);
               

                ps.executeUpdate();

                System.out.println("Tabla actualizada");
            } catch (SQLException e) {
                System.out.println(e + "No se actualizo");
            }

        } catch (SQLException e) {
            System.out.println(e + "No se pudo conectat a la db");
        }
      }

     public static ArrayList<Conductores>  leerConductorDb(int id_conductor) {
        Conexion db_connect = new Conexion();

ArrayList<Conductores>ma=new ArrayList<Conductores>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM conductores WHERE id_conductor=?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1,id_conductor);
            rs = ps.executeQuery();

           while(rs.next()){
        ma.add(new Conductores(rs.getInt("id_conductor"),rs.getString("nombre"),rs.getInt("vecesGanadas"),rs.getInt("id_carro")));
       
           }
        } catch (SQLException e) {
            System.out.println("no se pudieron reoccorer los conductores");

            System.out.println(e + "no se conectó a la db");
        }
return ma;
    }  
}
