/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 *
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx */

public class Salario {
    
    public static void main(String [] args){
    
        float HT, TH, Paga; //HT= HORAS TRABAJADAS TH= TARIFA HORARIA.
    
         Scanner rammstein = new Scanner(System.in);
    
         System.out.println("INTRODUCE LA TARIFA HORARIA: ");
            TH= rammstein.nextFloat();
            
         System.out.println("INTRODUCE LAS HORAS TRABAJADAS: ");
            HT= rammstein.nextFloat();
            
         Paga = (TH * HT);
         
         System.out.println("SU SALARIO ES DE: $" + Paga);
            
    }
}
