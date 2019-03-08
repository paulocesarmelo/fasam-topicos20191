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
public class Comissionado extends Empregado{
    
    private double taxaComissao, totalVenda;
    
    public Comissionado(String nome) {
        super(nome);
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public String toString() {
        return "Comissionado{" + "taxaComissao=" + taxaComissao + ", totalVenda=" + totalVenda + '}';
    }

    @Override
    public double vencimento() {
        return this.totalVenda * this.taxaComissao;
    }
    
    
    
}
