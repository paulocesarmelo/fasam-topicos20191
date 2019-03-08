/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author paulocesarmelo
 */
public class TesteFormaGeometrica {
    
    public static void main(String[] args) {
        
        Quadrado x = new Quadrado();
        
        x.setBase(2);
        x.setAltura(2);
        
        System.out.println(x.area());
        
        x.imprimir(); // o que será impresso?
        
    }
    
}
