/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author paulocesarmelo
 */
public class Conta {
    
    // atributos: dono, saldo, limite, tipo, num, agencia
    // metodos: sacar(valor), depositar(valor), transferir(valor, contaDestino)
    // permitir criar a classe de 2 formas (2 construtores): padrão e um com os parametros
    // (dono, num, agencia, saldo)
    
    private String dono;
    private int num, agencia;
    private double saldo;
    
    //construtor padrão
    public Conta(){
        
    }
    
    //construtor sobrecarregado
    public Conta(String dono, int num, int agencia, double saldo){
        this.dono = dono;
        this.num = num;
        this.saldo = saldo;
    }
    
    public void transferir(Conta destino, double valor){
        
    }
    
}
