/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class testess {
    
    public static void main(String[] args) {
        
        
        
        int a;
        int b;
        int soma;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite Primeiro Fator: ");
        a = input.nextInt();
        
        System.out.print("Digite Segundo Fator : ");
        b = input.nextInt();
        
        soma = a * b;
        
        System.out.println("O Produto é: " + soma);
        
    }
    
}

