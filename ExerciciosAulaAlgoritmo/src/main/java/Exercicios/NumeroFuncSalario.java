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
public class NumeroFuncSalario {
    
    public static void main(String[] args) {
        
        double codfunc;
        double valorHora;
        double horasTrabalhadas;
        double valorMes;
        
        Scanner entrada = new Scanner(System.in);
        
       
         System.out.print("Informe Seu Código Funcionario: ");

		codfunc = entrada.nextDouble();
        
        System.out.print("Informe o valor que você ganha a hora: ");

		valorHora = entrada.nextDouble();
		
		System.out.println("Informe as horas trabalhadas no mês");
		
		horasTrabalhadas = entrada.nextDouble();
		
		 valorMes = (valorHora * horasTrabalhadas);
		 
		 System.out.println("O valor do salário no mês é de " + valorMes + "\nCódigo Funcionário: " + codfunc);
    }
    
}
