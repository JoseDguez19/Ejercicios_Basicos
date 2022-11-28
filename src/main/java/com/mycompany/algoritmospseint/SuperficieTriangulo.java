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
public class SuperficieTriangulo {
    
    public static void main(String [] args){
    
         float A, B, H;
         
          Scanner key = new Scanner(System.in);
    
         System.out.println("INGRESE LA BASE DEL TRIANGULO: ");
                B= key.nextInt();
    
         System.out.println("INGRESE LA ALTURA DEK TRIANGULO: ");
                H= key.nextInt();
                
                A= (B*H)/2;
                
          System.out.println("LA SUPERFICIE DEL TRIANGULO ES: " + A + " CM");
    }
}
