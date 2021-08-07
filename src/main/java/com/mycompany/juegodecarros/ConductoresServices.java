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
    
 public static ArrayList<Conductores> leerConductor(){
        ArrayList<Conductores>ma=new ArrayList<Conductores>();
        ma=ConductorDAO.leerConductoresDb();
        System.out.println("Escoge un conductor");
        ArrayList<Conductores>conductor=new ArrayList<Conductores>();

        for (int i=0;i<ma.size();i++) {
         System.out.println(i+1+" "+ma.get(i).nombre);
     }
          int seleccion=  sc.nextInt();
          conductor.add(new Conductores(ma.get(seleccion-1).id_conductor,ma.get(seleccion-1).nombre,ma.get(seleccion-1).vecesGanadas,ma.get(seleccion-1).id_carro));
return conductor;
    }   
}
