/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx
 */
public class NumeroMayor {
    
    public static void main(String [] args){
    
        int N, N2, N3, N4;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE EL PRIMER NÚMERO: ");
            N = teclado.nextInt();           
        System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
            N2= teclado.nextInt();        
        System.out.println("INGRESE EL TERCER NÚMERO: ");
            N3= teclado.nextInt();       
        System.out.println("INGRESE EL CUARTO NÚMERO: ");
            N4= teclado.nextInt();       
                     if(N>N2 & N>N3 & N>N4 ){ //INICIO N        
            System.out.println("EL NÚMERO MAYOR ES: " + N);
                      } //FIN  N                    
           if(N2>N & N2>N3 & N2>N4){ //INICIO N2           
               System.out.println("EL NÚMERO MAYOR ES: " + N2);
             } //FIN N2          
                        if(N3>N & N3>N2 & N3>N4){ //INICIO N3                        
                            System.out.println("EL NÚMERO MAYOR ES: " + N3);
                        } //FIN N3   
            if(N4>N & N4>N2 & N4>N3){ //INICO N4
                System.out.println("EL NÚMERO MAYOR ES: " + N4);
            } //FIN N4   
    } //FIN MAIN
} //FIN CLASS
