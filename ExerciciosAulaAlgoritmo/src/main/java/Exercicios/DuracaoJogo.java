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
public class DuracaoJogo {
    
    public static void main(String[] args) {
        
        
        int inicio;
        int fim;
        int duracao;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nHorário Início do Jogo: ");

        inicio = input.nextInt();
        
         System.out.print("\nHorário Final do Jogo: ");

        fim = input.nextInt();
        
         duracao = 24 - (24 + inicio - fim) % 24;
         
           if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } 
           else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
      
    }
    
}
