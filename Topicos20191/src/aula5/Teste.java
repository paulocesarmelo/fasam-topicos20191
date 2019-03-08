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
public class Teste {
    
    public static void main(String[] args) {
        
        Assalariado emp1 = new Assalariado("Fulano");
        Comissionado emp2 = new Comissionado("Beltrano");
        
        emp1.setSobrenome("da Silva");
        emp1.setCpf(123456);
        emp1.setSalario(3500);
        
        
        emp2.setSobrenome("da Silva");
        emp2.setCpf(234879);
        emp2.setTaxaComissao(0.1);
        emp2.setTotalVenda(10000);
        
        System.out.println(emp1.vencimento());
        System.out.println(emp2.vencimento());
        
        
        
        
        
        
    }
    
}
