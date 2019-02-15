package aula1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Conta {
    
    private int num, agencia;
    private double saldo, limite;
    private String proprietario;
    
    
    public void setSaldo(double valor){
        saldo = valor;
    }
    
    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;            
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void transferir(double valor, Conta destino){
        sacar(valor);
        destino.depositar(valor);
    }
    
    
    
}
