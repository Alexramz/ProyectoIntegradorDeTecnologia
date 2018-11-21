/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.utileria.Computadora;
import java.util.LinkedList;

/**
 *
 * @author alexr
 */
public interface ICRUD {
    
    public boolean agregar(Computadora compu);
    
    LinkedList leer();
}
