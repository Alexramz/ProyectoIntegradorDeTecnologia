/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;

import com.servicios.ServiciosCompu;
import com.utileria.Computadora;
import java.util.*;

/**
 *
 * @author alexr
 */
public class Principal {
    //SCANER
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        menu();
    }

    private static void menu() {
        boolean bandera=true;
 
        ServiciosCompu servicios = new ServiciosCompu();
        System.out.println("BIENVENIDO A TECNOLOGIA INEGRADORA");
        do{
            System.out.println("--Ingresa la opcion deseada-- \n 1) Añadir computadoras \n 2) Revisar la lista \n 3) Modificar la lsita \n 4) Eliminar \n 5) Salir");
            int opcion=scanInt.nextInt();
            switch(opcion)
            {
                //Create
                case 1:
                    Computadora compu = pedirDatosAUsuario();
                    boolean exito = servicios.agregar(compu);
                    if(exito)
                    {
                        System.out.println("Se agrego con exito");
                    }
                    else
                    {
                        System.out.println("No se agrego!");
                    }
                    break;
                case 2:
                   LinkedList listaDeCompus =  servicios.leer();
                   imprimir(listaDeCompus);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                
                default:
                    System.out.println("--Saliste del programa--"); 
                    bandera=!bandera;
                    break;
            }
        }
        while(bandera);
    }

    private static Computadora pedirDatosAUsuario() {
        
        System.out.println("Ingrese el No.Serie");
        String noSerie=scanStr.nextLine();
        System.out.println("Ingrese el año");
        String anio=scanStr.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo=scanStr.nextLine();
        System.out.println("Ingrese el Procesador");
        String procesador=scanStr.nextLine();
        System.out.println("Ingrese la ram");
        String ram=scanStr.nextLine();
        
        Computadora compu = new Computadora(noSerie, anio, modelo, procesador, ram);
        return compu;
    }

    private static void imprimir(LinkedList<Computadora> listaDeCompus) {
        for(Computadora compu: listaDeCompus)
        {
            System.out.println(compu.toString());
            
        }
        System.out.println("Hola xd");
        }
    }
    

