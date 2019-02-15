package aula2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario func = new Funcionario();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome do funcionario: ");
        func.setNome(input.nextLine());
        
        System.out.println("Informe o cargo: ");
        func.setCargo(input.nextLine());
        //atributos
        
        func.calcularSalario();
        
        System.out.println("Salario = "+func.getSalario());
        
        Horario hEntrada = new Horario();
        Horario hSaida = new Horario();
        
        hEntrada.setHora(8);
        
        hSaida.setHora(12);
        hSaida.setMinuto(30);
        
        Horario horasX = func.calcularHorasT(hEntrada, hSaida);
        System.out.println("Horas Trabalhadas: "+horasX.getHora()+":"+horasX.getMinuto());
        
        func.gerarFolha(20);
        
    }
    
}
