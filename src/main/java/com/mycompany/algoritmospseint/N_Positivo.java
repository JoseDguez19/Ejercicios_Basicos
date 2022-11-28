/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

/**
 *
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
import java.util.Scanner;

public class N_Positivo{

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int N=1,c=1,Mayor = 0;
        while (N!=(-99)){
            System.out.println("INGRESA EL PRIMER DIGITO: ");
            N=teclado.nextInt();
            if(N!=1){
                if(c==1){
                    Mayor=N;
                    c=2;
                }
                if(N>Mayor){
                    Mayor=N;
                }
                if(N<0){
                    System.out.println("EL NEGATIVO ES: " +N);
                }
            }
        }
        System.out.println("EL NÚMERO MAYOR ES: "+Mayor);
    }
    
}