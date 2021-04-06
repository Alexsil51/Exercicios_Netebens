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
public class Aula40 {
    
    
    public static void main(String[] args) {
        
        int[]abc = {1,2,3,4,5};
        int xyz = 10;
        
        vetor(abc);
        variavelPrimitiva(xyz);
        
        
        System.out.println(abc[0]);
        System.out.println(xyz);
    }
    
    public static void vetor(int[]x){
        
        x[0] = 200;
                
    }
    
    public static void variavelPrimitiva(int x){
        
        x = 200;
    }
    
}
