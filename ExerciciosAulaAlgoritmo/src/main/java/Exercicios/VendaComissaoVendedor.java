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
public class VendaComissaoVendedor {
    
    public static void main(String[] args) {
        
        
               String nomeVendedor;
		double salario;
		double totalVendas;
		double comissao;
                double salariototal;
               
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme Nome Vendedor: ");
		nomeVendedor = entrada.next();
		
		System.out.print("\nInforme Salario Vendedor: ");
		salario = entrada.nextDouble();
		
                System.out.print("\nInforme Total Vendas Efetuadas: ");
		totalVendas = entrada.nextDouble();
                
		
		
		comissao = (totalVendas * 15) / 100;
                
                salariototal = salario + comissao;
		
		System.out.println("\nVendedor " + nomeVendedor + "\nTotal a Receber: " + salariototal);
    }
    
}
