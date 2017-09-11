/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Date;

/**
 *
 * @author Andre
 */
public class Empleado {
 
    private String nombre;
  
    private String[] diasTrabajo;
    private int horaEntrada;
    private int horaSalida;
    private int horaEntradaActual;
    private int horaSalidaActual;   
    private float salario;
    private int horasTrabajadas;
    

    public Empleado(String nombre, String[] diasTrabajo, int horaEntrada, int horaSalida, int horaEntradaActual, int horaSalidaActual, float salario, int horasTrabajadas){
        this.nombre = nombre;
        this.diasTrabajo = diasTrabajo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horaEntradaActual = horaEntradaActual;
        this.horaSalidaActual = horaSalidaActual;
        
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;        
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public String[] getDiasTrabajo(){
        return this.diasTrabajo;
    }
    
    public int getHoraEntrada(){
        return this.horaEntrada;
    }
    
    public int getHoraSalida(){
        return this.horaSalida;
    }
    
    public int getHoraEntradaActual(){
        return this.horaEntradaActual;
    }
    
    public int getHoraSalidaActual(){
        return this.horaSalidaActual;
    }  
    
    public float getSalario(){
        return this.salario;
    }
    
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;       
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setSalario(float salario){
            this.salario = salario;
    }
    
    public void setHorasTrabajadas(int horas){
        this.horasTrabajadas = horas;
    }

    public void setDiasTrabajo(String[] dias){
        this.diasTrabajo = dias;
    }
    
    public void setHoraEntrada(int hora){
        this.horaEntrada = hora;
    }
    
    public void setHoraSalida(int hora){
        this.horaSalida = hora;
    }
    
    public void setHoraEntradaActual(int hora){
        this.horaEntradaActual = hora;
    }
    
    public void setHoraSalidaActual(int hora){
        this.horaSalidaActual = hora;
    }    
    
    
}
