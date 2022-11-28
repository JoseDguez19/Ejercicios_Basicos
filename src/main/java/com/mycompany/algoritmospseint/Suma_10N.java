/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;
/**
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
import java.util.Scanner;

public class Suma_10N {

    public static void main(String[] args) {
        double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,suma;
        Scanner teclado= new Scanner(System.in);
        System.out.println("INGRESA EL NÚMERO UNO: ");
            n1=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO DOS: ");
            n2=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO TRES: ");
            n3=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO CUATRO: ");
            n4=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO CINCO: ");
            n5=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO SEIS: ");
            n6=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO SIETE: ");
            n7=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO OCHO: ");
            n8=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO NUEVE: ");
            n9=teclado.nextDouble();
         System.out.println("INGRESA EL NÚMERO DIEZ: ");
            n10=teclado.nextDouble();
            
        suma=(n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
        System.out.println("EL RESULTADO DE LA SUMA DE LOS DIEZ NÚMEROS ES: "+suma);
    }
    
}