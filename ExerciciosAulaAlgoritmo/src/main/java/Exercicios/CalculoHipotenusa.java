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
public class CalculoHipotenusa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float base;
        float altura;
        float area;

        System.out.print("\nDigite a Base do Triângulo: ");

        base = input.nextFloat();

        System.out.print("\nDigite a Altura do Triângulo: ");

        altura = input.nextFloat();

        area = (base * altura) / 2;

        double a;
        a = Math.sqrt(base * base + altura * altura);

        System.out.println("\nArea do Triangulo é: " + area);

        System.out.println("\nHipotenusa do Triangulo é: " + a);
    }

}
