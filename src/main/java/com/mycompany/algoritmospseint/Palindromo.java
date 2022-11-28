/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

import java.util.Scanner;
public class Palindromo {    
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);      
        int a, b, p;
        String palabra= in.next();        
        b= palabra.length();
        a= 1;
        p= 0;
            while(a<b){
                    if(!palabra.substring(a, a+1).equals(palabra.substring(b, b+1))){   
                            p = p +1;
                        }
                a= a+1;
                b=b-1;
                }
       if(p==0)       
           System.out.println("SI");
        else           
                    System.out.println("NO");
    }
}