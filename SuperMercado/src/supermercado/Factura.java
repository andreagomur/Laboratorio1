/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Date;

/**
 *
 * @author Amndre
 */
public class Factura {
    
    private long codigo;
    private String nombreProveedor ;
    private Producto[] productos;
    private float precio;
    private Date plazo;
    private String estado;


    public Factura(long codigo, String nombreProveedor, Producto[] productos, float precio, Date plazo, String estado){
        
        this.codigo = codigo;
        this.nombreProveedor = nombreProveedor;
        this.productos=productos;
        this.precio=precio;
        this.plazo = plazo;
        this.estado = estado;
    }

    public long getCodigo(){
        return this.codigo;
    }    
    
    public String getNombreProveedor(){
        return this.nombreProveedor;
    }
    
    public Producto[] getProductos(){
        return this.productos;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public Date getPlazo(){
        return this.plazo;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
}
