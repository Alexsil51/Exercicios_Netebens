/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40_aluno_para_aluno;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        retangulo();
        
    
    }
    
    
    
    public static void retangulo(){
        
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo, areaTotal = 0;
        
        System.out.println("Informe a Base do Retângulo: ");
    base =  input.nextDouble();
    System.out.println("Informe a Altura do Retângulo: ");
    altura =  input.nextDouble();
    areaRetangulo = base * altura;
    System.out.println("A àrea do Retângulo é " + areaRetangulo);
    areaTotal += areaRetangulo;
    }
}


