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
public class ValoresAceitosValoresNAceitos {

    public static void main(String[] args) {

        int a, b, c, d;

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigitar Valor de A: ");

        a = input.nextInt();

        System.out.print("\nDigitar Valor de B: ");

        b = input.nextInt();

        System.out.print("\nDigitar Valor de C: ");

        c = input.nextInt();

        System.out.print("\nDigitar Valor de D: ");

        d = input.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores Aceitos");
        } else {
            System.out.println("Valores Não Aceitos");
        }
    }
}
