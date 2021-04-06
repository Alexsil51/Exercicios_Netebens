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
public class AreaQuadrado {

    public static void main(String[] args) {

        float laterais;
        float area;
        float perimetro;

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a area do Quadrado: ");

        laterais = input.nextFloat();

        area = (laterais * laterais);

        perimetro = (4 * area);

        System.out.println("\nArea do Quadrado Valor de L é: " + area + "Perimetro: " + perimetro);
    }
}
