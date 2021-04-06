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
public class MediaAritmetica4Notas {
    
    
    public static void main(String[] args) {
        
        
        double n1;
		double n2;
                double n3;
                double n4;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme a Primeira Nota: ");
		n1 = entrada.nextInt();
		
		System.out.print("\nInforme a Segunda Nota: ");
		n2 = entrada.nextInt();
		
                System.out.print("\nInforme a Segunda Nota: ");
		n3 = entrada.nextInt();
                
                System.out.print("\nInforme a Segunda Nota: ");
		n4 = entrada.nextInt();
		media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >=5)
		{
			System.out.println("\nA Média do Aluno è: " + media + "\nAluno Aprovado");
			
		}
		else
		{
			System.out.println("\nA Média do Aluno è: " + media + "\nAluno Reprovado");
		}
    }
}
