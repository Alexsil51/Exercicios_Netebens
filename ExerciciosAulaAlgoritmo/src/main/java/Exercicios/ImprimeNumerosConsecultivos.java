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
public class ImprimeNumerosConsecultivos {
    
    
    public static void main(String[] args) {
        
        int b, z = 0, x = 0, a = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		

		    System.out.print("\nInforme o valor de A: ");
		    a = entrada.nextInt();
		    
		    System.out.print("\nInforme o valor de B: ");
		    b = entrada.nextInt();
		        
		  
		   
		    
		   
		    if (a > 0){ for (int i = 0; i <= a+1; i++); 
		    x = a;
            z = x+a;
            a++;
		    }
		                   
		            
		    
		    if  (a < 0){ for (int i = 0; i <= a+1; i--); 
		    x = a;
            z = x+a;
            a--;
		    	
		    }
		    
		   
		    

		    if  (b > 0){ for (int i = 0; i <= b+1; i++); 
		    x = b;
            z = x+b;
            b++;
		    	
		    }
		    
		    if  (b < 0){ for (int i = 0; i <= b+1; i--); 
		    x = b;
            z = x+b;
            b--;
		   
		    }
		        System.out.println("\nResultado A: "+ a +"\nResultado B: "+ b);
		    
		}
}