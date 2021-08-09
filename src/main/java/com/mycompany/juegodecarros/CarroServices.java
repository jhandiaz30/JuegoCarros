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
     public static ArrayList<Carro> leerCarros(int id_carro){
        ArrayList<Carro>carro=new ArrayList<Carro>();
        carro=CarroDAO.leerCarro(id_carro);
       
return carro;
    }  
}
