/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

/**
 * @author JOSE DOMINGUEZ 226Z0175; ap550120@gmail.com
 */
import java.util.Scanner;

public class Ticket_Tienda {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float precio,tot, net;
        int cantidad;
        System.out.println("¿Cuantos articulos desea comprar?");
        cantidad=teclado.nextInt();
        System.out.println("Ingrese el precio del articulo: $");
        precio=teclado.nextFloat();
        tot=precio*cantidad;
        net=(float) (tot+(tot*.15));
        if(net>=1000){
            net=(float)(net-(net*.05));
            System.out.println("El costo del producto es: "+precio);
            System.out.println("Cantidad de productos: "+cantidad);
            System.out.println("El subtotal es: "+tot);
            System.out.println("Se aplica 15% de IVA");
            System.out.println("El precio bruto es de: "+net);
        }
        else{
            System.out.println("El costo del producto es: "+precio);
            System.out.println("Cantidad de productos: "+cantidad);
            System.out.println("El subtotal es: "+tot);
            System.out.println("Se aplica 15% de IVA");
            System.out.println("El precio bruto es de: "+net);
        }
    }
    
}