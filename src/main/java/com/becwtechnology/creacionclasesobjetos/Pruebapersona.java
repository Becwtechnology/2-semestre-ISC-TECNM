/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.becwtechnology.creacionclasesobjetos;

/**
 *
 * @author Becw Technology
 */
public class Pruebapersona {
    public static void main(String[] args){
    
        //Creacion de una variable del objeto Persona
        Persona persona1;
        //instanciando o creando un objeto de la clase persona
        persona1 = new Persona();
        //Accedemos al objeto persona y llamamos al metodo desplegar nombre
        persona1.desplegarNombres();
        //Modificar los valores de los atributos del objeto persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        //Volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        
         //Creacion de una nueva variable del objeto Persona
         
        Persona persona2 = new Persona();
        persona2.nombre = "Becw";
        persona2.apellido = "Technology";
        //Volvemos a imprimir los valores
        System.out.println("");
        persona2.desplegarNombres();
        
    }
            
}
