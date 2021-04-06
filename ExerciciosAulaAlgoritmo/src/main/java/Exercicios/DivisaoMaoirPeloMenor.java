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
public class DivisaoMaoirPeloMenor {

    public static void main(String[] args) {

        float a;
        float b;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite Abaixo Valores para Divisão: ");

        System.out.print("\nDigite Valor para Número A: ");

        a = input.nextInt();

        System.out.print("\nDigite Valor para Número B: ");

        b = input.nextInt();

        if (a > b) {
            System.out.println("\nResultado Divisão: " + (a / b));
        } else {
            System.out.println("\nResultado Divisão: " + (b / a));
        }
    }
}
