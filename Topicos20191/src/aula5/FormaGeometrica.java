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
public abstract class FormaGeometrica {
    
    public abstract double area();
    public abstract double perimetro();
    
    public void imprimir(){
        System.out.println("FormaGeometrica");
    }
    
}
