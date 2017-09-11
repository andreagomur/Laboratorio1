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
public class Producto {
 
    private long iD;
    private String nombre;
    private int cantidad;
    private float costo;
    private float precio;
    private Date expiracion;
    private Date fechaCompra;

    
public Producto(long iD, String nombre, int cantidad, float costo, float precio, Date expiracion, Date fechaCompra){
    this.iD = iD;
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.costo = costo;
    this.precio = precio;
    this.expiracion = expiracion;
    this.fechaCompra = fechaCompra;
    
}    
    
public long getId(){
    return this.iD;
}

public String getNombre(){
    return this.nombre;
}

public int getCantidad(){
    return this.cantidad;
}
    
public float getCosto(){
    return this.costo;
}

public float getPrecio(){
    return this.precio;
}

public Date getExpiracion(){
    return this.expiracion;
}

public Date getFechaCompra(){
    return this.fechaCompra;
}

public void setId(long id){
    this.iD = id;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setCantidad(int cantidad){
    this.cantidad = cantidad;
}
    
public void setCosto(float costo){
    this.costo = costo;
}

public void getPrecio(float precio){
    this.precio = precio;
}


public void setExpiracion(Date expiracion){
    this.expiracion = expiracion;
}

public void setFechaCompra(Date fechaCompra){
    this.fechaCompra = fechaCompra;
}

}

