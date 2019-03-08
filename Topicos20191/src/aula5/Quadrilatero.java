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
public class Quadrilatero extends FormaGeometrica{

    private double base, altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    public double area() {
        return this.base * this.altura;
    }

  
    public double perimetro() {
        return this.base*2 + this.altura*2;
    }
    
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Quadrilatero");
    }
    
    
}
