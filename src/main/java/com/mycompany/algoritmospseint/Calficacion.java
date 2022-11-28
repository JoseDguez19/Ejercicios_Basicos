/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmospseint;

/**
 *
 * @author 226Z0175; José Domínguez; 226Z01756@alvarado.tecmn.mx 
 */
import java.util.Scanner;
public class Calficacion {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int i,NA,Cal,P,suma; //NA= numero de alumnos, Cal= calificación, P= promedio
        System.out.println("Ingresa la cantidad de alumnos: ");
        NA=teclado.nextInt();
        i=1;
        suma=0;
        while(i<=NA){
            System.out.println("Ingrese la calificacion del alumno (0 A 100): ");
            Cal=teclado.nextInt();
            suma=(suma+Cal);
            i++;
        }
       P=(suma/NA);
        System.out.println("El promedio de las calificaciones es: " +P);
    }
    
}