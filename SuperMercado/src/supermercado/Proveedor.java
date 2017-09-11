/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Andre
 */
public class Proveedor {
    
    private String nombre;
    private Producto[] productos;
    private Factura[] facturas;
    
    public Proveedor(String nombre, Producto[] productos, Factura[] facturas){
        this.nombre = nombre;
        this.productos = productos;
        this.facturas = facturas;                
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Producto[] getProductos(){
        return this.productos;        
    }
    
    public Factura[] getFacturas(){
        return this.facturas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setProductos(Producto[] productos){
        this.productos = productos;        
    }
    
    public void setFacturas(Factura[] facturas){
        this.facturas = facturas;
    }


    
}
