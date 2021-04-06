/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula42;

/**
 *
 * @author Alex
 */
public class Aula42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV televisao1 = new TV();
        
        System.out.println("Esta Televisao é da marca" + televisao1.fabricante + ".A televisão esta " +
                (televisao1.ligado == true ? "ligada" : "desligada") + ". O volume é " + televisao1.volume);
        
        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.aumentarVolume();
        
        System.out.println("Esta Televisao é da marca" + televisao1.fabricante + ".A televisão esta " +
                (televisao1.ligado == true ? "ligada" : "desligada") + ". O volume é " + televisao1.volume);
    }
    
}
