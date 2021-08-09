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
            connection = DriverManager.getConnection("jdbc:mysql://bvjtlo88h8kkvkposd0q-mysql.services.clever-cloud.com:3306/bvjtlo88h8kkvkposd0q", "uwinyytfybah2i1e", "CL2LF3fEY2O5PIvPH8Ew");

        } catch (SQLException e) {

            System.out.println(e);
        }
        return connection;
    }
}
