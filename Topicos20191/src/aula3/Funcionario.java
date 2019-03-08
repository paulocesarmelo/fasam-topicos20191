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
public class Funcionario {
    
    private String nome, dpto, rg;
    private double salario;
    private Data dataEntrada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void recebeAumento(double percent){
        salario = salario + (salario * percent);
    }
    
    public void imprimirFuncionario(){
        System.out.println("Nome: "+nome);
        System.out.println("Depto: "+dpto);
        System.out.print("Data de Entrada: ");
        dataEntrada.imprimirData();
        System.out.println("Salario: "+salario);
    }
}
