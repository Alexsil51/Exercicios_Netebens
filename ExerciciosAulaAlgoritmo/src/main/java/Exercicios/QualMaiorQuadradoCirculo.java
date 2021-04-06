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
public class QualMaiorQuadradoCirculo {

    public static void main(String[] args) {

        double ladoQua;
        double raioCir;
        double areaQuadrado;
        double areaCirculo;

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite Valor para Lado Quadrado: ");

        ladoQua = input.nextFloat();

        System.out.print("\nDigite Valor para Raio de Um Circulo: ");

        raioCir = input.nextFloat();

        areaQuadrado = ladoQua * ladoQua;

        areaCirculo = (Math.PI * (raioCir * raioCir));

        if (areaQuadrado > areaCirculo) {
            System.out.println("\nÀrea do Quadrado é Maior que Àrea do Circulo");
        } else {
            System.out.println("\nÀrea do Circulo é Maior que Àrea do Quadrado");
        }
    }
}
