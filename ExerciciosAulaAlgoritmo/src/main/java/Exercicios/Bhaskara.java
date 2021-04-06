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
public class Bhaskara {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int delta;
        int x1;
        int x2;
        
        Scanner input = new Scanner(System.in);
        
         System.out.print("\nDigite Valor para A: ");

        a = input.nextInt();
        
         System.out.print("\nDigite Valor para B: ");

        b = input.nextInt();
        
         System.out.print("\nDigite Valor para C: ");

        c = input.nextInt();
        
        delta = (b * b) - 4 * a * c;
	if (delta > 0) {
		x1 = (-b + delta ^ (1 / 2)) / (2 * a);
		x2 = (-b - delta ^ (1 / 2)) / (2 * a);
		System.out.println("A equacao possui 2 raizes reais.");
		System.out.println("X1: " + x1 + "\nX2: " + x2);
	} else {

		if (delta == 0) {
			System.out.println("Impossível calcular.");
		} 
                else {
			System.out.println("Delta negativo...Impossível calcular : " + delta);
		}
    
    
}
    }
}
