/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40_aluno_para_aluno;



/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class deAluno_para_aluno38 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor da base");
        double base = input.nextDouble();
        
         System.out.println("Informe o valor da altura");
        double altura = input.nextDouble();
        
 double areaRetangulo = retangulo(base,altura);
 
 System.out.println(areaRetangulo);
    
 }
 public static double retangulo(double base, double altura){
        
        
     
    return base * altura;
    
}
}


