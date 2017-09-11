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
public class Venta {
    
    private Producto[] productos;
    private float precio;
    private Date fechaVenta;
    
    public Venta(Producto[] productos, float precio, Date fechaVenta){
        this.productos = productos;
        this.precio = precio;
        this.fechaVenta = fechaVenta;       
    }
    
    public Producto[] getProductos(){
        return this.productos;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public Date getfechaVenta(){
        return this.fechaVenta;
    }
    
    public void setProductos(Producto[] productos){
        this.productos = productos;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public void fechaVenta(Date fecha){
        this.fechaVenta = fecha;
    }    
    
    
}
