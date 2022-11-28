/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 *
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx 
 */
public class Palabra {
    
    public static void main(String [] args){
    
         Scanner letras = new Scanner(System.in);
         
         String palabra;
       int  nc; //NUMERO DE CARACTERES
       
         System.out.println("INGRESE UNA PALABRA: ");
                palabra = letras.nextLine();
                
          nc = palabra.length();
         System.out.println("EL NUMERO DE CARACTERES ES: " + nc);
    
    }
}
