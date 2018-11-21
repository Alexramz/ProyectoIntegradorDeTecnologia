/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.servicios.ICRUD;
import com.utileria.Computadora;
import java.util.LinkedList;

/**
 *
 * @author alexr
 */
public class ServiciosCompu implements ICRUD {
LinkedList<Computadora> listaDeCompus = new LinkedList();
    
        @Override
        public boolean agregar(Computadora compu) {
    
            return listaDeCompus.add(compu);
        
    }
         @Override
         public LinkedList leer() {
            return listaDeCompus;
    }
    
    
}
