/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jhanm
 */
public class Conexion {
     public Connection get_connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/juegodecarros", "root", "");
                       System.out.println("si");

        } catch (SQLException e) {

            System.out.println(e);
        }
        return connection;
    }
}
