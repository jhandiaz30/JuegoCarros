/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jhanm
 */
public class ConductoresServices {
 static Scanner sc = new Scanner(System.in);
    
 public static ArrayList<Conductores> leerConductores(String nombre ){
        ArrayList<Conductores>ma=new ArrayList<Conductores>();
        ma=ConductorDAO.leerConductoresDb();
        System.out.println("Escoge un conductor "+nombre);
        ArrayList<Conductores>conductor=new ArrayList<Conductores>();

        for (int i=0;i<ma.size();i++) {
         System.out.println(i+1+" "+ma.get(i).nombre);
     }
          int seleccion=  sc.nextInt();
          System.out.println(nombre+" tu has escogido el "+ma.get(seleccion-1).nombre);

          conductor.add(new Conductores(ma.get(seleccion-1).id_conductor,ma.get(seleccion-1).nombre,ma.get(seleccion-1).vecesGanadas,ma.get(seleccion-1).id_carro));
return conductor;
    }
 
 
 public static ArrayList<Conductores> leerConductor(int id_Conductor){
           ArrayList<Conductores>conductor=new ArrayList<Conductores>();
         conductor=ConductorDAO.leerConductorDb(id_Conductor);
       
return conductor;
 }
   public static void actualizarConductor(int id_conductor, int id_vecesganadas){
        Conductores conductor = new Conductores();
       conductor.setId_conductor(id_conductor);
       conductor.setVecesGanadas(id_vecesganadas);
       ConductorDAO.ActualizarConductor(conductor);
    }
}
