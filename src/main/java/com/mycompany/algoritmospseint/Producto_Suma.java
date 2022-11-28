/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

/**
 *
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
public class Producto_Suma {

    public static void main(String[] args) {
        int suma=0;
        long producto=1; 
        for(int x=20;x<=400;x++){
            if(x%2==0){
                suma=suma+x;
                producto=producto*x;
            }
        }
        System.out.println("LA SUMA DE LOS NÚMEROS ES: "+suma);
        System.out.println("EL PRODUCTO DE LOS NÚMEROS ES: "+producto);
 
    }
    
}