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
public class ImprimeMaiorNumero {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int menor = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nA Seguir Digite Uma Sequência de Três Números");

        System.out.print("\nDigite Valor para Número A: ");

        a = input.nextInt();

        System.out.print("\nDigite Valor para Número B: ");

        b = input.nextInt();

        System.out.print("\nDigite Valor para Número C: ");

        c = input.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("\nPrimeiro Valor Digitado A é o Maoir Valor: ");
        } else if ((b > a) && (b > c)) {
            System.out.println("\nSegundo Valor Digitado B é o Maoir Valor: ");
        } else if ((c > a) && (c > b)) {
            System.out.println("\nTerceiro Valor Digitado C é o Maoir Valor: ");
        } else {
            System.out.println("\nValor Digitado não Atende Obrigado");
        }

    }
}
