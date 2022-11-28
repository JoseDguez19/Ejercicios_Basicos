/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx
 */
public class NumerosIguales {
    
    public static void main(String [] args){
    
          int n, n2, n3;
          Scanner numero = new Scanner(System.in);
          
         System.out.println("INGRESE EL PRIMER NÚMERO: ");
            n = numero.nextInt();
         System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
            n2= numero.nextInt();
         System.out.println("INGRESE  EL TERCER NÚMERO: ");
            n3= numero.nextInt();
         if(n2 + n3 == n){ //INICIO N
             System.out.println("SON IGUALES.");
            } //FIN N
         if(n + n3 ==n2){ //INICIO N2
             System.out.println("SON IGUALES.");
            } //FIN N2
         if(n + n2 ==n3){ //INICIO N3
             System.out.println("SON IGUALES.");
         } //FIN N3  
         else{ //INICIO ELSE
             System.out.println("NO SON IGUALES.");
         } //FIN ELSE
         
    }
}
