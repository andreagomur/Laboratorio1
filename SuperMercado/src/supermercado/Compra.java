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
public class Compra {
 
    private Producto[] productos;
    private float costo;
    private Date fechaCompra;
    
    public Compra(Producto[] productos, float costo, Date fechaCompra){
        this.productos = productos;
        this.costo = costo;
        this.fechaCompra = fechaCompra;             
    }
    
    public Producto[] getProductos(){
        return this.productos;
    }
    
    public float getCosto(){
        return this.costo;
    }
    
    public Date getFechaCompra(){
        return this.fechaCompra;
    }
    
    public void setProductos(Producto[] productos){
        this.productos = productos;
    }
    
    public void setCosto(float costo){
        this.costo = costo;
    }
    
    public void setFechaCompra(Date fecha){
        this.fechaCompra = fecha;
    }
        
    
}
