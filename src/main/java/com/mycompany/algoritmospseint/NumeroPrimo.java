/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx
 */
public class NumeroPrimo {
    
    public static void main(String [] args){
    
        int CAM, CM, n, i; //CAM= cantidad a mostrar, CM = cantidad mostrados,
          boolean primo;
          Scanner numero = new Scanner(System.in); 
          System.out.println("¿CUANTOS NÚMEROS PRIMOS QUIERES SABER? ");
                CAM = numero.nextInt();
         System.out.println("1: 2");
         CM= 1;
         n= 3;
         while(CM< CAM){
             primo= true;
             for(i=3;  i<=Math.sqrt(n); i+=2){
                    if(n%i==0){
                        primo= false;
                        }    
             }
                        if(primo){                       
                            CM= CM+1;
                            System.out.println(":" + n);
                        }
            n= n+2;         
       }
    
    }
}
