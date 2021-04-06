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
public class LeNumeroNegativo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a;
        System.out.print("\nInforme Um valor: ");
        a = entrada.nextInt();

        if (a < 0) {
            System.out.println("\nValor Digitado é Negativo: " + a);
        } else {
            System.out.println("\nValor Digitado Não e Negativo: ");

        }
    }

}
