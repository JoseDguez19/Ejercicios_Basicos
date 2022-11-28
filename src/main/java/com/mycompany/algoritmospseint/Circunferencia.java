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
public class Circunferencia {
    
    public static void main(String [] args){
    
         int r;
         float C;
         
         Scanner circulo = new Scanner(System.in);
    
         System.out.println("INGRESE EL VALOR DEL RADIO: ");
            r= circulo.nextInt();
            
         C= (float) (3.1416 * r * r);
         
         System.out.println("LA CIRUNFERENCIA ES DE: " + C);
         
         
         
    }
}
