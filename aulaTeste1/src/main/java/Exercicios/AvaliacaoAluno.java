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
public class AvaliacaoAluno {
    
    public static void main(String[] args) {
        
		
		float n1, n2, n3, media;
		int faltas;
		String nomeAluno;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*--* Calcular Média *--*");
		System.out.println("Nome: ");
		nomeAluno = entrada.next();
		
		System.out.println("N1: ");
		n1 = entrada.nextFloat();
		
		System.out.println("N2: ");
		n2 = entrada.nextFloat();
		
		System.out.println("N3: ");
		n3 = entrada.nextFloat();
		
		System.out.println("Quantidade Faltas: ");
		faltas = entrada.nextInt();
		
		media = (n1 + n2 + n3)/ 3;
		
		if ((media >= 6 ) && (faltas <= 18)) {
			System.out.println(nomeAluno + "\nEsta APROVADO \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
			
			}
		
		else if ((media >= 6) && (faltas > 18)) {
			System.out.println(nomeAluno + "\nEsta REPROVADO Por Faltas \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
		}
		
		else if ((media < 6) && (faltas < 18)) {
			System.out.println(nomeAluno + "\nEsta REPROVADO Por Nota \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
		}
			else {
			System.out.println(nomeAluno + "\nEsta REPROVADO por Falta e Média \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
		}
	}

	}


    
   


