
package com.mycompany.hospital;


public class Usuario {
    
    private int id;
    private String nombre;
    private String cui;
    private String codigo;
    private double salario;
    
    private double irtra;
    private double igss;
    private String tipo;
    private int jefe;
    
    public Usuario(){
        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCui(String cui){
        this.cui = cui;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void setIrtra(double irtra){
        this.irtra = irtra;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCui(){
        return cui;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public double getSalario(){
        return salario;
    }
}
