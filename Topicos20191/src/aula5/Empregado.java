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
public abstract class Empregado {
    
    private String nome, sobrenome;
    private int cpf;
    
    //Construtor
    public Empregado(String nome){
        this.nome = nome;
    }
    
    public Empregado(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + '}';
    }
    
    public abstract double vencimento();
    
}
