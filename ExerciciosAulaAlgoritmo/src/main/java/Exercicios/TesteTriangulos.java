/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class TesteTriangulos {
    
    public static void main(String[] args) {
        
        
        double a,b,c,maior;

 Scanner input = new Scanner(System.in);
 
 
System.out.printf("Digite o valor de A: ");
a=input.nextDouble();

System.out.printf("Digite o valor de B: ");
b=input.nextDouble();

System.out.printf("Digite o valor de C: ");
c=input.nextDouble();



double lados[] = {a,b,c};


for(int i=0;i<lados.length;i++) {
    lados[i]=-lados[i];            
}


Arrays.sort(lados); 


for(int i=0; i<3; i++){
    lados[i] =-lados[i];
}        
if(lados[0]>= lados[1]+lados[2]){
   System.out.println("NAO FORMA TRIANGULO");

}else if((lados[0]*lados[0]) == (lados[1]*lados[1])+(lados[2]*lados[2])){
    System.out.println("TRIANGULO RETANGULO");

}else if((lados[0]*lados[0])>(lados[1]*lados[1])+(lados[2]*lados[2])){
    System.out.println("TRIANGULO OBTUSANGULO");

}else if((lados[0]*lados[0])<(lados[1]*lados[1])+(lados[2]*lados[2])){
    System.out.println("TRIANGULO ACUTANGULO"); 

}

if(lados[0] >= lados[1]+lados[2]){

}else if( lados[0] == lados[1] && lados[0] == lados[2]){
    System.out.println("TRIANGULO EQUILATERO");

}else if(lados[0] == lados[1] || lados[1] == lados[2] || lados[2] == lados[0]){
    System.out.println("TRIANGULO ISOSCELES");
}else{
    System.out.println("");
}
    }
}
