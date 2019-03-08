/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author paulocesarmelo
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        //String nomeTemp = entrada.nextLine();
        
        f1.setNome(entrada.nextLine());
        
        f1.setSalario(1000);
        f1.setDpto("TI");
        
        System.out.println("Informe a data de entrada (dia, mes e ano):");
        
        Data dtEntrada = new Data();
        dtEntrada.setDia(entrada.nextInt());
        dtEntrada.setMes(entrada.nextInt());
        dtEntrada.setAno(entrada.nextInt());
        
        f1.setDataEntrada(dtEntrada);
        
        f1.imprimirFuncionario(); 
        
    }
}
