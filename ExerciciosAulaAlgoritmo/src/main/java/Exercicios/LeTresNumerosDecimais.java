/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class LeTresNumerosDecimais {
    
    
    public static void main(String[] args) {
        
        
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("\nDigite Abaixo Valores de: A " + "\nDigite Valores de: B" + "\nDigite Valores de: C");
         
         
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double pi = 3.14159;
        double triangulo = (A * C) / 2;
        double raio = pi * (C * C);
        double trapezio = (A + B) / 2 *  C;
        double quadrado = (B * B);
        double retangulo = (A * B);
        double perimetro = (A * B) * 4;
        
        System.out.printf("\nAREA TRIANGULO RETANGULO: %.3f\n", triangulo);
        System.out.printf("\nAREA DO CIRCULO: %.3f\n", raio);
        System.out.printf("\nAREA TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("\nAREA QUADRADO: %.3f\n", quadrado);
        System.out.printf("\nAREA RETANGULO: %.3f\n", retangulo);
         System.out.printf("\nPERIMETRO RETANGULO: %.3f\n", perimetro);
    }
}
