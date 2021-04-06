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
public class ResultadoSomaQuadrados {
    
     public static void main(String[] args) {
	        
		 double a; 
	        double b;
	        double c; 
	        double d;
	        double resultado1;
	        double resultado2;
	        double resultado3;
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("\nPrimeiro Calculo" + "\nDigite a Base: ");
	        a = input.nextDouble();
	        
	        System.out.print("\nPrimeiro Calculo" + "\nDigite o Expoente: ");
	        b = input.nextDouble();
	        
	        System.out.print("\nSegundo Calculo" + "\nDigite a Base: ");
	        c = input.nextDouble();
	        
	        System.out.print("\nSegundo Calculo" + "\nDigite o Expoente: ");
	        d = input.nextDouble();
	        
	        
	      resultado1 = Math.pow (a, b);
	      
	      resultado2 = Math.pow (c, d);
	        
	      resultado3 = resultado1 + resultado2;
	      
	        System.out.println("\nResultado da Primeira Potênciação: " + resultado1);
	        
	        System.out.println("\nResultado da Segunda Potênciação: " + resultado2);
	        
	        System.out.println("\nResultado da Soma dos Quadrados é : " + resultado3);

}
    
}
