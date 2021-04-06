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
public class TV {
    
    String fabricante = "Sony";
int polegadas = 32;
int volume = 0;
int canal = 1;
boolean ligado = false;
    
public void aumentarVolume(){
    if(volume >=10){
        return;
    }
    volume++;
}

public void diminuirVolume(){
    if(volume <=10){
        return;
    }
    volume--;
}

public void ligar(){
    ligado = true;
    }
public void desligar(){
    ligado = false;
}
}