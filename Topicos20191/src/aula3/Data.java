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
public class Data {
    
    private int dia, mes, ano;
    
    //construtor padrão
    public Data(){
        dia = 0;
        mes = 0;
        ano = 0;
    }
    //construtor personalizado
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void imprimirData(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
    
}
