/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmospseint;

import java.util.Scanner;
/**
 *
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
public class Operaciones_Basicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N, N2, S, R, M; //S= SUMA, R= RESTA, M= MULTIPLICACIÓN
        double D; //D= DIVISIÓN
        
        System.out.println("INGRESE EL PRIMER NÚMERO: ");
            N= entrada.nextInt();
            
          System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
            N2 = entrada.nextInt();
            
            S = N + N2;
            R = N - N2;
            M = N * N2;
            D = N / N2;
            
            System.out.println("EL RESULTADO DE LA SUMA ES: " + S);
            System.out.println("EL RESULTADO DE LA RESTA ES: " + R);
            System.out.println("EL RESULTADO DE LA MUTIPLICACIÓN ES: " + M);
            System.out.println("EL RESULTADO DE LA DIVISIÓN ES: " + D);
         
    }
}
