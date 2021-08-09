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
public class CarroDAO {
    public static ArrayList<Carro>  leerCarro(int id_carro) {
        Conexion db_connect = new Conexion();

ArrayList<Carro>carro=new ArrayList<Carro>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM carro where id_carro=?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, id_carro);

           rs = ps.executeQuery();

           while(rs.next()){
        carro.add(new Carro(rs.getInt("id_carro"),rs.getString("nombre"),rs.getString("color")));
       
           }
        } catch (SQLException e) {
            System.out.println("no se pudieron reoccorer la tabla carro");
           
        }
return carro;
    }
}
