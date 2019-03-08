/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Date;

/**
 *
 * @author paulocesarmelo
 */
public class XPTO {
    
    int atr1, atr2;
    
    //Construtor padrão
    public XPTO(){
        this.atr1 = 0;
        this.atr2 = 0;
    }
    
    //Construtor personalizado
    public XPTO(int atr1, int atr2){
        this.atr1 = atr1;
        this.atr2 = atr2;
    }
    
    //Sobrecarga de método
    
    public void metodo1(int x){
        System.out.println(x);
    }
    
    public void metodo1(String y){
        System.out.println(y);
    }
    
    
}
