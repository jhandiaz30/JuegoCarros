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
public class CarroServices {
     public static int leerCarros(){
        ArrayList<Carro>carro=new ArrayList<Carro>();
        carro=CarroDAO.leerCarro(0);
        System.out.println("Escoge una pista");
        for (int i=0;i<pista.size();i++) {
         System.out.println(i+1+" "+pista.get(i).nombre);
     }
          int seleccion=  sc.nextInt();
return pista.get(seleccion-1).id_pista;
    }  
}
