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

public class Numero_Positivos {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int i,numero,positivo;
        positivo=0;
        for(i=1;i<=500;i++){
            System.out.println("INGRESE UN NÚMERO CUALQUIERA:");
            numero=teclado.nextInt();
            if(numero>0){
                positivo++;
            }
        }
        System.out.println("LOS NÚMEROS POSITIVOS TOTALES SON: "+positivo);
    }
    
}