package aula2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulocesarmelo
 */
public class Funcionario {
    
    //atributos
    private String nome, cargo, dpto;
    private int mat;
    private double salario;
    private Horario horario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
    public double calcularSalario(){
        //TODO (calculo do salario)
        if(cargo.equals("Analista")){
            salario = 5000;
        }else{
            salario = 2500;
        }
        
        
        return salario;
    }
    
    public Horario calcularHorasT(Horario hEntrada, Horario hSaida){
        //TODO
        Horario horasT = new Horario();
        
        horasT.setHora(hSaida.getHora() - hEntrada.getHora());
        
        return horasT;
    }
    
    public void gerarFolha(int diasT){
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Dias Trabalhado: "+diasT);
        System.out.println("Salario: "+(diasT*320));
    }
    
}
