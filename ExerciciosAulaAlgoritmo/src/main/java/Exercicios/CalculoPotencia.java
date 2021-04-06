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
public class CalculoPotencia {
    
    public static void main(String[] args) {
        
        double a; 
        double b;
        double c; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a Base: ");
        a = input.nextDouble();
        
        System.out.print("Digite o Expoente: ");
        b = input.nextDouble();
        
      c = Math.pow (a, b);
        
        System.out.println("Resultado da Potênciação: " + c);
}
}

