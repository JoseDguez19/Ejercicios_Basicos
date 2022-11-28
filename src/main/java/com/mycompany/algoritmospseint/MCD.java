/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;
import java.util.Scanner;
/**
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx
 */
public class MCD {
    public static void main(String [] args){
    
    Scanner lectura = new Scanner(System.in);
    
    int A, B, X, Maximo;
        System.out.println("INGRESE EL PRIMER NÚMERO: ");
            A = lectura.nextInt();
        System.out.println("INGRESE EL SEGUNDO NÚMERO: ");
            B = lectura.nextInt();   
         if(A>0 & B>0){             
                Maximo = 1;
                 X = 1;
             while(X <= A){             
                if(A % X==0 & B % X==0){
                        
                        if(X> Maximo){                        
                        Maximo = X;
                            }      
                }
                X= X + 1;     
                }
                //X= X + 1;
                System.out.println("EL MAXIMO COMÚN (cmd) ES:  " + Maximo);
         }   
         else{
             System.out.println("INGRESA VALORES MAS ALTOS QUE  0.");
         }
    }
}
