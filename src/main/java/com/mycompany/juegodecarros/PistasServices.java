/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegodecarros;

import static com.mycompany.juegodecarros.ConductoresServices.sc;
import java.util.ArrayList;

/**
 *
 * @author jhanm
 */
public class PistasServices {
   
    public static ArrayList<Pistas> leerPistas(){
        ArrayList<Pistas>pista=new ArrayList<Pistas>();
        pista=PistaDAO.leerPistas();
        System.out.println("Escoge una pista");
        for (int i=0;i<pista.size();i++) {
         System.out.println(i+1+" "+pista.get(i).nombre);
     }
        ArrayList<Pistas>pist= new ArrayList<Pistas>();
          int seleccion=  sc.nextInt();
          pist.add(new Pistas(pista.get(seleccion-1).id_pista,pista.get(seleccion-1).nombre,pista.get(seleccion-1).ubicacion,pista.get(seleccion-1).limite_Distancia));
return pist;
    }  
}
